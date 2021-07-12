package com.bryanlim.userscrudproject.model;

import com.google.gson.annotations.SerializedName;

public class PostPutDelUser {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    String user;
    @SerializedName("message")
    String message;

    public String getStatus(){
        return status;
    }
    public String getMessage(){
        return message;
    }

    public String getUser() {
        return user;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
