package com.griogre.android.listview;

/**
 * Created by Cristi on 13-Dec-17.
 */

public class Item {

    private String position;
    private String team;
    private String matchesPlayed;
    private String goals;
    private String points;

    public Item() {
    }

    public Item(String position, String team, String matchesPlayed, String goals, String points) {
        this.position = position;
        this.team = team;
        this.matchesPlayed = matchesPlayed;
        this.goals = goals;
        this.points = points;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public String getMatchesPlayed() {
        return matchesPlayed;
    }

    public String getGoals() {
        return goals;
    }

    public String getPoints() {
        return points;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setMatchesPlayed(String matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Item{" +
                "position='" + position + '\'' +
                ", team='" + team + '\'' +
                ", matchesPlayed='" + matchesPlayed + '\'' +
                ", goals='" + goals + '\'' +
                ", points='" + points + '\'' +
                '}';
    }
}
