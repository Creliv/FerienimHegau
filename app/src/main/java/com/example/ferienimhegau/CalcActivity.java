package com.example.ferienimhegau;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends AppCompatActivity {
    private static final String TAG = "CalcActivity";
    private Spinner adult,child;
    private EditText night;
    private TextView endtext;
    private Button button;
    private int adults, children, nights;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        //setTitle(@string/calc_header);
        Log.d(TAG, "Display Image in 3rd Activity");
        adult = findViewById(R.id.spinner);
        String[] items = new String[]{"1","2","3","4","5"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(CalcActivity.this, android.R.layout.simple_spinner_dropdown_item, items);
        adult.setAdapter(adapter);

        child = findViewById(R.id.spinner4);
        /*String[] itemsc = new String[5-adults];
        switch(adults){
            case (1): itemsc[0] = "1";
                itemsc[1] = "2";
                itemsc[2] = "3";
                itemsc[3] = "4";
                break;
            case (2): itemsc[0] = "1";
                itemsc[1] = "2";
                itemsc[2] = "3";
                break;
            case (3): itemsc[0] = "1";
                itemsc[1] = "2";
                break;
            case (4): itemsc[0] = "1";
                break;
        }*/
        String[] itemsc = new String[]{"0","1","2","3","4","5"};
        ArrayAdapter<String> adapterc = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, itemsc);
        child.setAdapter(adapterc);


        night = (EditText)findViewById(R.id.editText);


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adults = Integer.parseInt(adult.getSelectedItem().toString());
                children = Integer.parseInt(child.getSelectedItem().toString());
                String content = night.getText().toString();
                nights = Integer.parseInt(content);
                endtext = findViewById(R.id.textView6);

                if (adults + children > 5) {
                    //Toast.makeText(getApplicationContext(), "Max 5 People", Toast.LENGTH_SHORT).show();
                    endtext.setText(R.string.calc_error);
                    endtext.setVisibility(View.VISIBLE);
                } else {

                    endtext.setText("100€");
                    endtext.setVisibility(View.VISIBLE);
                }
            }
        });


        //Show Icon
        //this.imageView = (ImageView)this.findViewById(R.id.imageView);
        //this.imageView.setImageResource(R.drawable.ic_launcher);

    }
}
