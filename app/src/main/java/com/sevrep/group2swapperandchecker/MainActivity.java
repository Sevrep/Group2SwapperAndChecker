package com.sevrep.group2swapperandchecker;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtOne;
    private EditText edtTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSwap = findViewById(R.id.buttonSwap);
        Button buttonCheck = findViewById(R.id.buttonCheck);
        edtOne = findViewById(R.id.edtOne);
        edtTwo = findViewById(R.id.edtTwo);

        buttonSwap.setOnClickListener(v -> {
            String one = edtOne.getText().toString().trim();
            String two = edtTwo.getText().toString().trim();
            edtOne.setText(two);
            edtTwo.setText(one);
        });
        buttonCheck.setOnClickListener(v -> {
            String oneCheck = edtOne.getText().toString().trim();
            String twoCheck = edtTwo.getText().toString().trim();
            if (!oneCheck.equals(twoCheck)) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
                finish();
            }
        });

    }
}