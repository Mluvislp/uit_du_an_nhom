/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.uitls;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class XDate {
    static SimpleDateFormat formater = new SimpleDateFormat();
    public static Date toDate(String date,String pattern){
        try{
                formater.applyPattern(pattern);
                return formater.parse(date);
        }catch(ParseException ex){
            throw new RuntimeException(ex);
        }
    }
    
    public static String toString(Date date, String pattern){
        formater.applyPattern(pattern);
        if(date==null){
            return null;
        }
        return formater.format(date);
    }
    
    public static Date addDays(Date date,long days){
        date.setTime(date.getTime() + days*24*60*60*1000);
        return date;
    }
    
    public static Date now(){
        return new Date();
    }
    
}
