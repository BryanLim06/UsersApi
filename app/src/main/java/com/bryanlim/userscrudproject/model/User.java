package com.bryanlim.userscrudproject.model;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private String id;
    @SerializedName("Name")
    private String nama;
    @SerializedName("Email")
    private String email;
    public User(){}
    public User(String id, String nama, String email){
        this.id = id;
        this.nama = nama;
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return null;
    }

    public String getLast_name() {
        return null;
    }

    public String getAvatar() {
        return null;
    }
}
