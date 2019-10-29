package com.dku.springstudy.model;

public class UserVO {

    private final String id = "Oh";
    private final String password = "Donggeon";

    private String userId;
    private String userPassword;

    public String getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
