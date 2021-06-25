package com.example.ortak_pc.yllkplan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class donemoneaylar extends AppCompatActivity {

    String donem = "";
    int sinifno = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donemoneaylar);

        Intent i = getIntent();
        donem = i.getStringExtra("donem");
        sinifno = i.getIntExtra("sinif",0);

        TextView tv = (TextView) findViewById(R.id.textView4);
        tv.setText((donem+". Dönem "+sinifno+". Sınıf").toString());

        String[] Iaylar = new String[5];
        Iaylar[0] = "Eylül";
        Iaylar[1] = "Ekim";
        Iaylar[2] = "Kasım";
        Iaylar[3] = "Aralık";
        Iaylar[4] = "Ocak";

        String[] IIaylar = new String[5];
        IIaylar[0] = "Şubat";
        IIaylar[1] = "Mart";
        IIaylar[2] = "Nisan";
        IIaylar[3] = "Mayıs";
        IIaylar[4] = "Haziran";

        Button ay1 = (Button) findViewById(R.id.button11);
        Button ay2 = (Button) findViewById(R.id.button12);
        Button ay3 = (Button) findViewById(R.id.button13);
        Button ay4 = (Button) findViewById(R.id.button14);
        Button ay5 = (Button) findViewById(R.id.button15);

        if (donem.equals("I"))
        {
            ay1.setText(Iaylar[0]);
            ay2.setText(Iaylar[1]);
            ay3.setText(Iaylar[2]);
            ay4.setText(Iaylar[3]);
            ay5.setText(Iaylar[4]);
        }
        else if (donem.equals("II"))
        {
            ay1.setText(IIaylar[0]);
            ay2.setText(IIaylar[1]);
            ay3.setText(IIaylar[2]);
            ay4.setText(IIaylar[3]);
            ay5.setText(IIaylar[4]);
        }
    }
    Intent i3 = getIntent();

    int ayno = 0;

    public void planagit(View view)
    {
        ayno = 1;
        Intent i4 = new Intent(donemoneaylar.this, haftalar.class);
        i4.putExtra("donem1",donem);
        i4.putExtra("ayno",ayno);
        i4.putExtra("sinif1",sinifno);
        startActivity(i4);
    }

    public void planagit1(View view)
    {
        ayno = 2;
        Intent i5 = new Intent(donemoneaylar.this, haftalar.class);
        i5.putExtra("donem1",donem);
        i5.putExtra("ayno",ayno);
        i5.putExtra("sinif1",sinifno);
        startActivity(i5);
    }

    public void planagit2(View view)
    {
        ayno = 3;
        Intent i6 = new Intent(donemoneaylar.this, haftalar.class);
        i6.putExtra("donem1",donem);
        i6.putExtra("ayno",ayno);
        i6.putExtra("sinif1",sinifno);
        startActivity(i6);
    }

    public void planagit3(View view)
    {
        ayno = 4;
        Intent i7 = new Intent(donemoneaylar.this, haftalar.class);
        i7.putExtra("donem1",donem);
        i7.putExtra("ayno",ayno);
        i7.putExtra("sinif1",sinifno);
        startActivity(i7);
    }

    public void planagit4(View view)
    {
        ayno = 5;
        Intent i8 = new Intent(donemoneaylar.this, haftalar.class);
        i8.putExtra("donem1",donem);
        i8.putExtra("ayno",ayno);
        i8.putExtra("sinif1",sinifno);
        startActivity(i8);
    }
}
