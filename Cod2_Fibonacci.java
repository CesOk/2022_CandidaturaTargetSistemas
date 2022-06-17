public class Cod2_Fibonacci {
    public static void main(String[] args) {
        int fibo1 = 0, fibo2 = 1, fiboSoma = 0, n = 35, pertence = 0;

        while(fiboSoma <= n){
            fiboSoma = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fiboSoma;

            if(fiboSoma == n)
                pertence = 1;
        }

        if(pertence == 1){
            System.out.println("pertence a sequencia");
        }
        else{
            System.out.println("nao pertence a sequencia");
        }
    }
}
