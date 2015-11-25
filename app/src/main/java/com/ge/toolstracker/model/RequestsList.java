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
        requests.add(new Request("Alstom",20150205,2104721,9999,"San Diego", 1, Request.Severity.LOW, Request.Status.ARRIVED));
        requests.add(new Request("Biedronka",20150205,2104721,9999,"San Ramon", 2, Request.Severity.MEDIUM, Request.Status.ARRIVED));
        requests.add(new Request("Elektrolux",20150205,2104721,9999,"New York", 3, Request.Severity.MEDIUM, Request.Status.SHIPPED));
        requests.add(new Request("BMW",20150205,2104721,9999,"Dallas", 4, Request.Severity.LOW, Request.Status.REGISTERED));
        requests.add(new Request("Apple",20150205,2104721,9999,"Detroit", 5, Request.Severity.HIGH, Request.Status.UNKNOWN));
        requests.add(new Request("IBM",20150205,2104721,9999,"Las Vegas", 6, Request.Severity.LOW, Request.Status.SHIPPED));
        requests.add(new Request("Coca-Cola",20150205,2104721,9999,"Warsaw", 7, Request.Severity.HIGH, Request.Status.SHIPPED));
        requests.add(new Request("Amazon",20150205,2104721,9999,"Cracow", 8, Request.Severity.LOW, Request.Status.SHIPPED));


        return requests;
    }
}