package com.example.password_validator;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect to the Button, editText,TextView;
        Button validate = (Button)findViewById(R.id.validate);
        final TextView Check = (TextView)findViewById(R.id.Check);
        final EditText Password = (EditText)findViewById(R.id.Password);

        //Build password validator
        final theValidator isValid = new theValidator();

        AlertDialog.Builder AlertB = new AlertDialog.Builder(this);
        AlertB.setMessage("Empty password is not valid.");
        AlertB.setCancelable(true);
        AlertB.setPositiveButton("Agree",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }
        );
        final AlertDialog alertBox = AlertB.create();

        //Waiting for validate button to click
        validate.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String passwordTest = Password.getText().toString();

                if(passwordTest.trim().length() == 0) {
                    alertBox.show();
                }  else {

                    if(isValid.ValidationStage2(passwordTest) != 5) {
                        Check.setText("The password strength is not qualified for safety, Bad.");
                    } else {
                        Check.setText("The password strength is qualified for safety, Good");
                    }
                }

            }
        });


    }
}