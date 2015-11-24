package com.ge.toolstracker;

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

import com.ge.toolstracker.model.MasterTool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DisplayMasterToolsActivity extends AppCompatActivity {

//    private ListView lv;

    ArrayList<MasterTool> mTools = new ArrayList<MasterTool>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_master_tools);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        lv = (ListView) findViewById(R.id.listView);
        final ListView listview = (ListView) findViewById(R.id.listView);

        mTools.add(new MasterTool("This is a very fancy tool", 1, "tool1", 56, 80, 9));
        mTools.add(new MasterTool("Essential tool for gas turbines",2,"tool2",20,6,9));
        mTools.add(new MasterTool("Needed on site all the time",3,"tool3",5,83,9));
        mTools.add(new MasterTool("Another cool tool",4,"tool4",4533,8,9));
        mTools.add(new MasterTool("This one is not needed",5,"tool5",231,23,9));

        final StableArrayAdapter adapter = new StableArrayAdapter(this,
                android.R.layout.simple_list_item_1, mTools);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {
                final String item = (String) parent.getItemAtPosition(position);
                view.animate().setDuration(2000).alpha(0)
                        .withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                mTools.remove(item);
                                adapter.notifyDataSetChanged();
                                view.setAlpha(1);
                            }
                        });
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

    private class StableArrayAdapter extends ArrayAdapter<MasterTool> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public StableArrayAdapter(Context context, int textViewResourceId,
                                  List<MasterTool> objects) {
            super(context, textViewResourceId, objects);
            for (int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i).getmMTName(), i);
            }
        }

        @Override
        public long getItemId(int position) {
            String item = getItem(position).getmMTName();
            return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

    }

}
