package com.example.daily_issue.login.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Getter
@NoArgsConstructor
public class User extends BaseUser {

    @Column
    private String name;

    @Column
    private String status;

    @Column
    private String birthday;

    @Column
    private String phoneNumber;

    public User(String id, String pw, String s, String status, String birthday, String phoneNumber) {
        super(id, pw);
        this.name = s;
        this.status = status;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + getId() + '\'' +
                "userId='" + getUserId() + '\'' +
                "password= " + getPassword() + '\'' +
                "name='" + name + '\'' +
                "status='" + status + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
