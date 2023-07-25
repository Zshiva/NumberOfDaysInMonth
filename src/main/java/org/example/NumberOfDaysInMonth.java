package org.example;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if(((year>=1 && year<=9999)) && ((year%400 == 0) || ((year%4==0)&&(year%100!=0)))){
            return true;
        }else{
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if((year <1)||(year > 9999) ||(month < 1) || (month >12))
            return -1;
        else{
            switch(month){
                case 2 :
                    return isLeapYear(year) ? 29 : 28 ;
                case 4: case 6 : case 9 : case 11:
                    return 30;
            }
        }
        return 31;
    }

    public static void main(String[] args) {
        getDaysInMonth(4, 2020); // It will return 30 days;
        getDaysInMonth(2, 2020); // It will return 29 days;
        getDaysInMonth(2, 2021); // It will return 28 days;
        getDaysInMonth(1, 2021); // It will return 31 days;
    }
}