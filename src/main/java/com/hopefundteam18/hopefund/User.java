package com.hopefundteam18.hopefund;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "USER_TYP")
    private String userType;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWD")
    private String passwd;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CONTACT_NUMBER")
    private String contactNum;

}
