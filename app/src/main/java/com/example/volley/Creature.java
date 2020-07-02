package com.example.volley;

public class Creature {
    private String name;
    private String photo;
    private String likes;

    public Creature(String name, String photo, String likes) {
        this.name = name;
        this.photo = photo;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
