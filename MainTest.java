package uwcTest;

import java.util.*;

public class MainTest {
    
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        double mathNscPercent, englishNscPercent,loNscPercent, other1NscPercent, other2NscPercent, other3NscPercent, other4NscPercent, other5NscPercent;

        System.out.print("Please enter your Math percentage: ");
        mathNscPercent = kbd.nextDouble();

        System.out.print("Please enter your English percentage: ");
        englishNscPercent = kbd.nextDouble();

        System.out.print("Please enter your Life Orientation percentage: ");
        loNscPercent = kbd.nextDouble();

        System.out.println("Please enter percentages for every other subject");
        System.out.print("Subject 1: ");
        other1NscPercent = kbd.nextDouble();

        System.out.print("Subject 2: ");
        other2NscPercent = kbd.nextDouble();

        System.out.print("Subject 3: ");
        other3NscPercent = kbd.nextDouble();

        System.out.print("Subject 4: ");
        other4NscPercent = kbd.nextDouble();

        System.out.print("Subject 5: ");
        other5NscPercent = kbd.nextDouble();

        UWCPointsCalculation result1 = new UWCPointsCalculation(mathNscPercent, englishNscPercent, loNscPercent, other1NscPercent, other2NscPercent, other3NscPercent,
        other4NscPercent, other5NscPercent);
        //result1.setMathNscPercent(mathNscPercent);
        //result1.setEnglishNscPercent(englishNscPercent);
        //result1.setLoNscPercent(loNscPercent);
        result1.uwcMathPoint(mathNscPercent);
        result1.uwcEnglishPoint(englishNscPercent);
        result1.uwcLoPoint(loNscPercent);
        result1.uwcOther1NscPoint(other1NscPercent);
        result1.uwcOther2NscPoint(other2NscPercent);
        result1.uwcOther3NscPoint(other3NscPercent);
        result1.uwcOther4NscPoint(other4NscPercent);
        result1.uwcOther5NscPoint(other5NscPercent);
        
        System.out.println(result1.toString());
        System.out.println("Total UWC points: " + result1.pointTotal());
    }
}
