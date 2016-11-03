package com.example.telkompdc.tpcclessonday4p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String editText;
    private EditText textMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextMain = (Button) findViewById(R.id.next_main);
        textMain = (EditText) findViewById(R.id.editText);


        nextMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, hal1.class);
                editText = textMain.getText().toString();
                intent.putExtra("textMain", editText);
                startActivity(intent);
            }
        });




    }
}
