package com.Bridgelabz.userRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
    static String patternForName = "^[A-Z][a-z]{2}[a-z]*$";
    static String patternForEmail = "^[a-z][a-z0-9]*[.+-]?[a-z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]{2,3}([.]{1}[a-z]{2,3})?$";
    static String patternForMobileNumber = "^[0-9]{2}[ ][0-9]{10}";

    public static void main(String[] args) {
        System.out.println("User Registration>>");
    }
    public boolean checkName(String lastName) {
        return Pattern.matches(patternForName, lastName);
    }
    public boolean checkEmail(String userEmail) {
        return Pattern.matches(patternForEmail,userEmail);
    }
    public boolean checkMobileNumber(String mobileNumber) {
        return Pattern.matches(patternForMobileNumber,mobileNumber);
    }
}
