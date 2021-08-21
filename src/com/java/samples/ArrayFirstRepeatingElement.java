package com.java.samples;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ArrayFirstRepeatingElement {


    public static void main(String[] args) {
        Integer [] arr= new Integer[]{6,3,4,5,1,4,3};
        findFirstRepetingElementUSingLinkedHashMap(arr);
        findFirstRepetingElement(arr);
    }

    public static void findFirstRepetingElementUSingLinkedHashMap( Integer [] arr)
    {
        LinkedHashMap<Integer,Integer> lhmp=new LinkedHashMap<Integer,Integer>();
        for (int num:arr)
        {
            if(!lhmp.containsKey(num))
            {
                lhmp.put(num,1);
            }else
            {
                lhmp.put(num,lhmp.get(num)+1);
            }
        }

        for (Map.Entry<Integer,Integer> keyVal:lhmp.entrySet()){
            if(keyVal.getValue()>1)
            {
                System.out.println("First repeating element is : "+keyVal.getKey());
                break;
            }
        }
    }

    public static void findFirstRepetingElement( Integer [] arr){

        int j=-1;
        Set<Integer> intSet=new HashSet<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            if(!intSet.contains(arr[i]))
            {
                intSet.add(arr[i]);
            }else
            {
                j=i;
            }
        }
        System.out.println("First repeating element is : "+arr[j]);

    }

}
