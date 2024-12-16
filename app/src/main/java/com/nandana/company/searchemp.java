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

public class searchemp extends AppCompatActivity {

    EditText ed1;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_searchemp);

        ed1=(EditText) findViewById(R.id.ecode);
        b1=(Button) findViewById(R.id.search);
        b2=(Button) findViewById(R.id.b2menu);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob1 = new Intent(getApplicationContext(), menu.class);
                startActivity(ob1);
            }
        });

    }
}