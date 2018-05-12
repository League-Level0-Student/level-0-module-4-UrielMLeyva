//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday = false,isVacation, isWeekend = false;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
        JOptionPane.showConfirmDialog(null, "Is it a weekday?","Is it a weekend?",
                 JOptionPane.YES_NO_OPTION);


        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
        if(isWeekend) {
        	System.out.println("Sleep in.");
        }
        if(isWeekday) {
        	System.out.println("Get up lazybones!");
        }
        if(isWeekday)(isVacation) {
        	System.out.println("Sleep in.");
        }
        
        
        
        
    }
}
