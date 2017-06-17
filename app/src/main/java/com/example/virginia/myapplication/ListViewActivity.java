package com.example.virginia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ListView listView = (ListView) findViewById(R.id.listViewComponent);
        List<String> elements = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            elements.add("Item " + i);
        }
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.test_list_item, elements));
    }
}
