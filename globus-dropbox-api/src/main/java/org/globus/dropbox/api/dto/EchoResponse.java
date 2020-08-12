package org.globus.dropbox.api.dto;

public class EchoResponse {

    private String response;

    public EchoResponse() {
        
    }

    public EchoResponse(String content) {
        this.setResponse(content);
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
