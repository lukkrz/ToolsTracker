package com.ge.toolstracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.ge.toolstracker.model.MasterTool;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MasterTool> mTools = new ArrayList<MasterTool>();
        mTools.add(new MasterTool("This is a very fancy tool",1,"tool1",56,80,9));
        mTools.add(new MasterTool("Essential tool for gas turbines",2,"tool2",20,6,9));
        mTools.add(new MasterTool("Needed on site all the time",3,"tool3",5,83,9));
        mTools.add(new MasterTool("Another cool tool", 4, "tool4", 4533, 8, 9));
        mTools.add(new MasterTool("This one is not needed", 5, "tool5", 231, 23, 9));

        Toast.makeText(getApplicationContext(),
                "Click ListItem Number " + mTools.get(1).getmMTDescription(), Toast.LENGTH_LONG)
                .show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user clicks the Send button */
    public void openRequestForm(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, RequestActivity.class);
        startActivity(intent);
    }

    public void displayMasterToolsList(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMasterToolsActivity.class);
        startActivity(intent);
    }
}
