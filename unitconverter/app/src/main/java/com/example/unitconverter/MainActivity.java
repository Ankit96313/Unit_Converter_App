package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button2;
    private EditText editTextText;

     private TextView textView2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = findViewById(R.id.button2);
        textView2 = findViewById(R.id.textView2);
        editTextText = findViewById(R.id.editTextText);


//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Toast.makeText(MainActivity.this, "hi click listener worked", Toast.LENGTH_SHORT).show();
//           String s = editTextText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.20462 * kg;
//                textView2.setText("The corresponding value of kg to pound "+ pound);


//            }
//        });
    }
public void compute( View view){
        String s = editTextText.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = 2.20462 * kg;
        textView2.setText("The corresponding value of kg to pound "+ pound);
    }
}