package lecture_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by gorozheyevd on 06.10.2017.
 */
public class HomeworkGeneralApplications {

    public static void main(String[] args) throws IOException {
//        convert time in seconds to days, hours, min and seconds or reverse
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter time in seconds");
        double sec = Double.parseDouble(reader.readLine());
        System.out.println(sec+ " seconds = "+ sec/60 + " minutes");
        System.out.println(sec+ " seconds = "+ sec/(60*60) + " houers");
        System.out.println(sec+ " seconds = "+ sec/(60*60*24) + " days");

//        calculate the number seconds, minutes, hours, days, weeks, years you’ve been alive
        long birthday = 336312623000l;
        long currentDate = System.currentTimeMillis();
        long alivedYear = currentDate - birthday;
        long year = alivedYear/31556926000l;
        long month = alivedYear/2629743000l;
        long weeks = alivedYear/604800000l;
        long days = alivedYear/86400000l;
        long houers = alivedYear/3600000;
        long min = alivedYear/60000;
        System.out.println("I have been alived "+ year+ " years "+ month +" months "+ weeks+" weeks "+days+" days" +
                " "+houers+" houers "+min+" minutes "+alivedYear+" seconds");

//        Marks conversions
        System.out.println("Enter total mark");
        double total = Double.parseDouble(reader.readLine());
        System.out.println("Enter given  mark");
        double given = Double.parseDouble(reader.readLine());
        double persent = (given / total) * 100;
        System.out.println("Percentage given  mark from total = " + persent + "%");

//        Multiple choice test score
        double correct = 15.2;
        double wrong = 78.88;
        double fin = correct - (1 / 4 * wrong);
        System.out.println("final = " + fin);
    }
}
