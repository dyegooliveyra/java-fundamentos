package conditional;

public class Conditional {
    public static void main(String[] args) {
        double salary = 70000;
        double firstTrack = 9.70 / 100;
        double secondTrack = 37.35 / 100;
        double thirdTrack = 49.50 / 100;
        double taxValue;

        if ( salary <= 37712) {
            taxValue = salary * firstTrack;
        } else if ( salary > 37712 && salary <= 68507) {
            taxValue = salary * secondTrack;
        } else {
            taxValue = salary * thirdTrack;
        }

        System.out.println("'Final salary:  " + (salary - taxValue));

        System.out.println("---------------------------");

        byte day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

    }
}
