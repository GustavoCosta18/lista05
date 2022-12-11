import java.util.Scanner;
public class atv06 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        System.out.print("Digite as horas: ");
        int horas = sc.nextInt();
        System.out.print("Digite os minutos: ");
        int minutos = sc.nextInt();
        sc.close();

        if(horas > 12) {
            horas = horas - 12;
            System.out.print(horas + ":" + minutos + " P.M.");
        }
        else {
            System.out.print(horas + ":" + minutos + " A.M.");
        }
    }
}