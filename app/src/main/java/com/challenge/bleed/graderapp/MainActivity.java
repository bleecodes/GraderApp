package com.challenge.bleed.graderapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    private EditText gradeInput;
    private TextView gradeOutput;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gradeInput = (EditText)findViewById(R.id.et_view);
        gradeOutput = (TextView)findViewById(R.id.tt_view);
        submitButton = (Button)findViewById(R.id.bn_view);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setGrade(gradeInput);
            }
        });


    }

    private void setGrade(EditText gradeInput) {
        int grade = parseInt(gradeInput.getText().toString());
        if (grade >= 50)
            gradeOutput.setText("PASS");
        else
            gradeOutput.setText("FAIL");
    }



}