import java.util.Scanner;

public class atv08 {
    public static void main(String[] args) {
            quantidadeDigitos();
       
        
        }
        
        public static void quantidadeDigitos(){
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero;
        numero = teclado.nextInt(); 
        teclado.close();       
        String quantidadeNumeros = Integer.toString(numero);
        System.out.print("Quantidade de dígitos: ");
        System.out.println(quantidadeNumeros.length());
            
    }
       
}