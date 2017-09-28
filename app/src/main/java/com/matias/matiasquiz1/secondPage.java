package com.matias.matiasquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class secondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        ImageView icon = (ImageView)findViewById(R.id.ivIcon);
        TextView codename = (TextView)findViewById(R.id.tvCodename);
        TextView version = (TextView)findViewById(R.id.tvVersion);
        TextView api = (TextView)findViewById(R.id.tvApi);
        TextView date = (TextView)findViewById(R.id.tvDate);

        icon.setImageResource(R.drawable.marshmallow);
        codename.setText("Codename: Marshmallow");
        version.setText("Version: 6.0");
        api.setText("API: 23");
        date.setText("Release Date: October 5, 2015");
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
