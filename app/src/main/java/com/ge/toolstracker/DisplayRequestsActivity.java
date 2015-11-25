package com.ge.toolstracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.ge.toolstracker.model.MasterTool;
import com.ge.toolstracker.model.Request;
import com.ge.toolstracker.model.RequestsList;
import com.ge.toolstracker.model.ToolsList;

import java.util.ArrayList;

public class DisplayRequestsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_requests);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView listView=(ListView)findViewById(R.id.listView1);

        ArrayList<Request> rList = new RequestsList().getInstance();


        ListViewAdapterRequests adapter=new ListViewAdapterRequests(this, rList);
        listView.setAdapter(adapter);
    }

    public void openRequestForm(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, RequestActivity.class);
        startActivity(intent);
    }

}
