package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    RadioButton radioButton;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroupOne);
    }

    public void onclickbuttonMethod(View v){
        int selected = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton)findViewById(selected);
        if(selected == -1){
            Toast.makeText(MainActivity.this , "Nothing id selected", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}