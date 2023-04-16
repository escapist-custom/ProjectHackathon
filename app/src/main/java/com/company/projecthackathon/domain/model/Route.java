package com.company.projecthackathon.domain.model;

public class Route {

    private long id;

    private String name;

    private String link_photo;

    private String description;

    private String kilometrs;

    private String time;

    public Route(String name, String link_photo, String description, String kilometrs, String time) {
        this.name = name;
        this.link_photo = link_photo;
        this.description = description;
        this.kilometrs = kilometrs;
        this.time = time;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLink_photo(String link_photo) {
        this.link_photo = link_photo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setKilometrs(String kilometrs) {
        this.kilometrs = kilometrs;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLink_photo() {
        return link_photo;
    }

    public String getDescription() {
        return description;
    }

    public String getKilometrs() {
        return kilometrs;
    }

    public String getTime() {
        return time;
    }
}
