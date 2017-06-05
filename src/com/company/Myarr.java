package com.company;

/**
 * Created by Lofongi on 05.06.2017.
 */
public class Myarr implements Arr  {
    int a[] = new int[50];
    int size = 0;

    @Override public int Get(int i){
        return a[i];
    }

    @Override public boolean Add(int value){
        if(size != a.length){
            a[size] = value;
            size++;
            return  true;
        }
            else
                return false;

    }
}
