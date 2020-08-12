package org.globus.users.api.exceptions;

public class UserNotFoundException extends Exception {

    private Long id;
    private String login;

    public UserNotFoundException(Long id, String login) {
        super(String.format("User [id: %d, login: %s] not found", id, login));
        this.id = id;
        this.login = login;
    }

}
