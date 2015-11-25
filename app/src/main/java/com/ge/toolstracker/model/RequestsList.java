package com.ge.toolstracker.model;

import java.util.ArrayList;

/**
 * Created by ross on 25/11/15.
 */


public class RequestsList {
    private static ArrayList<Request> instance;

    public ArrayList<Request> getInstance() {
        if (instance == null) {
            instance = fillArrayList();
        }
        return instance;
    }

    private ArrayList<Request> fillArrayList() {
        // please fill array list here
        ArrayList<Request> requests = new ArrayList<Request>();
        requests.add(new Request("Alstom",20150205,2104721,9999,"San Diego", 1, Request.Severity.LOW));
        requests.add(new Request("Biedronka",20150205,2104721,9999,"San Diego", 2, Request.Severity.MEDIUM));
        requests.add(new Request("Elektrolux",20150205,2104721,9999,"San Diego", 3, Request.Severity.MEDIUM));
        requests.add(new Request("BMW",20150205,2104721,9999,"San Diego", 4, Request.Severity.LOW));
        requests.add(new Request("Apple",20150205,2104721,9999,"San Diego", 5, Request.Severity.HIGH));
        requests.add(new Request("IBM",20150205,2104721,9999,"San Diego", 6, Request.Severity.LOW));
        requests.add(new Request("Coca-Cola",20150205,2104721,9999,"San Diego", 7, Request.Severity.HIGH));
        requests.add(new Request("Amazon",20150205,2104721,9999,"San Diego", 8, Request.Severity.LOW));


        return requests;
    }
}