package com.techreturners.exercise003;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Exercise003 {
   Map<String,Integer> flavours =  new HashMap<String,Integer>() ;
    
    public Exercise003(){
        flavours.put("Pistachio",0);
        flavours.put("Raspberry Ripple",1);
        flavours.put("Vanilla",2);
        flavours.put("Mint Chocolate Chip",3);
        flavours.put("Chocolate",4);
        flavours.put("Mango Sorbet",5);

    }

    int getIceCreamCode(String iceCreamFlavour) {
        return  flavours.get(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
    	String[] result=new String[6];
    	LinkedList<String> sortedList = new LinkedList<>();
    	
    	flavours.entrySet()
    	.stream()
    	.sorted(Map.Entry.comparingByValue())
    	.forEachOrdered(x -> sortedList.add(x.getKey()));
    	
         result= (String[]) sortedList.toArray(new String[sortedList.size()]);
         return result;
    }

    String[] pickMultipleIceCreamFlavours(){
        Set<String> keysfl = flavours.keySet();
    	String[] result = (String[]) keysfl.stream().toArray(String[] ::new);
        return result;
    }

}
