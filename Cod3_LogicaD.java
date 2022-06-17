public class Cod3_LogicaD {
    public static void main(String[] args) {
        int nEX4 = 2; 
        int nEX4QUAD = nEX4 * nEX4;

        while(nEX4QUAD <= 64){
            System.out.printf("\n%d", nEX4QUAD);
            nEX4 = nEX4 + 2;
            nEX4QUAD = nEX4 * nEX4;
        }
        System.out.printf("\n%d", nEX4QUAD);
    }
}
