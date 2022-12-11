import java.util.Scanner;
public class atv03 {
    public static void main(String[] args) {
        
        SomaNumeros(5, 5, 5);     
    
    }
    static void SomaNumeros(double a, double b, double c){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o argumento a: ");	        
	    a = teclado.nextDouble();
        System.out.println("Digite o argumento b ");
        b = teclado.nextDouble();
        System.out.println("Digite o argumento c ");
        c = teclado.nextDouble();
        double soma = a + b + c;
        System.out.println("A soma dos três argumentos é: " + soma);
    }
        
    }