package com.example.petramobile20_uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class RegisActivity extends AppCompatActivity {

    ImageView btBackWhiteRegis;
    EditText nrpRegis, passwordRegis, passwordConfirm;
    Button btRegis;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);
        btBackWhiteRegis = (ImageView) findViewById(R.id.btBackWhiteRegis);
        btRegis = (Button)findViewById(R.id.btRegis);
        nrpRegis = (EditText)findViewById(R.id.nrpRegis);
        passwordRegis = (EditText)findViewById(R.id.passwordRegis);
        passwordConfirm = (EditText)findViewById(R.id.passwordConfirm);
        dbHelper = new DBHelper(this);

        btRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nrp = nrpRegis.getText().toString().trim();
                String password = passwordRegis.getText().toString().trim();
                String conPassword = passwordConfirm.getText().toString().trim();

                ContentValues values = new ContentValues();
                if (!password.equals(conPassword)){
                    Toast.makeText(RegisActivity.this, "Password not match", Toast.LENGTH_SHORT).show();
                }else if (password.equals("") || nrp.equals("")){
                    Toast.makeText(RegisActivity.this, "Username or Password cannot be empty", Toast.LENGTH_SHORT).show();
                }else {
                    values.put(DBHelper.row_nrp, nrp);
                    values.put(DBHelper.row_password, password);
                    dbHelper.insertData(values);

                    Toast.makeText(RegisActivity.this, "Register successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RegisActivity.this, MainActivity.class));
                    finish();
                }
            }
        });
        btBackWhiteRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisActivity.this, MainActivity.class));
            }
        });
    }
}