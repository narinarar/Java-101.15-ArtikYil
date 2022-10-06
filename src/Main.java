import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;
        boolean leapyear;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        year = scanner.nextInt();

        if (year % 4 == 0 ) {
            if (year % 100 == 0){
                if (year % 400 == 0){
                   leapyear = true;
                }else {
                    leapyear = false;
                }
            }else {
                leapyear = true;
            }
        }else {
            leapyear = true;
        }

        if (leapyear) {
            System.out.println(year + " yılı artık bir yıldır.");
        }else {
            System.out.println(year + " yılı artık bir yıl değildir.");
        }
    }
}