package com.luomo.study.design.patten.template;

/**
 * @author LiuMei
 * @date 2018-11-28.
 */
public abstract class AbstractPageBuilder implements PageBuilder{

    private static final String DEFAULT_DOCTYPE = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";

    private static final String DEFAULT_XMLNS = "http://www.w3.org/1999/xhtml";

    private StringBuffer stringBuffer = new StringBuffer();

    /**
     *   将head标签的生成过程更加细化了，分成四个方法，title，meta，link和script。
     *   但是这四个里面appendTitle是模板方法，子类必须实现，而其它三个则是普通的空方法。
     *   那么上述三个方法，就是留给子类覆盖的，当然子类可以选择不覆盖，那么生成的HTML就没有meta，link和script这三种标签，
     *   如果想有的话，就可以覆盖其中任意一个
     * @return
     */
    @Override
    public String buildHtml() {
        stringBuffer.append(DEFAULT_DOCTYPE);
        stringBuffer.append("<html xmlns=\"" + DEFAULT_XMLNS + "\">");
        stringBuffer.append("<head>");
        appendTitle(stringBuffer);
        appendMeta(stringBuffer);
        appendLink(stringBuffer);
        appendScript(stringBuffer);
        stringBuffer.append("</head>");
        appendBody(stringBuffer);
        stringBuffer.append("</html>");
        return stringBuffer.toString();
    }

    protected void appendMeta(StringBuffer stringBuffer){
    }

    protected void appendLink(StringBuffer stringBuffer){
    }

    protected void appendScript(StringBuffer stringBuffer){
    }

    protected abstract void appendTitle(StringBuffer stringBuffer);

    protected abstract void appendBody(StringBuffer stringBuffer);

}
