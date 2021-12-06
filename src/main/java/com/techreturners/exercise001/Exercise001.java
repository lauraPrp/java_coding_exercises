package com.techreturners.exercise001;

import java.util.List;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise001 {
    public String capitalizeWord(String word) {
    	
        return word.substring(0,1).toUpperCase().concat(word.substring(1));
    
    }

    public String generateInitials(String firstName, String lastName) {
      String initials= firstName.substring(0,1).toUpperCase().concat(".").concat(lastName.substring(0,1).toUpperCase()); 
       return initials;
    }

    public double addVat(double originalPrice, double vatRate) {
    	double valDouble1= originalPrice+(originalPrice/100*vatRate);
    	BigDecimal bd = new BigDecimal(valDouble1);
    	BigDecimal bd2 = bd.setScale(2, RoundingMode.HALF_UP);
    	double res = bd2.doubleValue();
    	
	return res;
    }

    public String reverse(String sentence) {
      StringBuilder sb= new StringBuilder(sentence) ;
        return sb.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
    	int numUsers = (int) users.stream()
        .filter(s -> s.getType().equals("Linux")).count();
        return numUsers;
    }
}
