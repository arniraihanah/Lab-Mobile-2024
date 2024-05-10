package com.example.praktikum6;

import java.util.List;


//untuk menyediakan akses ke data pengguna yang diterima dalam respons dari server API.
public class UserResponse {

    private List<User> data; //daftar yg diterima oleh API yg berupa objek2 user
    public List<User> getData() {
        return data;
    }
    public void setData(List<User> data) {
        this.data = data;
    }
}
