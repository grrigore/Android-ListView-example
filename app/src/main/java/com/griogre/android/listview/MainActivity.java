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

    String[] column1 = new String[]{
            "item1Column1", "item2Column1","item3Column1",
            "item4Column1", "item5Column1", "item6Column1"
    };


    String[] column2 = new String[]{
            "item1Column2", "item2Column2","item3Column2",
            "item4Column2", "item5Column2", "item6Column2"
    };


    String[] column3 = new String[]{
            "item1Column3", "item2Column3","item3Column3",
            "item4Column3", "item5Column3", "item6Column3"
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
        for (int i = 0; i < column1.length; i++){
            Item item = new Item();
            item.setColumn1(column1[i]);
            item.setColumn2(column2[i]);
            item.setColumn3(column3[i]);

            myList.add(item);
        }
    }
}
