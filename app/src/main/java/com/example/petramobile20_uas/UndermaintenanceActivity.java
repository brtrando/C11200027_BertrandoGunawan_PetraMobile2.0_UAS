package com.example.petramobile20_uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class UndermaintenanceActivity extends AppCompatActivity {

    ImageView btBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_undermaintenance);

        btBack = (ImageView) findViewById(R.id.backUnder);

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UndermaintenanceActivity.this, PageActivity.class));
            }
        });
    }
}