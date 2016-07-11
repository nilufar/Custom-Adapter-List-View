package android.listview.parves.customadapter;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 11-7-16.
 */
public class Team {
    private String teamName;
    private int teamImageId;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamImageId() {
        return teamImageId;
    }

    public void setTeamImageId(int teamImageId) {
        this.teamImageId = teamImageId;
    }
    public Team(String teamName, int teamImageId) {
        this.teamName = teamName;
        this.teamImageId = teamImageId;
    }

    public Team() {
    }
    public ArrayList<Team>getAllTeam(){
        ArrayList<Team>teams=new ArrayList<>();
        teams.add(new Team("Angry Birds",R.drawable.angry));
        teams.add(new Team("Minions",R.drawable.minion));
        return teams;
    }
}
