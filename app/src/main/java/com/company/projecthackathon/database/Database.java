package com.company.projecthackathon.database;

import java.util.ArrayList;

public class Database {
    private static String name;
    private static String email;
    private static String password;
    private static ArrayList<String> favourites;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Database.name = name;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Database.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Database.password = password;
    }

    public static ArrayList<String> getFavourites() {
        return favourites;
    }

    public static void setFavourites(ArrayList<String> favourites) {
        Database.favourites = favourites;
    }
}
