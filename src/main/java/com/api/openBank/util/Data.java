package com.api.openBank.util;

import com.api.openBank.home.transactions.Transaction;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class Data implements  DataStub{
    Gson g = new Gson();
    List<String> jsonStrings =new ArrayList<>();
    @Override
    public List<Transaction> getData(){
        creatTransactionJsons();
        List<Transaction> transactions=new ArrayList<>();
        Set<String> set = new LinkedHashSet<>(jsonStrings);
        for(String jsonString:set) {
            transactions.add(g.fromJson(jsonString, Transaction.class));
        }
        return transactions;
    }

    private List<String> creatTransactionJsons(){
        jsonStrings.add("{\n" +
                "\t\"id\": \"5647344\",\n" +
                "\t\"this_account\": {\n" +
                "\t\t\"id\": \"78665677\"\n" +
                "\t},\n" +
                "\t\"other_account\": {\n" +
                "\t\t\"number\": \"ACC5657575\",\n" +
                "\t\t\"holder\": {\n" +
                "\t\t\t\"name\": \"Alex Mwangi\"\n" +
                "\t\t},\n" +
                "\t\t\"metadata\": {\n" +
                "\t\t\t\"image_UR\": \"\"\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"details\": {\n" +
                "\t\t\"type\": \"okoa\",\n" +
                "\t\t\"description\": \"Okoa jahazi\",\n" +
                "\t\t\"value\": {\n" +
                "\t\t\t\"amount\": \"230044.90\",\n" +
                "\t\t\t\"currency\": \"Ksh\"\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}");
        jsonStrings.add("{\n" +
                "\t\"id\": \"65363563\",\n" +
                "\t\"this_account\": {\n" +
                "\t\t\"id\": \"5464574833\"\n" +
                "\t},\n" +
                "\t\"other_account\": {\n" +
                "\t\t\"number\": \"ACC39993\",\n" +
                "\t\t\"holder\": {\n" +
                "\t\t\t\"name\": \"John Maina\"\n" +
                "\t\t},\n" +
                "\t\t\"metadata\": {\n" +
                "\t\t\t\"image_UR\": \"\"\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"details\": {\n" +
                "\t\t\"type\": \"okoa\",\n" +
                "\t\t\"description\": \"Okoa jahazi\",\n" +
                "\t\t\"value\": {\n" +
                "\t\t\t\"amount\": \"7685555.90\",\n" +
                "\t\t\t\"currency\": \"Ksh\"\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}");
        jsonStrings.add("{\n" +
                "\t\"id\": \"35636737\",\n" +
                "\t\"this_account\": {\n" +
                "\t\t\"id\": \"894444343\"\n" +
                "\t},\n" +
                "\t\"other_account\": {\n" +
                "\t\t\"number\": \"ACC4574733\",\n" +
                "\t\t\"holder\": {\n" +
                "\t\t\t\"name\": \"Tomas Wanjala\"\n" +
                "\t\t},\n" +
                "\t\t\"metadata\": {\n" +
                "\t\t\t\"image_UR\": \"\"\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"details\": {\n" +
                "\t\t\"type\": \"hekima\",\n" +
                "\t\t\"description\": \"hekima account\",\n" +
                "\t\t\"value\": {\n" +
                "\t\t\t\"amount\": \"546473.90\",\n" +
                "\t\t\t\"currency\": \"Ksh\"\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}");
        jsonStrings.add("{\n" +
                "\t\"id\": \"64647373\",\n" +
                "\t\"this_account\": {\n" +
                "\t\t\"id\": \"44476337\"\n" +
                "\t},\n" +
                "\t\"other_account\": {\n" +
                "\t\t\"number\": \"ACC54635744\",\n" +
                "\t\t\"holder\": {\n" +
                "\t\t\t\"name\": \"Eric Mong'are\"\n" +
                "\t\t},\n" +
                "\t\t\"metadata\": {\n" +
                "\t\t\t\"image_UR\": \"\"\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"details\": {\n" +
                "\t\t\"type\": \"hekima\",\n" +
                "\t\t\"description\": \"hekima account\",\n" +
                "\t\t\"value\": {\n" +
                "\t\t\t\"amount\": \"57474843.78\",\n" +
                "\t\t\t\"currency\": \"Ksh\"\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}");
        return jsonStrings;
    }
}
