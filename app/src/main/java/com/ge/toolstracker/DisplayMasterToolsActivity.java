package com.ge.toolstracker;

import static com.ge.toolstracker.model.Constants.FIRST_COLUMN;
import static com.ge.toolstracker.model.Constants.FOURTH_COLUMN;
import static com.ge.toolstracker.model.Constants.SECOND_COLUMN;
import static com.ge.toolstracker.model.Constants.THIRD_COLUMN;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.ge.toolstracker.model.MasterTool;
import com.ge.toolstracker.model.RequestList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DisplayMasterToolsActivity extends AppCompatActivity {

//    private ListView lv;

    ArrayList<MasterTool> mTools = new ArrayList<MasterTool>();

    private ArrayList<HashMap<String, String>> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_master_tools);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ListView listView=(ListView)findViewById(R.id.listView1);

        list=new ArrayList<HashMap<String,String>>();

        ArrayList<MasterTool> rList = new RequestList().getInstance();

        HashMap<String,String> temp=new HashMap<String, String>();
        temp.put(FIRST_COLUMN, "Ankit Karia");
        temp.put(SECOND_COLUMN, "Male");
        temp.put(THIRD_COLUMN, "22");
        temp.put(FOURTH_COLUMN, "Unmarried");
        list.add(temp);


        ListViewAdapter adapter=new ListViewAdapter(this, rList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                int pos = position + 1;
                Toast.makeText(getApplicationContext(), Integer.toString(pos) + " Clicked", Toast.LENGTH_SHORT).show();
            }

        });

        mTools.add(new MasterTool("This is a very fancy tool", 1, "tool1", 56, 80, 9));
        mTools.add(new MasterTool("Essential tool for gas turbines",2,"tool2",20,6,9));
        mTools.add(new MasterTool("Needed on site all the time",3,"tool3",5,83,9));
        mTools.add(new MasterTool("Another cool tool", 4, "tool4", 4533, 8, 9));
        mTools.add(new MasterTool("This one is not needed", 5, "tool5", 231, 23, 9));



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
