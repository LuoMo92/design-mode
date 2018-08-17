package com.luomo.study.design.patten.interpreter;

/**
 * @author LiuMei
 * @date 2018-08-17.
 */
public class Context {

    private String input;
    public String pInput;

    private String output;
    public String pOutput;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getpInput() {
        return pInput;
    }

    public void setpInput(String pInput) {
        this.pInput = pInput;
    }

    public String getpOutput() {
        return pOutput;
    }

    public void setpOutput(String pOutput) {
        this.pOutput = pOutput;
    }
}
