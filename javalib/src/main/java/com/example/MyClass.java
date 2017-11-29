package com.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyClass {
    public static void main(String[] args) {
        HashMap<String, String> m = new HashMap<String, String>();
        System.out.print("添加put<k,v>");
        m.put("1","a");
        m.put("2","b");
        m.put("3","c");
        m.put("4","d");
        System.out.print("添加后的map = "+m);
        m.remove("3");
        System.out.print("添加后的map = "+m);

        Iterator iterator = m.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.print("next:"+entry.getKey()+" - "+entry.getValue());
        }
        m.clear();
        System.out.print(m.isEmpty()?"mail is empty":"mail is not empty");

    }
}
