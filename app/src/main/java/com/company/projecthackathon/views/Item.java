package com.company.projecthackathon.views;

import com.company.projecthackathon.R;

public class Item {
    private String title;
    private String description;
    public boolean isLiked;
    private int id;

    private int route_picture_resource;
    public int heart_picture_resource = R.drawable.love;

    public Item(String title, String description, int route_picture_resource, boolean isLiked, int heart_picture_resource, int id) {
        this.title = title;
        this.description = description;
        this.route_picture_resource = route_picture_resource;
        this.isLiked = isLiked;
        this.heart_picture_resource = heart_picture_resource;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRoute_picture_resource() {
        return route_picture_resource;
    }

    public void setRoute_picture_resource(int route_picture_resource) {
        this.route_picture_resource = route_picture_resource;
    }

    public void addToFavourites() {
        isLiked = !isLiked;
    }

    public int getHeart_picture_resource() {
        return heart_picture_resource;
    }

    public void setHeart_picture_resource(int heart_picture_resource) {
        this.heart_picture_resource = heart_picture_resource;
    }
}
