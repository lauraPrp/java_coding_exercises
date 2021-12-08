package com.techreturners.exercise001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return word.substring(0, 1).toUpperCase().concat(word.substring(1));
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.substring(0, 1).toUpperCase().concat(".").concat(lastName.substring(0, 1).toUpperCase());
    }

    public double addVat(double originalPrice, double vatRate) {
        double valDouble1 = originalPrice + (originalPrice / 100 * vatRate);
        BigDecimal bd = new BigDecimal(valDouble1);
        BigDecimal bd2 = bd.setScale(2, RoundingMode.HALF_UP);
        
        return bd2.doubleValue();
    }

    public String reverse(String sentence) {
        StringBuilder sb = new StringBuilder(sentence);
        return sb.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        return (int) users.stream()
                .filter(s -> s.getType().equals("Linux"))
                .count();
    }
}
