public class MinutesToYearsDays{
    public static void main(String[] args){
        System.out.println(printYearsAndDays(561600));
    }

    public static String  printYearsAndDays(long minutes){
        if(minutes<0){
            return "Invalid Value ";
        }
        long hour= minutes/60;
        long days= hour/24;
        long year= days/365;
        long remDays=days%365;
        return  minutes + "min" +" = " + year +"y" + " and " + remDays + "d";


    }
}
