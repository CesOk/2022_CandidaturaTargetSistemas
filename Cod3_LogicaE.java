public class Cod3_LogicaE {
    public static void main(String[] args) {
        int nEX5 = 1, nEX5PROX = 1, nEX5SOMA = 1;

        while(nEX5SOMA <= 8){
            System.out.printf("\n%d",nEX5SOMA);
            if(nEX5SOMA == 1){
                System.out.printf("\n%d",nEX5SOMA);
            }
            nEX5SOMA = nEX5 + nEX5PROX;
            nEX5 = nEX5PROX;
            nEX5PROX = nEX5SOMA;
        }
        System.out.printf("\n%d", nEX5SOMA);
    }
}
