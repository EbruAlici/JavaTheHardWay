import java.util.Scanner;
/**
 * Contains functions that make it easier to work with months.
 */
public class ThirtyDaysFunctions {
public static void main( String[] args ) {
Scanner kb = new Scanner(System.in); System.out.print( "Which month? (1-12) " );
int month = kb.nextInt();
System.out.println(monthDays(month) + " days hath " + monthName(month));
}
    /**
     * Returns the name for the given month number (1-12).
     *
     * @author Graham Mitchell
     * @param  month  the month number (1-12)
     * @return        the English name of the month, or "error" if out of range
     */
public static String monthName( int month ) { String monthName = "error";
if ( month == 1 ) monthName = "January";
elseif(month==2) monthName = "February";
elseif(month==3) monthName = "March";
elseif(month==4) monthName = "April";
elseif(month==5) monthName = "May"; elseif(month==6)
monthName = "June"; elseif(month==7)
monthName = "July"; elseif(month==8)
monthName = "August"; elseif(month==9)
monthName = "September"; elseif(month==10)
monthName = "October"; elseif(month==11)
monthName = "November"; elseif(month==12)
    monthName = "December";
Exercise 38: Thirty Days Revisited with Javadoc 149
return
/**
 * Returns
 *
 * @author
 * @param
 * @return
 */
monthName;
the number of days in a given month.
}
public static
int days;
    /* Thirty
       April,
int
Graham month
Mitchell
the month number (1-12)
the number of days in the month, or 31 if out of range
monthDays( int month ) {
days hath September
       June and November
All the rest have thirty-one
   Except the second month alone.... */
switch(month)
{
case 9:
case 4: case 6: case 11:
case 2: default:
}
return days; }
}
days = 30; break; days = 28; break; days = 31;
