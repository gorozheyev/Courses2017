package lecture_2;

/**
 * Created by gorozheyevd on 06.10.2017.
 */

import static java.lang.Math.*;

public class HomeworkWritingFormulas {
    public static void main(String[] args) {

//        formula #9
        double x9 = 9.0;
        double y9 = 1.1*(pow(E, -x9)) + abs(cos(sqrt(PI*x9))) - 3/8;
        System.out.println(y9);
//        formula #10
        double x10 = 20.0;
        double y10 = 1/3*(sqrt(abs(sin(x10))))*pow((pow(E, 0.12)), 1/3);
        System.out.println(y10);
//        formula #11
        double x11 = 8.0;
        double y11 = 2*PI*x11 - abs(sin(sqrt(10.5*x11)))*(1/(pow(pow(x11,2),1/3)) + 1/7);
        System.out.println(y11);
//        formula #12
        double x12 = 17.0;
        double y12 = log(sqrt(abs(2-x12))+1.2)*(1/(2+pow(E, -x12)))+pow(2/x12 ,1/3);
        System.out.println(y12);
//        formula #13
        double x13 = 10.0;
        double y13 = (pow(pow(E, -2),1/5))*1/(sqrt(pow(x13, 2)+pow(x13, 4)+log(abs(x13-3.14))));
        System.out.println(y13);
//        formula #14
        double x14 = 15.0;
        double y14 = (sqrt(pow(sin(x14/2),3))+(pow(pow(E, 1.3*x14)+pow(E,-1/3*x14),1/3)))*1/(abs(x14+5/2));
        System.out.println(y14);
//        formula #15
        double x15 = 25.0;
        double y15 = (abs(x15*log(x15)-4)*sqrt(x15))*1/(pow(pow(E, 4*x15-1),1/5));
        System.out.println(y15);
//        formula #16
        double x16 = 45.0;
        double y16 = pow((pow(E,2*x16)*sqrt(x16)-(x16+1/3)/x16),1/3)*(cos(2.5*x16));
        System.out.println(y16);
//        formula #17
        double x17 = 1.25;
        double y17 = (pow(x17,3)/3 - pow(E, x17))*log(pow(1.3, 3)+pow(x17, 3))+4/3;
        System.out.println(y17);
//        formula #18
        double x18 = 5.25;
        double y18 = (abs(7.2 - 10*x18))/(pow(pow(x18,2)+pow(E,x18),1/3))*atan(4*(x18/3)/(sqrt(pow(1.1,3)+pow(x18, 2))));
        System.out.println(y18);
//        formula #19
        double x19 = 12.25;
        double y19 = acos(tan(5*x19/PI))+pow(x19, 3.2)/28;
        System.out.println(y19);
        //        20
        double x20 = 2.0;
        double y20 = (pow(log(2.0) * x20, 1.0 / 3) + tan(cos(PI * x20))) * abs(log(x20 / 10.5) + 1.0 / 3);
        System.out.println(y20);

//        21
        double x21 = 5.2;
        double y21 = (pow(log(x21),1/4)+acos(x21+3))*1/(abs(x21+2*(pow(x21,2))));
        System.out.println(y21);
//        22
        double x22 = 2.2;
        double y22 = asin(log(x22)/(pow(x22, 2)+5*x22+1))- pow(x22, 3.2)/28;
        System.out.println(y22);
//        23
        double x23 = 2.3;
        double y23 = acos(tan(5 * x23 / PI)) + pow(x23, 5.7) / 23;
        System.out.println(y23);
//        24
        double x24 = 2.4;
        double y24 = atan(abs(8.3 - 21 * pow(x24, 2) - 0.8 * x24) / pow(2.5 + 1.0 / pow(x24, 2), 1.0 /3));
        System.out.println(y24);
//        25
        double x25 = 0.5;
        double y25 = pow(log10(acos(abs(pow(x25, 3.4) + 2.5 * pow(x25, 1.2) - 0.7) / pow(pow(E, 2.5 * x25), 1.0 / 3))), 1.0 / 4);
        System.out.println(y25);
//        26
        double x26 = 2.6;
        double y26 = log10(sin(x26)) + 2 * pow(E, x26) + 2 * cos(x26) + 2;
        System.out.println(y26);
    }
}
