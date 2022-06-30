public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnable = false;
        int fileSended = 3;

        if(isBluetoothEnable){
            //Send file
            fileSended ++;
            System.out.println("Archivo Enviado");
        }
        else{
            fileSended--;
            System.out.println("Por favor enciente tu Bluetooth,para inicial la transferencia");
        }
    }
}
