package com.example.repaso;



public class color2 {

    public static String decimalToHex (int decimal) {
        String hex = Integer.toHexString(decimal);
        if (hex.length() == 1) {
            hex = "0" + hex;
        }
        return hex;
    }
}