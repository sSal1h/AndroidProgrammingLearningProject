package com.example.ortak_pc.yllkplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Duzen extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duzen);
        final Spinner donem = (Spinner) findViewById(R.id.spinner);
        final Spinner sinif = (Spinner) findViewById(R.id.spinner2);
        final Spinner ay = (Spinner) findViewById(R.id.spinner3);
        final Spinner hafta = (Spinner) findViewById(R.id.spinner4);

        final String aylarbir[] = getResources().getStringArray(R.array.donembiray);
        final ArrayAdapter<String> aybiradp = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line, aylarbir);
        final String aylariki[] = getResources().getStringArray(R.array.donemikiay);
        final ArrayAdapter<String> ayikiadp = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line, aylariki);
        donem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                if (i == 0)
                {
                    ay.setAdapter(aybiradp);
                }
                if (i == 1)
                {
                    ay.setAdapter(ayikiadp);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            { }
        });
    }
    public void kaydet(View view)
    {
        Intent ip = new Intent(Duzen.this, planlar.class);



        final Spinner donem = (Spinner) findViewById(R.id.spinner);
        final Spinner sinif = (Spinner) findViewById(R.id.spinner2);
        final Spinner ay = (Spinner) findViewById(R.id.spinner3);
        final Spinner hafta = (Spinner) findViewById(R.id.spinner4);

        TextView tv1 = (TextView) findViewById(R.id.textView7);
        TextView tv2 = (TextView) findViewById(R.id.textView8);
        TextView tv3 = (TextView) findViewById(R.id.textView9);
        TextView tv4 = (TextView) findViewById(R.id.textView10);
        EditText ic1 = (EditText) findViewById(R.id.editText2);

        String baslik1 = "";
        String icerik1 = ic1.getText().toString();
        String baslik2 = "";
        String icerik2 = "";

        ip.putExtra("baslik1", baslik1);
        ip.putExtra("baslik2", baslik2);
        ip.putExtra("icerik1", icerik1);
        ip.putExtra("icerik2", icerik2);

    }
}