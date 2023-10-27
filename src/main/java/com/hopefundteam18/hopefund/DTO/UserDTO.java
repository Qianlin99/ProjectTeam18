package com.hopefundteam18.hopefund.DTO;

//import jakarta.persistence.Column;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;

import javax.persistence.Column;

public class UserDTO {

    private String userType;
    private String username;
    private String password;
    private String email;
    private String contactNum;

    public UserDTO(int id, String userType, String username, String password, String email, String contactNum) {
        this.userType = userType;
        this.username = username;
        this.password = password;
        this.email = email;
        this.contactNum = contactNum;
    }

    public UserDTO() {
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                ", userType='" + userType + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", contactNum='" + contactNum + '\'' +
                '}';
    }
}
