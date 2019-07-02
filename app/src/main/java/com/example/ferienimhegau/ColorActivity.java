package com.example.ferienimhegau;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class ColorActivity extends AppCompatActivity {
    Switch simpleSwitch;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        // initiate view's
        simpleSwitch = (Switch) findViewById(R.id.switch1);
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (simpleSwitch.isChecked()) {
                   System.out.println("checked");
                   setTheme(android.R.style.ThemeOverlay_Material_Dark);
               } else {
                   setTheme(R.style.AppTheme);
                   System.out.println("unchecked");
               }
            }
        });

    }
}
