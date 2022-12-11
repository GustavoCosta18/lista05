import java.util.Scanner;

public class atv09 {
    public static void main(String[] args) {
        int value;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        value = teclado.nextInt();        
        String inteiro = Integer.toString(value);
       
        System.out.println(reverse(inteiro));

        
        }
        
        
        public static String reverse (String value){
            String reverse = "";
            for (int i = (value.length()-1); i>=0; i--){
                reverse += value.charAt(i);                
            }
            System.out.println(" ");
            System.out.print("reverso do número informado: ");
            return reverse;
        }   
}

