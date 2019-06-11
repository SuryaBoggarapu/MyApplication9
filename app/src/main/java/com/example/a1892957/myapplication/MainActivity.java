package com.example.a1892957.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt_uname,edt_pass;
    Button btn_submit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        edt_uname = findViewById(R.id.edt_name);
        edt_pass = findViewById(R.id.edt_pass);
        btn_submit = findViewById(R.id.submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            String uname,pass;
            uname = edt_uname.getText().toString();
            pass = edt_pass.getText().toString();

            Intent i = new Intent(MainActivity.this,Main2Activity.class);
            i.putExtra("un",uname);
            i.putExtra("ps",pass);
            startActivity(i);

                Toast.makeText(getApplicationContext(),uname+"Thanks!",Toast.LENGTH_LONG).show();
            }


        });
    }
}
