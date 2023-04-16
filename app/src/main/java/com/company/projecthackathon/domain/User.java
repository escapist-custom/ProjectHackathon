package com.company.projecthackathon.domain;

import java.util.ArrayList;

public class User {
    private int id;
    private String email;
    private String name;
    private String password;
    private ArrayList<String> favourites;

    public User(int id, String email, String name, String password, ArrayList<String> favourites) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.favourites = favourites;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getFavourites() {
        return favourites;
    }

    public void setFavourites(ArrayList<String> favourites) {
        this.favourites = favourites;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
