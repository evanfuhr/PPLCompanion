package com.cometpenguinstudio.pplcompanion.model;

import android.content.Context;

import com.cometpenguinstudio.pplcompanion.R;

public class Leader {

    private long id;
    private String name;
    private String badgeName;
    private LeaderType type;

    public Leader() {}

    public Leader(long id, String name, String badgeName, LeaderType type) {
        this.id = id;
        this.name = name;
        this.badgeName = badgeName;
        this.type = type;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBadgeName() {
        return badgeName;
    }

    public void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }

    public LeaderType getType() {
        return type;
    }

    public void setType(LeaderType type) {
        this.type = type;
    }

    public String getPortrait() {
        return "portrait_" + this.id + ".png";
    }

    public int getBadge(Context context) {
        String image = "badge_" + this.id + ".png";
        return context.getResources().getIdentifier(image, "drawable", context.getPackageName());
    }
}
