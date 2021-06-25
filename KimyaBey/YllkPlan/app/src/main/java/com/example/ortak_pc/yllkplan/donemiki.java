package com.example.ortak_pc.yllkplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class donemiki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donemiki);
    }

    int sinifno = 0;
    String donem = "II";
    public void aylaragit(View view)
    {
        sinifno = 10;
        Intent i = new Intent(donemiki.this, donemoneaylar.class);
        i.putExtra("donem",donem);
        i.putExtra("sinif",sinifno);
        startActivity(i);
    }

    public void aylaragit1(View view)
    {
        sinifno = 11;
        Intent i = new Intent(donemiki.this, donemoneaylar.class);
        i.putExtra("donem",donem);
        i.putExtra("sinif",sinifno);
        startActivity(i);
    }

    public void aylaragit2(View view)
    {
        sinifno = 9;
        Intent i = new Intent(donemiki.this, donemoneaylar.class);
        i.putExtra("donem",donem);
        i.putExtra("sinif",sinifno);
        startActivity(i);
    }

    public void aylaragit3(View view)
    {
        sinifno = 12;
        Intent i = new Intent(donemiki.this, donemoneaylar.class);
        i.putExtra("donem",donem);
        i.putExtra("sinif",sinifno);
        startActivity(i);
    }
}
