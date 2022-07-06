public class WhileLoop {

    static boolean isTurnOnLight= false;

    public static void main(String[] args) {
        turnOnOffLight();

        int i = 1;
        while (isTurnOnLight && i<=10){
            printSOS();
            i++;
        }
    }
    public static void printSOS(){
        System.out.println("... ___ ...");
    }
    public static boolean turnOnOffLight(){
        //A esto se le conoce como operador ternario
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;

        /* Podemos evitarnos estas lineas haciendo lo mismo
        que arriba

        if (isTurnOnLight) ={
            isTurnOnLight = false;
        }else{
           isTurnOnLight = true;
        }
       return  isTurnOnLight;

         */
    }
}
