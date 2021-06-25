package com.example.ortak_pc.yllkplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class haftalar extends AppCompatActivity {

    String donem = "";
    int ayno = 0;
    int sinifno =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haftalar);

        TextView tv = (TextView) findViewById(R.id.textView5);

        Intent i10 = getIntent();
        donem = i10.getStringExtra("donem1");
        ayno = i10.getIntExtra("ayno",0);
        sinifno = i10.getIntExtra("sinif1",0);

        if (donem.equals("I"))
        {
            if (ayno == 1)
            {
                tv.setText((donem+". Dönem "+sinifno+". Sınıf Eylül Ayı").toString());
            }
            else if (ayno == 2)
            {
                tv.setText((donem+". Dönem "+sinifno+". Sınıf Ekim Ayı").toString());
            }
            else if (ayno == 3)
            {
                tv.setText((donem+". Dönem "+sinifno+". Sınıf Kasım Ayı").toString());
            }
            else if (ayno == 4)
            {
                tv.setText((donem+". Dönem "+sinifno+". Sınıf Aralık Ayı").toString());
            }
            else if (ayno == 5)
            {
                tv.setText((donem+". Dönem "+sinifno+". Sınıf Ocak Ayı").toString());
            }
        }
        else if (donem.equals("II"))
        {
            if (ayno == 1)
            {
                tv.setText((donem+". Dönem "+sinifno+". Sınıf Şubat Ayı").toString());
            }
            else if (ayno == 2)
            {
                tv.setText((donem+". Dönem "+sinifno+". Sınıf Mart Ayı").toString());
            }
            else if (ayno == 3)
            {
                tv.setText((donem+". Dönem "+sinifno+". Sınıf Nisan Ayı").toString());
            }
            else if (ayno == 4)
            {
                tv.setText((donem+". Dönem "+sinifno+". Sınıf Mayıs Ayı").toString());
            }
            else if (ayno == 5)
            {
                tv.setText((donem+". Dönem "+sinifno+". Sınıf Haziran Ayı").toString());
            }
        }
    }

    Intent i3 = getIntent();

    int haftano = 0;

    public void planagitlara(View view)
    {
        haftano = 1;
        Intent i4 = new Intent(haftalar.this, planlar.class);
        i4.putExtra("donem1",donem);
        i4.putExtra("ayno",ayno);
        i4.putExtra("sinif1",sinifno);
        i4.putExtra("hafta",haftano);
        startActivity(i4);
    }

    public void planagitlara1(View view)
    {
        haftano = 2;
        Intent i5 = new Intent(haftalar.this, planlar.class);
        i5.putExtra("donem1",donem);
        i5.putExtra("ayno",ayno);
        i5.putExtra("sinif1",sinifno);
        i5.putExtra("hafta",haftano);
        startActivity(i5);
    }

    public void planagitlara2(View view)
    {
        haftano = 3;
        Intent i6 = new Intent(haftalar.this, planlar.class);
        i6.putExtra("donem1",donem);
        i6.putExtra("ayno",ayno);
        i6.putExtra("sinif1",sinifno);
        i6.putExtra("hafta",haftano);
        startActivity(i6);
    }

    public void planagitlara3(View view)
    {
        haftano = 4;
        Intent i7 = new Intent(haftalar.this, planlar.class);
        i7.putExtra("donem1",donem);
        i7.putExtra("ayno",ayno);
        i7.putExtra("sinif1",sinifno);
        i7.putExtra("hafta",haftano);
        startActivity(i7);
    }
}
