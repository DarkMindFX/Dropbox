package org.globus.users.api.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class UserDto {

    private Long id;
    private String login;
    private String pwd_hash;

    public UserDto() {
    }

    public UserDto(Long id, String login, String pwd_hash) {
        this.login = login;
        this.pwd_hash = pwd_hash;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd_hash() {
        return pwd_hash;
    }

    public void setPwd_hash(String pwd_hash) {
        this.pwd_hash = pwd_hash;
    }
}
