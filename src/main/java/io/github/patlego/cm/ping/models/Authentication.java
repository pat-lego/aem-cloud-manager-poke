package io.github.patlego.cm.ping.models;

import io.github.patlego.cm.ping.enums.AuthType;

public class Authentication {

    private AuthType authType;
    private String username;
    private String password;

    public AuthType getAuthType() {
        return authType;
    }
    public void setAuthType(AuthType authType) {
        this.authType = authType;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}