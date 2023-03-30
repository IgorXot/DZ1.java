import java.util.Scanner;

public class zadacha1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in); 
            System.out.printf("Введите первое число: ");
            int i = scanner.nextInt();


            
            System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
            scanner.close();
    }
    
    public static int giveMeNumber(int a) {
            return (a * (a + 1)) / 2;
    }   
}
