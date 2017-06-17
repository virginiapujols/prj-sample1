package com.example.virginia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        GridView gridView = (GridView) findViewById(R.id.gridViewComponent);
        List<String> elements = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            elements.add("Item " + i);
        }
        gridView.setAdapter(new ArrayAdapter<>(this, android.R.layout.test_list_item, elements));

    }
}
