import java.util.Scanner;

public class atv04 { 
    public static void main(String[] args) {
    ImprimeArgumento();
}   
    public static void ImprimeArgumento(){
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número : ");
        numero = teclado.nextInt();
        teclado.close();
        if (numero > 0){
            System.out.println("O caractere é P ");
        }
        else {
            System.out.println("O caractere é N ");
        }       
    }
}