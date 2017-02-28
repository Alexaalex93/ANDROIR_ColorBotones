package com.example.cice.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> items = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            items.add("Elemento " + (i+1));
        ArrayAdapter<String> aItems = new ArrayAdapter<String>(this, R.layout.item_simple, items);
        ListView lvTest = (ListView) findViewById(R.id.lvTest);
        lvTest.setAdapter(aItems);
    }
}
