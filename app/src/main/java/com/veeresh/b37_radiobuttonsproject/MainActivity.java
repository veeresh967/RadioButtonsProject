package com.veeresh.b37_radiobuttonsproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup group;
    RadioButton rb1, rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        group = (RadioGroup) findViewById(R.id.radioGroup1);
        rb1 = (RadioButton) findViewById(R.id.radioButton1);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
    }

    public void genderFunction(View view) {
        //NOW we will ask radio group, which radio button is selected
        int id = group.getCheckedRadioButtonId();
        switch(id){
            case R.id.radioButton1://means first button is clicked
                Toast.makeText(this, "you are .."+rb1.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton2://means second button is clicked
                Toast.makeText(this, "you are..."+rb2.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
