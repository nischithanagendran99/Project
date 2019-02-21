package com.example.stupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class                                                                                                                    display extends AppCompatActivity {
    private Button Logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Logout = findViewById(R.id.button2);
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(display.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
