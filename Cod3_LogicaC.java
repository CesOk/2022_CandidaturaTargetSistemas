public class Cod3_LogicaC {
    public static void main(String[] args) {
        int nEX3 = 0, nEX3QUAD = 0;

        while(nEX3QUAD <= 36){
            System.out.printf("\n%d", nEX3QUAD);
            nEX3QUAD = nEX3 * nEX3;
            nEX3++;
        }
        System.out.printf("\n%d", nEX3QUAD);
    }
}
