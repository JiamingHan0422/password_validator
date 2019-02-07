package com.example.password_validator;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   //TextView v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect to the Button, editText,TextView and generate the password validator
        Button validate = (Button)findViewById(R.id.validate);
        final TextView Check = (TextView)findViewById(R.id.Check);
        final EditText Password = (EditText)findViewById(R.id.Password);

        final theValidator isValid = new theValidator();
        // AlertDialog.Builder(Context: XXX): Creates a builder for an alert dialog that uses XXX
        AlertDialog.Builder AlertB = new AlertDialog.Builder(this);
        AlertB.setMessage("Empty password is not valid.");
        AlertB.setCancelable(true);
        AlertB.setPositiveButton("Agree", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id) { dialog.cancel(); }
        }
        );
        //Remind user when they enter a blank password.
        final AlertDialog messageBox = AlertB.create();

        //Waiting for validate button to click
        validate.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String passwordTest = Password.getText().toString();

                // alert box show up.
                if(passwordTest.trim().length() == 0) {
                    messageBox.show();
                }  else {

                 if(isValid.ValidationStage2(passwordTest) < 2) {
                     Check.setText("The password strength is not qualified for safety, Bad.");
                   // v1.setTextColor(Color.RED);

                 } else {
                     Check.setText("The password strength is qualified for safety, Good");
                    // v1.setTextColor(Color.GREEN);
                    }
                }
            }
        }
        );
    }
}