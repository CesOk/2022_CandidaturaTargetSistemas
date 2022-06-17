public class Cod5_InvString {
    public static void main(String[] args) {
        String inverter = "Ola";
        String invertido = "";
        int QTDchar = inverter.length();

        System.out.println(inverter);
        while(QTDchar>0){
            invertido = invertido + inverter.substring(QTDchar-1,QTDchar);
            QTDchar--;
        }
        System.out.println(invertido);
    }
}
