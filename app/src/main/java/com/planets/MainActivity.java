package com.planets;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView allPlanets;
    TextView toolBarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolBarTitle = findViewById(R.id.toolbar_title);
        allPlanets = findViewById(R.id.allPlanets);
        allPlanets.setAdapter(new AllPlanetAdapter());
        allPlanets.addItemDecoration(new ItemDecoration(10));
        allPlanets.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/pop.ttf");
        toolBarTitle.setTypeface(font);
    }
}
