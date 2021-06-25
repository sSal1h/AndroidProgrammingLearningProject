package com.example.ortak_pc.yllkplan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void donembirgit(View view)
    {
        Intent i = new Intent(MainActivity.this, donemone.class);
        startActivity(i);
    }

    public void donemikiyegit(View view)
    {
        Intent i2 = new Intent(MainActivity.this, donemiki.class);
        startActivity(i2);
    }

    public void duzenleyegit(View view)
    {
        Intent i3 = new Intent(MainActivity.this, duzenleme.class);
        startActivity(i3);
    }
}
