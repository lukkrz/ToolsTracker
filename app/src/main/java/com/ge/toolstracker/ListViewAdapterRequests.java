package com.ge.toolstracker;

/**
 * Created by ross on 25/11/15.
 */

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TableRow;
import android.widget.TextView;

import com.ge.toolstracker.model.Request;

import java.util.ArrayList;

public class ListViewAdapterRequests extends BaseAdapter{

    public ArrayList<Request> list;
    Activity activity;
    TextView txtFirst;
    TextView txtSecond;
    TextView txtThird;
    TextView txtFourth;
    TextView txtFifth;
    TableRow row;

    public ListViewAdapterRequests(Activity activity, ArrayList<Request> list){
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

            convertView=inflater.inflate(R.layout.requests_list, null);

            txtFirst=(TextView) convertView.findViewById(R.id.requestId);
            txtSecond=(TextView) convertView.findViewById(R.id.requestDate);
            txtThird=(TextView) convertView.findViewById(R.id.requestCustomer);
//            txtFourth=(TextView) convertView.findViewById(R.id.requestFE);
            txtFifth=(TextView) convertView.findViewById(R.id.requestStatus);
            row = (TableRow) convertView.findViewById(R.id.tablerow);

        }

        Request map=list.get(position);
        txtFirst.setText(String.valueOf(map.getmRNumber()));
        txtSecond.setText(String.valueOf(map.getmRDate()));
        txtThird.setText(map.getmRClient());
//        txtFourth.setText(String.valueOf(map.getmRFE()));
        txtFifth.setText(String.valueOf(map.getmRStatus()));
        if (map.getmRSeverity() == Request.Severity.MEDIUM){
            row.setBackgroundColor(Color.YELLOW);
        }
        if (map.getmRSeverity() == Request.Severity.HIGH){
            row.setBackgroundColor(Color.RED);
        }

        return convertView;
    }

}