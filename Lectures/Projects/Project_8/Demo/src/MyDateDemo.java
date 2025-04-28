package Project_8.Demo.src;
import com.boda.MyDate;

public class MyDateDemo {
    public static void main(String[] args) {
        MyDate today = new MyDate();
        System.out.println(today.toString());
        MyDate birthday = new MyDate(2002, 10, 26);
        System.out.println(birthday.getYear() + " is " + (birthday.isLeapYear()? "a leap year." : "not a leap year."));
        System.out.println("You have been born for " + today.between(birthday) + " days.");
    }
}    