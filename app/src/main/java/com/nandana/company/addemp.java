package com.nandana.company;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addemp extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addemp);

        ed1=(EditText) findViewById(R.id.ecode);
        ed2=(EditText) findViewById(R.id.ename);
        ed3=(EditText) findViewById(R.id.edes);
        ed4=(EditText) findViewById(R.id.email);
        ed5=(EditText) findViewById(R.id.esal);
        b1=(Button) findViewById(R.id.sub);
        b2=(Button) findViewById(R.id.menu);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob1 = new Intent(getApplicationContext(), menu.class);
                startActivity(ob1);
            }
        });

    }
}