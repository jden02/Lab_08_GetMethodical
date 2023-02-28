import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birthYear = SafeInput.getRangedInt(sc, "Enter the year you were born", 1950,2015);
        int birthMonth = SafeInput.getRangedInt(sc, "Enter your birth month", 1, 12);
        int maxDays = 0;
        switch(birthMonth){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: maxDays = 31;
                break;
            case 2: maxDays = 29;
                break;
            case 4: case 6: case 9: case 11: maxDays = 30;
                break;
            default:
                System.out.println("Error Invalid Month");
                break;
        }
        int birthDay = SafeInput.getRangedInt(sc, "Enter the day you were born", 1, maxDays);

        int birthHour = SafeInput.getRangedInt(sc, "Enter the hour that you were born in 24hr format", 0, 24);
        int birthMinute = SafeInput.getRangedInt(sc, "Enter the minute you were born", 0, 59);

        System.out.println("Your birthday is: " + birthMonth + '/' + birthDay + '/' + birthYear + " at " + birthHour + ':' + birthMinute);
    }
}
