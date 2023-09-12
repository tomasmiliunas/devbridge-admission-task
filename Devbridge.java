package devbridge;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author VIP
 */
public class Devbridge {


    public static void main(String[] args) {
        printBonusDatesBetween(2010, 2015);
    }
    
    public static void printBonusDatesBetween(int fromYear, int toYear) {
        //Initializing start and end dates
        LocalDate startDate = LocalDate.of(fromYear, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(toYear, Month.DECEMBER, 31);
        LocalDate tempDate; //variable for temporary date values
        String dateString; //variable for storing date as string
        String firstHalf;
        String secondHalf;
        
        //Duration between the two days for looping
        Duration duration = Duration.between(startDate.atStartOfDay(), endDate.atStartOfDay());
        for (int i = 0; i <= duration.toDays(); i++) {
            secondHalf = "";
            tempDate = startDate.plusDays(i);
            //Removing unnecessary "-" symbols
            dateString = tempDate.toString().replace("-", "");
            
            //Taking first half of the dateString
            firstHalf = dateString.substring(0, 4);

            //Reversing second half of the dateString
            for (int j = 7; j > 3; j--) {
                secondHalf += dateString.charAt(j);
            }
            
            //Comparing the two halfs
            if (firstHalf.equals(secondHalf)) {
                System.out.println(tempDate);
            }
        }
    }
    
}
