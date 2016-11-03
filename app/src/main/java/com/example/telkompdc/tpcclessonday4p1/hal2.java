package com.example.telkompdc.tpcclessonday4p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hal2 extends AppCompatActivity {
    private EditText textPage3;
    private String editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal2);

        Button backPageTwo = (Button) findViewById(R.id.back_page2);

        textPage3 = (EditText) findViewById(R.id.editText2);

        backPageTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal2.this, hal1.class);
                editText = textPage3.getText().toString();
                intent.putExtra("textMain", editText);
                startActivity(intent);
            }
        });
    }
}
