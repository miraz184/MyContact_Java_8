package com.glo;

import java.util.regex.Pattern;

public class PhoneNumber {
    private String label;
    private String phoneNumber;

    public PhoneNumber(String label, String phoneNumber) throws Exception {
        // TODO
        if(Pattern.matches("[a-zA-Z]+", label) && label.length() <= 255 && label!=""){
            this.label=label;
        }else {
            throw new Exception();
        }

        if(Pattern.matches("[0-9]{10}", phoneNumber)){
            this.phoneNumber=phoneNumber;
        }else {
            throw new Exception();
        }
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isValidMobileNo(String str)
    {
        if (str.matches("\\d{10}"))
            return true;
//        //(0/91): number starts with (0/91)
//        //[7-9]: starting of the number may contain a digit between 0 to 9
//        //[0-9]: then contains digits 0 to 9
//        Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
//        //the matcher() method creates a matcher that will match the given input against this pattern
//        Matcher match = ptrn.matcher(str);
//        //returns a boolean value
//        return (match.find() && match.group().equals(str));
        return false;
    }
}
