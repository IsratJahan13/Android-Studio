package com.example.probook.drowerlayout;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawLayout;
    private ActionBarDrawerToggle toggle;

    private Button firstSem,secondSem,thirdSem,fourthSem,fifthSem,sixthSem,seventhSem,eightSem,question,syllebus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawLayout = (DrawerLayout) findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(MainActivity.this,drawLayout,R.string.open,R.string.close);
        drawLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView=(NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        firstSem = (Button) findViewById(R.id.firstSemId);
        secondSem = (Button) findViewById(R.id.secondSemId);
        thirdSem = (Button) findViewById(R.id.thirdSemId);
        fourthSem = (Button) findViewById(R.id.fourthSemId);
        fifthSem = (Button) findViewById(R.id.fifthSemId);
        sixthSem = (Button) findViewById(R.id.sixthSemId);
        seventhSem = (Button) findViewById(R.id.seventhSemId);
        eightSem = (Button) findViewById(R.id.eightSemId);
        question = (Button) findViewById(R.id.questionId);
        syllebus = (Button) findViewById(R.id.syllebusId);

        firstSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(MainActivity.this,FirstSemActivity.class);
                startActivity(inten);
            }
        });
        secondSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondSemActivity.class);
                startActivity(intent);
            }
        });
        thirdSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ThirdSemActivity.class);
                startActivity(intent);
            }
        });
        fourthSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FourthSemActivity.class);
                startActivity(intent);
            }
        });
        fifthSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FifthSemActivity.class);
                startActivity(intent);
            }
        });
        sixthSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(MainActivity.this,SixthSemActivity.class);
                startActivity(inten);
            }
        });
        seventhSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(MainActivity.this,SeventhSemActivity.class);
                startActivity(inten);
            }
        });
        eightSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(MainActivity.this,EightSemActivity.class);
                startActivity(inten);
            }
        });
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(MainActivity.this,QuestionActivity.class);
                startActivity(inten);
            }
        });
        syllebus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(MainActivity.this,SyllebusActivity.class);
                startActivity(inten);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.home){
            Intent intent = new Intent(MainActivity.this,MainActivity.class);
            startActivity(intent);
        }
        if (id==R.id.admin){
            Intent intent = new Intent(MainActivity.this,loginActivity.class);
            startActivity(intent);
        }
        if (id==R.id.about){
            Intent intent = new Intent(MainActivity.this,aboutActivity.class);
            startActivity(intent);
        }

        return false;
    }
}
