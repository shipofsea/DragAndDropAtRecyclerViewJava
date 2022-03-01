package com.mstar.dragdropsample3;

/**
 * Created by Mstar on 02-28-2022.
 */

public class User {

    private int id;
    private String name;
    private String imageUrl;
    private String type;
    private Integer defaultStatus;

    public User(int id, String name, String imageUrl, String type, Integer defaultStatus) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.type = type;
        this.defaultStatus = defaultStatus;
    }

    public User(User user) {
        this.id = user.id;
        this.name = user.name;
        this.imageUrl = user.imageUrl;
        this.type = user.type;
        this.defaultStatus = user.defaultStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }
}
