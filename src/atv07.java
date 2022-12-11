import java.util.Scanner;

public class atv07 {

            static double valorTotal = 0;
            static int quantidadePrestacoesPagas = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double valorDaPrestação = 1;
        int diasEmAtraso;


        while(valorDaPrestação != 0){
            System.out.println("Digite o valor da prestação:");
            valorDaPrestação = sc.nextDouble();
            if(valorDaPrestação != 0) {
                System.out.println("Digite o número de dias em atraso:");
                diasEmAtraso = sc.nextInt();
                valorTotal += valorPagamento(valorDaPrestação, diasEmAtraso);
            }  
            
        }


        System.out.println("Quantidade de prestações pagas: " + quantidadePrestacoesPagas);
        System.out.println("Valor total pago: R$" + valorTotal);

    }
    public static double valorPagamento(double valorDaPrestação, int diasEmAtraso){
        if(diasEmAtraso > 0){
            double multa = valorDaPrestação * 0.03;
            double juros = valorDaPrestação * (diasEmAtraso * 0.01);
            quantidadePrestacoesPagas++;
            return multa + juros + valorDaPrestação;
        } else {
            quantidadePrestacoesPagas++;
            return valorDaPrestação;
        }

    }
}