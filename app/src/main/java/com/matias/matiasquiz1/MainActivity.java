package com.matias.matiasquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] AndroidVersions = {"Lollipop","Marshmallow","Nougat"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.row_layout,AndroidVersions);

        ListView listView = (ListView) findViewById(R.id.lvVersions);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> list, View v, int pos, long id) {
                // Your code for item clicks
            }
        });

    }

    public void homeButton (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void page1Button (View view) {
        Intent intent = new Intent(this, firstPage.class);
        startActivity(intent);
    }

    public void page2Button (View view) {
        Intent intent = new Intent(this, secondPage.class);
        startActivity(intent);
    }

    public void page3Button (View view) {
        Intent intent = new Intent(this, thirdPage.class);
        startActivity(intent);
    }
}
