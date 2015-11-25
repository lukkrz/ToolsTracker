package com.ge.toolstracker;

/**
 * Created by ross on 25/11/15.
 */
import static com.ge.toolstracker.model.Constants.FIRST_COLUMN;
import static com.ge.toolstracker.model.Constants.FOURTH_COLUMN;
import static com.ge.toolstracker.model.Constants.SECOND_COLUMN;
import static com.ge.toolstracker.model.Constants.THIRD_COLUMN;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ge.toolstracker.model.MasterTool;

public class ListViewAdapter extends BaseAdapter{

    public ArrayList<MasterTool> list;
    Activity activity;
    TextView txtFirst;
    TextView txtSecond;
    TextView txtThird;
    TextView txtFourth;
    public ListViewAdapter(Activity activity,ArrayList<MasterTool> list){
        super();
        this.activity=activity;
        this.list=list;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub



        LayoutInflater inflater=activity.getLayoutInflater();

        if(convertView == null){

            convertView=inflater.inflate(R.layout.column_row, null);

            txtFirst=(TextView) convertView.findViewById(R.id.id);
            txtSecond=(TextView) convertView.findViewById(R.id.name);
            txtThird=(TextView) convertView.findViewById(R.id.description);
            txtFourth=(TextView) convertView.findViewById(R.id.price);

        }

        MasterTool map=list.get(position);
        txtFirst.setText(String.valueOf(map.getmMTID()));
        txtSecond.setText(map.getmMTName());
        txtThird.setText(map.getmMTDescription());
        txtFourth.setText(String.valueOf(map.getmMTPrice()));

        return convertView;
    }

}