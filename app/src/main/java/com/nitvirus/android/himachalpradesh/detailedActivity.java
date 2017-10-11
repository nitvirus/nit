package com.nitvirus.android.himachalpradesh;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class detailedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Button readrivers = (Button)findViewById(R.id.readrivers);
        readrivers.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(detailedActivity.this, riversActivity.class));
                    }

                }
        );
        Button bilaspur = (Button)findViewById(R.id.bilaspur);
        bilaspur.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(detailedActivity.this, bilaspurActivity.class));
                    }

                }
        );
        Button chamba = (Button)findViewById(R.id.chamba);
        chamba.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(detailedActivity.this, chambaActivity.class));
                    }

                }
        );
        Button hamirpur = (Button)findViewById(R.id.hamirpur);
        hamirpur.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(detailedActivity.this, hamirpurActivity.class));
                    }

                }
        );

    }

}
