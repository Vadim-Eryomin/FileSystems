package com.company;

public class Find {
    public static void find(int id, String write) {
        String[] a = write.split("\n");
        String [][] strings= new String[a.length][2];
        for (int i = 0; i < a.length; i++) {
            String[] b = a[i].split(" ");
            strings[i][0]=b[0];
            strings[i][1]=b[1];
        }
    }
}
