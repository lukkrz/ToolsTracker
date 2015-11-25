package com.ge.toolstracker.model;

import java.util.ArrayList;

/**
 * Created by ross on 25/11/15.
 */
public class ToolsList {
    private static ArrayList<MasterTool> instance;

    public ArrayList<MasterTool> getInstance() {
        if (instance == null) {
            instance = fillArrayList();
        }
        return instance;
    }

    private ArrayList<MasterTool> fillArrayList() {
        // please fill array list here
        ArrayList<MasterTool> mTools = new ArrayList<MasterTool>();
        mTools.add(new MasterTool("This is a very fancy tool",1,"tool1",56,80,9));
        mTools.add(new MasterTool("Essential tool for gas turbines",2,"tool2",20,6,9));
        mTools.add(new MasterTool("Needed on site all the time",3,"tool3",5,83,9));
        mTools.add(new MasterTool("Another cool tool", 4, "tool4", 4533, 8, 9));
        mTools.add(new MasterTool("This one is not needed", 5, "tool5", 231, 23, 9));
        return mTools;
    }
}
