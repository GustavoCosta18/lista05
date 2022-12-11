public class atv05 {
    public static void main(String[] args) {
        double sm = somaImposto(10,200);
        System.out.println(" O valor total do produto é: " +sm);
    }
    public static double somaImposto(double taxaImposto, double custo){      
        taxaImposto = (taxaImposto/100);
        double totalProduto = (custo * (1 + taxaImposto));
        System.out.println(totalProduto);
        return totalProduto;
    }
}