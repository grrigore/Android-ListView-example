package com.griogre.android.listview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView listView;
    Context context = MainActivity.this;
    ArrayList myList = new ArrayList();

    String[] position = new String[]{
            "1", "2", "3",
            "4", "5", "6"
    };


    String[] team = new String[]{
            "Manchester City", "Arsenal", "Manchester United",
            "Crystal Palace", "Liverpool", "Chelsea"
    };


    String[] matchesPlayed = new String[]{
            "12", "12", "12",
            "12", "12", "12"
    };

    String[] goals = new String[]{
            "50", "41", "3",
            "13", "36", "5"
    };

    String[] points = new String[]{
            "50", "41", "33",
            "23", "16", "5"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        getDataInList();
        listView.setAdapter(new ItemAdapter(context, myList));

    }

    private void getDataInList() {
        for (int i = 0; i < position.length; i++) {
            Item item = new Item();
            item.setPosition(position[i]);
            item.setTeam(team[i]);
            item.setMatchesPlayed(matchesPlayed[i]);
            item.setGoals(goals[i]);
            item.setPoints(points[i]);

            myList.add(item);
        }
    }
}
