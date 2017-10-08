package com.example.katiegu.studybears;

/**
 * Created by katiegu on 10/7/17.
 */

public class UserInformation {
    private String name;
    private String email;
    private String school;
    private String password;

    public UserInformation() {

    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
