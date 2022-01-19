package com.company;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String name1 = "user abc@carbon.super is created";
        String name2 = "user abc@cc.com@carbon.super is created"; //yes
        String name3 = "user abc@cc.com is created"; //yes


        String[] at_sign_checker = name2.split("\\@");
       // System.out.println(at_sign_checker[2]);

        for(var str : at_sign_checker){
            System.out.println("For each vals : "+str);
        }


        System.out.println("at sign checkker lenght: " +at_sign_checker.length);

        if(at_sign_checker.length > 2){
            System.out.println("Recheck it. May have more than one attched email with multiple @ signs");

            int at_count = at_sign_checker.length - 1;
            System.out.println("Number of @ signs : " +at_count);

            //check carbonsupper
            for(int i = 0; i < at_sign_checker.length ; i++ ){

            }
            Boolean b = Pattern.compile("(.*)carbon.super(.*)").matcher("carbon.super is created").matches();
            System.out.println(b);

            System.out.println("have to check user sensitive mail with @carbon.super");


            for(int i = 0; i < at_sign_checker.length ; i++ ){
                if(at_sign_checker[i].equals("carbon.super")){
                    System.out.println("carbon.super found");
                }
            }

        }else if(at_sign_checker.length == 2){
            System.out.println("having only one @ sign");

            Boolean b = Pattern.compile("(.*)carbon.super(.*)").matcher("carbon.super is created").matches();
            System.out.println(b);

            if(b){
                System.out.println("GOOD TO GO");
            }

            //check carbonsupper
            for(int i = 0; i < at_sign_checker.length ; i++ ){
                if(at_sign_checker[i].equals("carbonsupper")){
                    System.out.println("carbonsupper found");
                }
            }
        }

        //System.out.println(carbon_supper);
    }
}
