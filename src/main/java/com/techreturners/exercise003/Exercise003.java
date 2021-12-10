package com.techreturners.exercise003;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Exercise003 {
    Map<String,Integer> flavours =  new HashMap<>() ;
    String[] flavs= {"Pistachio","Raspberry Ripple","Vanilla","Mint Chocolate Chip","Chocolate","Mango Sorbet"};

    public Exercise003(){

    }

    public Exercise003(boolean myWay){
        flavours.put("Pistachio",0);
        flavours.put("Raspberry Ripple",1);
        flavours.put("Vanilla",2);
        flavours.put("Mint Chocolate Chip",3);
        flavours.put("Chocolate",4);
        flavours.put("Mango Sorbet",5);
    }

    int getIceCreamCode(String iceCreamFlavour) {
        for(int i=0;i<flavs.length;i++){
            if(flavs[i].equals(iceCreamFlavour)){
                return i;
            }
        }
    return 999;
    }

    String[] iceCreamFlavours() {
    	return flavs;

    }

    int getIceCreamCode(String iceCreamFlavour, boolean myWay) {
        return  flavours.get(iceCreamFlavour);
    }
    String[] iceCreamFlavours(boolean myWay) {
        String[] result=new String[6];
        LinkedList<String> sortedList = new LinkedList<>();

        flavours.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                   .forEachOrdered(x -> sortedList.add(x.getKey()));

        return sortedList.toArray(new String[sortedList.size()]);
    }


}
