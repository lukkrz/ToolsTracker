package com.ge.toolstracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import com.ge.toolstracker.model.Request;
import com.ge.toolstracker.model.RequestsList;

import java.util.ArrayList;



public class RequestActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
    }

    public void displayRequestsList(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayRequestsActivity.class);
        startActivity(intent);
    }


    ArrayList<Request> rList = new RequestsList().getInstance();

    public void saveRequest(View view) {
        int rNumber = rList.size() + 1;

        try {


        EditText editText1 = (EditText)findViewById(R.id.clientName);
        String rClient = editText1.getText().toString();

        EditText editText2 = (EditText)findViewById(R.id.date);
        long rDate = Long.valueOf(editText2.getText().toString());

        EditText editText3 = (EditText)findViewById(R.id.location);
        String rLocation = editText3.getText().toString();

        EditText editText4 = (EditText)findViewById(R.id.FFEM);
        int rFFEM = Integer.valueOf(editText4.getText().toString());

        int rFE = 123456789;

        Request.Severity rSeverity = Request.Severity.LOW;

        RatingBar ratingBar1 = (RatingBar)findViewById(R.id.ratingBar);
        if (ratingBar1.getRating() == 1){
            rSeverity = Request.Severity.LOW;
        }
        if (ratingBar1.getRating() == 2){
            rSeverity = Request.Severity.MEDIUM;
        }
        if (ratingBar1.getRating() == 3){
            rSeverity = Request.Severity.HIGH;
        }

            rList.add(new Request(rClient, rDate, rFE, rFFEM, rLocation, rNumber, rSeverity, Request.Status.REGISTERED));

            Toast.makeText(getApplicationContext(),
                    "Your request has been saved with ID: " + rNumber, Toast.LENGTH_LONG)
                    .show();

           // displayRequestsList(view);
            finish();

        } catch (NumberFormatException exp) {
            Toast.makeText(getApplicationContext(),
                    "Wrong data in the form." , Toast.LENGTH_LONG)
                    .show();
        }

    }

}

