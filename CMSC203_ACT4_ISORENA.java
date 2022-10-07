import java.util.Scanner;
public class CMSC203_ACT4_ISORENA {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in); 


System.out.print("Month : ");
int month = scan.nextInt();

System.out.print("Date  : ");
int date = scan.nextInt();

System.out.print("Year  : ");
int year = scan.nextInt();

String MonthName = " ";

switch (month) {
    
case 1: 
MonthName = "January";
break;

case 2: 
MonthName = "February";
break;

case 3: 
MonthName = "March";
break;

case 4: 
MonthName = "April";
break;

case 5: 
MonthName = "May";
break;

case 6: 
MonthName = "June";
break;

case 7: 
MonthName = "July";
break;

case 8: 
MonthName = "August";
break;

case 9: 
MonthName = "September";
break;

case 10: 
MonthName = "October";
break;

case 11: 
MonthName = "November";
break;

case 12: 
MonthName = "December";
break;

default :

System.out.println("Month is invalid ");



}
System.out.println (MonthName + " " + date + ", " + year );

}
}

