package com.h2kinfosys.learnJava.day03;

import java.util.Calendar;

public class StoreOpeningBatch {

    /**
     * Store opens at different time on different day
     * Batch Trigger program need to check Day of week before execution
     * You can switch on - String, Char, int, short, byte
     *  switch(day_of_week){
     *      case 0: {
     *          Logic for Sunday
     *      }
     *      case 1: {
     *          Logic for Monday
     *      }
     *   }
     *   SUNDAY = 1
     */

    public static void main(String[] args) {
        int dayofWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of Week from Java " + dayofWeek);

        switch (dayofWeek){
            case 1:
            case 4:
            case 5:{
                System.out.println("Batch will start at 8:30 AM");
                break;
            }
            case 2:{
                System.out.println("Batch will start at 7:30 AM");
                break;
            }
            case 3:{
                System.out.println("Batch will start at 8:00 AM");
                break;
            }
            case 6:{
                System.out.println("Batch will start at 7:00 AM");
                break;
            }
            case 7:{
                System.out.println("Batch will start at 8:15 AM");
                break;
            }
            default:{
                System.out.println("Batch will start at 7:45 AM");
            }
        }
        System.out.println("Out of Switch");
    }




}
