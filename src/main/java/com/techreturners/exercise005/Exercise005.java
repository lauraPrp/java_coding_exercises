package com.techreturners.exercise005;

import java.util.Locale;

public class Exercise005 {
    private static final String loAlphabet="abcdefghijklmnopqrstuvwxyz";


    public boolean isPangram(String input) {
       boolean isPangramForSure=true;
       input = input.toLowerCase(Locale.ROOT);
        for(int i =0;i<loAlphabet.length();i++){
          char letter = loAlphabet.charAt(i);
          if(input.indexOf(letter)==-1){
               return false;
          }
       }
        return isPangramForSure;
    }

}
