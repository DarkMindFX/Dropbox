package org.globus.users.api.dal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Session {

    private @Id @GeneratedValue Long Id;
    private Long userId;
    private String sessionToken;
    private Date sessionStart;
    private Date sessionEnd;
    private boolean isActive;

    public Session() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public Date getSessionStart() {
        return sessionStart;
    }

    public void setSessionStart(Date sessionStart) {
        this.sessionStart = sessionStart;
    }

    public Date getSessionEnd() {
        return sessionEnd;
    }

    public void setSessionEnd(Date sessionEnd) {
        this.sessionEnd = sessionEnd;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
