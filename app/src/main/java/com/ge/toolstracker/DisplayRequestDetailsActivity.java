package com.ge.toolstracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.ge.toolstracker.model.Request;
import com.ge.toolstracker.model.RequestsList;

import java.util.ArrayList;

public class DisplayRequestDetailsActivity extends AppCompatActivity {

    TextView dClient;
    TextView dDate;
    TextView dSSO;
    TextView dLocation;
    TextView dFFEM;
    RatingBar dSeverity;
    TextView dStatus;
    Button confirm;
    int rId;

    ArrayList<Request> rList = new RequestsList().getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_request_details);

        Intent intent = getIntent();
        rId = intent.getIntExtra("rId", 0);


        dClient = (TextView) findViewById(R.id.dClient);
        dDate = (TextView) findViewById(R.id.dDate);
        dSSO = (TextView) findViewById(R.id.dSSO);
        dLocation = (TextView) findViewById(R.id.dLocation);
        dFFEM = (TextView) findViewById(R.id.dFFEM);
        dSeverity = (RatingBar) findViewById(R.id.dSeverity);
        dStatus = (TextView) findViewById(R.id.dStatus);
        confirm = (Button) findViewById(R.id.confirm);

        dClient.setText(rList.get(rId).getmRClient());
        dDate.setText(String.valueOf(rList.get(rId).getmRDate()));
        dSSO.setText(String.valueOf(rList.get(rId).getmRFE()));
        dLocation.setText(rList.get(rId).getmRLocation());
        dFFEM.setText(String.valueOf(rList.get(rId).getmRFFEM()));
        if (rList.get(rId).getmRSeverity() == Request.Severity.LOW){
            dSeverity.setRating(1);
        }
        if (rList.get(rId).getmRSeverity() == Request.Severity.MEDIUM){
            dSeverity.setRating(2);
        }
        if (rList.get(rId).getmRSeverity() == Request.Severity.HIGH){
            dSeverity.setRating(3);
        }
        dStatus.setText(String.valueOf(rList.get(rId).getmRStatus()));

        if (rList.get(rId).getmRStatus() == Request.Status.SHIPPED){
            confirm.setVisibility(View.VISIBLE);
        }


    }

    public void confirmRequest(View view) {
        // Do something in response to button
        rList.get(rId).setmRStatus(Request.Status.ARRIVED);
        showRequestDetails(view, rId);
        Toast.makeText(getApplicationContext(), "You have confirmed the arrival of tools from request: "+ rId, Toast.LENGTH_SHORT).show();

    }

    public void showRequestDetails(View view, int rId) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayRequestDetailsActivity.class);
        intent.putExtra("rId", rId);
        startActivity(intent);
    }
}
