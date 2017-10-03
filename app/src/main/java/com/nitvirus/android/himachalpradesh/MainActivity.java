package com.nitvirus.android.himachalpradesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import static com.nitvirus.android.himachalpradesh.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button readmorebutton = (Button)findViewById(R.id.readmorebutton);
        readmorebutton.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, detailedActivity.class));
                    }

                }




        );
//        ScrollView sv=(ScrollView)findViewById(R.id.scrollview1);
//        TextView tv=new TextView(this);
//        tv.setText("just keep the text what you want here");
//        sv.addView(tv);
//        public void sendMessage(View view) {
//            Intent intent = new Intent(this, DisplayMessageActivity.class);
//            EditText editText = (EditText) findViewById(R.id.editText);
//            String message = editText.getText().toString();
//            intent.putExtra(EXTRA_MESSAGE, message);
//            startActivity(intent);
//        }

    }
}
