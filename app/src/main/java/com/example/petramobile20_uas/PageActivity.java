package com.example.petramobile20_uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class PageActivity extends AppCompatActivity {

    LinearLayout btSchedule, btGrade, btAtten, btTrans, btSkkk, btOrg;
    ImageView btHome, btGallery, btUser, btHelp, btSetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        btSchedule = (LinearLayout) findViewById(R.id.schduleBtn);
        btGrade = (LinearLayout) findViewById(R.id.gradeBtn);
        btAtten = (LinearLayout) findViewById(R.id.attenBtn);
        btTrans = (LinearLayout) findViewById(R.id.transButton);
        btSkkk = (LinearLayout) findViewById(R.id.skkkBtn);
        btOrg = (LinearLayout) findViewById(R.id.orgBtn);

        btHome = (ImageView)findViewById(R.id.imageViewHome);
        btGallery = (ImageView)findViewById(R.id.imageViewGal);
        btUser = (ImageView)findViewById(R.id.imageUser);
        btHelp = (ImageView)findViewById(R.id.imageViewHelp);
        btSetting = (ImageView)findViewById(R.id.imageViewSetting);


        btSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PageActivity.this, UndermaintenanceActivity.class));
            }
        });
        btGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PageActivity.this, UndermaintenanceActivity.class));
            }
        });
        btAtten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PageActivity.this, UndermaintenanceActivity.class));
            }
        });
        btTrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PageActivity.this, UndermaintenanceActivity.class));
            }
        });
        btSkkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PageActivity.this, UndermaintenanceActivity.class));
            }
        });
        btOrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PageActivity.this, UndermaintenanceActivity.class));
            }
        });

        btHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PageActivity.this, UndermaintenanceActivity.class));
            }
        });

        btGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PageActivity.this, UndermaintenanceActivity.class));
            }
        });

        btUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PageActivity.this, UndermaintenanceActivity.class));
            }
        });

        btHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PageActivity.this, UndermaintenanceActivity.class));
            }
        });

        btSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PageActivity.this, UndermaintenanceActivity.class));
            }
        });

    }
}