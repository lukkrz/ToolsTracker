package com.ge.toolstracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.ge.toolstracker.model.MasterTool;
import com.ge.toolstracker.model.Request;
import com.ge.toolstracker.model.RequestsList;
import com.ge.toolstracker.model.ToolsList;

import java.util.ArrayList;

public class DisplayRequestsActivity extends AppCompatActivity {


    // Search EditText
    EditText inputSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_requests);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView listView=(ListView)findViewById(R.id.listView1);

        ArrayList<Request> rList = new RequestsList().getInstance();

        inputSearch = (EditText) findViewById(R.id.searchfield);

        final ListViewAdapterRequests adapter=new ListViewAdapterRequests(this, rList);
        listView.setAdapter(adapter);

        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });

    }

    public void openRequestForm(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, RequestActivity.class);
        startActivity(intent);
    }



}
