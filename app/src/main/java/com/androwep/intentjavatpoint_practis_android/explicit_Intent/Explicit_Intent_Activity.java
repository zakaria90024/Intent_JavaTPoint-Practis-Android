package com.androwep.intentjavatpoint_practis_android.explicit_Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.androwep.intentjavatpoint_practis_android.R;

public class Explicit_Intent_Activity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit__intent_);

        button = findViewById(R.id.secondCallID);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Explict_2nd_Activity.class);
                i.putExtra("Value1", "Android By Javatpoint");
                i.putExtra("Value2", "Simple Tutorial");
                // Set the request code to any code you like, you can identify the
                // callback via this code
                startActivity(i);

            }
        });
    }
}
