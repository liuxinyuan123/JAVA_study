import java.util.Scanner;


public class test_2_2 {
    public static void main(String[] args) {

        int R;
        //R = read ability, the fist number of the report.

        int S;
        //S = strength, the second number of the report.

        Scanner in = new Scanner(System.in);

        int report;
        report = in.nextInt();

        R = report / 10;
        //catch the first number of the report;

        report = report - R * 10;
        S = report;
        //catch the second number of the report;

        String report_R = null;
        String report_S = null;

        switch ( R ){
            case 1:
                report_R = "unreadable";
                break;
            case 2:
                report_R = "barely readable, occasional words distinguishable";
                break;
            case 3:
                report_R = "readable with considerable difficulty";
                break;
            case 4:
                report_R = "readable with practically no difficulty";
                break;
            case 5:
                report_R = "perfectly readable";
                break;
        }


        switch ( S ){
            case 1:
                report_S = "Faint signals, barely perceptible";
                break;
            case 2:
                report_S = "Very weak signals";
                break;
            case 3:
                report_S = "Weak signals";
                break;
            case 4:
                report_S = "Fair signals";
                break;
            case 5:
                report_S = "Fairly good signals";
                break;
            case 6:
                report_S = "Good signals";
                break;
            case 7:
                report_S = "Moderately strong signals";
                break;
            case 8:
                report_S = "Strong signals";
                break;
            case 9:
                report_S = "Extremely strong signals";
                break;
        }

        System.out.print(report_S + ", " + report_R + ".");

    }
}