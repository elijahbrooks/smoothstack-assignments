import java.time.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class DateTimeAPI {
    public static void main(String[] args) {
        DateTimeAPI newObject = new DateTimeAPI();
        LocalDateTime randomDate = LocalDateTime.of(2021, 8, 13, 02, 1, 1);

        //Question 2
        newObject.getPreviousThursday(randomDate);
        System.out.println();

        //Question 5
        newObject.getDaysOfMonths(2000);
        System.out.println();

        //Question 6
        newObject.getMondaysOfYearMonth(YearMonth.now());
        System.out.println();

        //Question 7
        LocalDateTime date = LocalDateTime.now();
        boolean isFridayTheThirteenth = date.getDayOfWeek().getValue()==5 && date.getDayOfMonth() == 13;
        if(isFridayTheThirteenth)
            System.out.println(date.toLocalDate() + " is Friday the 13th! 😨");
        else
            System.out.println(date.toLocalDate() + " isn't Friday the 13th. Phew 😅");




    }


    /**
     * Question 2
     * @param randomDate
     * @return
     */
    LocalDateTime getPreviousThursday(LocalDateTime randomDate){
        int numOfDay = randomDate.getDayOfWeek().getValue();
        int amountOfDaysFromThursday = numOfDay == 7 ? numOfDay - 4 : 7 - (4 - numOfDay);
        LocalDateTime previousThursdayDate = randomDate.minusDays(amountOfDaysFromThursday);

        System.out.println("Date " + previousThursdayDate + "\n" +
                "DayOfWeek: " + previousThursdayDate.getDayOfWeek());

        return previousThursdayDate;
    }

    /**
     * Question 5
     * @param year
     */
    Integer[] getDaysOfMonths(int year){
        Integer[] daysOfMonths = Arrays.stream(Month.values())
                .map(month -> month.length(Year.isLeap(year)))
                .collect(Collectors.toList())
                .toArray(new Integer[Month.values().length]);

        for (int i = 0; i < daysOfMonths.length; i++)
            System.out.println(daysOfMonths[i] + " Days in " + Month.of(i + 1));

        return daysOfMonths;
    }


    /**
     * Question 6
     * @param yearMonth
     */
    void getMondaysOfYearMonth(YearMonth yearMonth){
        for(int day = 1; day < yearMonth.lengthOfMonth(); day++)
            if (yearMonth.atDay(day).getDayOfWeek().getValue() == 1)
                System.out.println(yearMonth.getMonth().getValue() + "/" + day + "/" + yearMonth.getYear());
    }

}
