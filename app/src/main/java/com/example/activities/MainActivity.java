package com.example.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button = findViewById(R.id.buttonSend);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent message = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(message);

                EditText editText = (EditText) findViewById(R.id.editTextLogin);
                final String afficheText = editText.getText().toString();

                Toast.makeText(MainActivity.this, afficheText, Toast.LENGTH_SHORT).show();

            }

        });


        }

}














