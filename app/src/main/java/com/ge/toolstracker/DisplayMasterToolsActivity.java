package com.ge.toolstracker;


import android.app.LauncherActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ge.toolstracker.model.MasterTool;
import com.ge.toolstracker.model.ToolsList;

import java.util.ArrayList;
import java.util.HashMap;

public class DisplayMasterToolsActivity extends AppCompatActivity {

//    private ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_master_tools);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final ListView listView=(ListView)findViewById(R.id.listView1);

        ArrayList<MasterTool> rList = new ToolsList().getInstance();


        ListViewAdaptermTools adapter=new ListViewAdaptermTools(this, rList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                int pos = position + 1;
                Toast.makeText(getApplicationContext(), Integer.toString(pos) + " Clicked", Toast.LENGTH_SHORT).show();
//                ListItem item = <>listView.getItemAtPosition(position);

            }

        });



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


}
