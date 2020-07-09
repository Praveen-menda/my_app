package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);
        ArrayList<String> myFamily= new ArrayList<String>();
        myFamily.add("Praveen");
        myFamily.add("Saroj");
        myFamily.add("Sumitra");
        myFamily.add("Shrawan");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>("this",android.R.layout.simple_list_item_1,myFamily);
    }
}
