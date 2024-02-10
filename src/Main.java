
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double perKm = 2.20, gidilenKm, tutar = 10;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kac kilometre gittiniz : ");
        gidilenKm = scanner.nextInt();
        
        tutar += (gidilenKm * perKm);
        tutar = tutar > 20 ? tutar : 20;
        
        System.out.println("Odenecek tutar : " + tutar);
        
    }
}
