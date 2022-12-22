package com.example.petramobile20_uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    ImageView btBackWhiteLogin;
    EditText nrpLogin, passwordLogin;
    Button btLogin;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btBackWhiteLogin = (ImageView) findViewById(R.id.btBackWhiteLogin);
        nrpLogin = (EditText)findViewById(R.id.nrpLogin);
        passwordLogin = (EditText)findViewById(R.id.passwordLogin);
        btLogin = (Button)findViewById(R.id.btLogin);

        dbHelper = new DBHelper(this);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nrp = nrpLogin.getText().toString().trim();
                String password = passwordLogin.getText().toString().trim();

                Boolean res = dbHelper.checkUser(nrp,password);
                if(res == true){
                    Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, PageActivity.class));
                }else {
                    Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btBackWhiteLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });
    }
}