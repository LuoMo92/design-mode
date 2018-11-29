package com.luomo.study.design.patten.composite.file;

/**
 * @author LiuMei
 * @date 2018-11-29.
 */
public class File  implements IFile{

    private String name;
    private IFile folder;

    public File(String name,IFile folder) {
        super();
        this.name = name;
        this.folder = folder;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void delete() {
        folder.deleteFile(name);
        System.out.println("---删除[" + name + "]---");
    }

    /**
     * 文件不支持创建新文件
     * @param name
     */
    @Override
    public void createNewFile(String name) {
        throw new UnsupportedOperationException();
    }

    /**
     * 文件不支持删除文件
     * @param name
     */
    @Override
    public void deleteFile(String name) {
        throw new UnsupportedOperationException();
    }

    /**
     * 文件不支持获取下面的文件列表
     * @param index
     * @return
     */
    @Override
    public IFile getIFile(int index) {
        throw new UnsupportedOperationException();
    }

}
