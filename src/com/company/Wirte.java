package com.company;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Wirte {

    FileWriter fl = new FileWriter("Chet.txt");

    public Wirte(int id,int money,String [][]a) throws IOException {
        for (int i=0;i<a.length;i++){
            for (int t=0;t<a[0].length;t++){
                if(a[i][0].equals(id+"")){
                    fl.write(a[i][0]);
                    fl.write(money);
                }else {
                    fl.write(a[i][0]+a[i][1]);
                }
            }
        }


    }


}
