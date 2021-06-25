package com.example.ortak_pc.yllkplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class donemone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donemone);
    }

    int sinifno = 0;
    String donem = "I";
    public void aylaragit10(View view)
    {
        sinifno = 10;
        Intent i = new Intent(donemone.this, donemoneaylar.class);
        i.putExtra("donem",donem);
        i.putExtra("sinif",sinifno);
        startActivity(i);
    }

    public void aylaragit11(View view)
    {
        sinifno = 11;
        Intent i = new Intent(donemone.this, donemoneaylar.class);
        i.putExtra("donem",donem);
        i.putExtra("sinif",sinifno);
        startActivity(i);
    }

    public void aylaragit9(View view)
    {
        sinifno = 9;
        Intent i = new Intent(donemone.this, donemoneaylar.class);
        i.putExtra("donem",donem);
        i.putExtra("sinif",sinifno);
        startActivity(i);
    }

    public void aylaragit12(View view)
    {
        sinifno = 12;
        Intent i = new Intent(donemone.this, donemoneaylar.class);
        i.putExtra("donem",donem);
        i.putExtra("sinif",sinifno);
        startActivity(i);
    }
}
