package com.oyq.domain;

public class User {
    private String username;
    private String password;
    private String againPassword;
    private int sex;

    public User() {
    }

    public User(String username, String password, String againPassword, int sex) {
        this.username = username;
        this.password = password;
        this.againPassword = againPassword;
        this.sex = sex;
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

    public String getAgainPassword() {
        return againPassword;
    }

    public void setAgainPassword(String againPassword) {
        this.againPassword = againPassword;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + username + '\'' +
                ", password='" + password + '\'' +
                ", againPassword='" + againPassword + '\'' +
                ", sex=" + sex +
                '}';
    }
}
