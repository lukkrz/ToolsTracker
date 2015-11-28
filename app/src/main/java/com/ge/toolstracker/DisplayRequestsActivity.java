package com.ge.toolstracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import com.ge.toolstracker.model.Request;
import com.ge.toolstracker.model.RequestsList;

import java.util.ArrayList;

public class DisplayRequestsActivity extends AppCompatActivity {

    // Search EditText
    EditText inputSearch;
    ListView mListView;
    ArrayList<Request> mRequestList;
    ListViewAdapterRequests mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_requests);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mListView = (ListView)findViewById(R.id.listView1);

        mRequestList = new RequestsList().getInstance();

        inputSearch = (EditText) findViewById(R.id.searchfield);

        mAdapter = new ListViewAdapterRequests(this, mRequestList);
        mListView.setAdapter(mAdapter);

        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                mAdapter.getFilter().filter(cs);
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

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                int pos = position + 1;
                showRequestDetails(view,position);
            }

        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        mRequestList = new RequestsList().getInstance();
        mAdapter = new ListViewAdapterRequests(this, mRequestList);
        mListView.setAdapter(mAdapter);
    }

    public void openRequestForm(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, RequestActivity.class);
        startActivity(intent);
    }

    public void showRequestDetails(View view, int rId) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayRequestDetailsActivity.class);
        intent.putExtra("rId", rId);
        startActivity(intent);
    }


}
