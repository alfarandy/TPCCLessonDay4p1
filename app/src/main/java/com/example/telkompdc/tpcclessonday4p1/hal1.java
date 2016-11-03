package com.example.telkompdc.tpcclessonday4p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hal1 extends AppCompatActivity {
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal1);

        Button nextPageOne = (Button) findViewById(R.id.next_page1);
        Button backPageOne = (Button) findViewById(R.id.back_page1);

        //intent mulai dari sini
        Intent intent = getIntent();
        String parcelText = intent.getStringExtra("textMain");
        output = (TextView) findViewById(R.id.output1) ;
        output.setText(parcelText);
        //berakhir disini sampai tampilan ke textview


        nextPageOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal1.this, hal2.class);
                startActivity(intent);
            }
        });
        backPageOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal1.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
