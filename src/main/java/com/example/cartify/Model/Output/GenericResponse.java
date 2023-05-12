package com.example.cartify.Model.Output;

public class GenericResponse {
    private boolean status;
    private Object output;
    public GenericResponse (boolean status){
        this.output = null;
        this.status = status;
    }
    public GenericResponse (Object output){
        this.output= output;
        this.status = true;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Object getOutput() {
        return output;
    }

    public void setOutput(Object output) {
        this.output = output;
    }
}
