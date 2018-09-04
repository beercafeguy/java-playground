package com.beercafeguy.java.i18n;

import java.util.Calendar;
import java.util.Date;

/**java.sql.Date just represent DATE without time information
 * while java.util.Date represent both Date and Time information.
 * This is the major differences why java.util.Date can not directly map to java.sql.Date.
 * https://javarevisited.blogspot.com/2012/04/difference-between-javautildate-and.html#ixzz5Q9Z4YSo3
*/
 public class DateProcessing {
    public static void main(String[] args) {
        Date date=new Date();
       // Date dateSql=new java.sql.Date();

        System.out.println("Now: "+date);
        //add 300000 seconds in current time
        date.setTime(date.getTime()+3600000L);
        System.out.println("One Hour From Now:"+date);
        System.out.println(new Date(date.getTime()+300000L));

        Calendar calendar=Calendar.getInstance(); //java.util.GregorianCalendar is what you get
        System.out.println("Now: "+calendar.getTime());//same as new Date()

        Date d1=new Date(10000000000L);
        calendar.setTime(d1);
        System.out.println(calendar.getTime());

        if(Calendar.SUNDAY == calendar.getFirstDayOfWeek()){
            System.out.println("First Day of given week is sunday");
        }
        System.out.println("Day of week for given Date: "+calendar.get(Calendar.DAY_OF_WEEK));

        calendar.add(Calendar.DAY_OF_WEEK,-2);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.HOUR,4);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.WEEK_OF_MONTH,1);
        System.out.println(calendar.getTime());


    }
}
