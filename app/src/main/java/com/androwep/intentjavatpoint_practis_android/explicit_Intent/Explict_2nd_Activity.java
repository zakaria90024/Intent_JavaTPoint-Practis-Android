package com.androwep.intentjavatpoint_practis_android.explicit_Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.androwep.intentjavatpoint_practis_android.R;

public class Explict_2nd_Activity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explict_2nd_);

        button = findViewById(R.id.button3);

        Bundle extras = getIntent().getExtras();

        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");

        Toast.makeText(getApplicationContext(),"Values are:\n First value: "+value1+
                "\n Second Value: "+value2, Toast.LENGTH_LONG).show();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Explicit_Intent_Activity.class);
                startActivity(i);
            }
        });
    }


}
