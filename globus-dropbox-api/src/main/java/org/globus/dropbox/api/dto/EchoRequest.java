package org.globus.dropbox.api.dto;


public class EchoRequest {

    private String request;

    public EchoRequest() {

    }

    public EchoRequest(String request) {
        this.setRequest(request);
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
}
