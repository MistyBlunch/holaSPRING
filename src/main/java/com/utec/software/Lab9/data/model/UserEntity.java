package com.utec.software.Lab9.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity {

    @Id
    public String id;

    public String username;
    public String password;

    public UserEntity(String id, String usrname, String pass) {
        this.id = id;
        username = usrname;
        password = pass;
    }

    public UserEntity() {}
}
