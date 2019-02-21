package com.example.stupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button Submit;
    private EditText Email;
    private EditText Password;
    private int login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = findViewById(R.id.editText);
        Password = findViewById(R.id.editText2);
        Submit = findViewById(R.id.button);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitbtn(Email.getText().toString(), Password.getText().toString());

            }
        });
    }

    public void submitbtn (String userEmail, String userPassword) {
        if ((userEmail.equals("nischithanagendran@gmail.com") && userPassword.equals("12345"))) {
            Intent i = new Intent(MainActivity.this, display.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "Invalid user", Toast.LENGTH_SHORT).show();
        }
    }
private void setvalue() {
            SharedPreferences settings1 = getSharedPreferences("Beginning", 0);
            SharedPreferences.Editor editor1 = settings1.edit();
            editor1.putInt("SNOW DENSITY", 1);
            editor1.commit();
        }



        private void checkvalue() {
    SharedPreferences settings1 = getSharedPreferences("Beginning", 0);
    login = settings1.getInt("SNOW DENSITY", 0);

        }
}