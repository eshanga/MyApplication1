package com.example.myapplication1;

public class ReadWriteUserDetails {
    public String dob, gender, mobile;

    public ReadWriteUserDetails(){};
    public ReadWriteUserDetails(String textDOB, String textGender, String textMobile){
        this.dob = textDOB;
        this.gender =textGender;
        this.mobile =textMobile;
    }
}
