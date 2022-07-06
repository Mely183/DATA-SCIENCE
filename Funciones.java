public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Área de un ciruclo
        //pi * r2
        cicleArea(y);  //28.274333882308138

        //Área de una esfera
        //4*PI*r2
        sphereArea(y); //113.09733552923255

        //Volumen de una esfera
        //(4/3)*pi*r3
        sphereVolumen(y); //84.82300164692441

        System.out.println("Pesos a Dolares: " + converToDolar(200,"MXN"));

    }
   /*Las funciones deben vivir al nivel de la clase, por eso
    por eso nos salimos del main */

    public static double cicleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);


    }
    /**
     * Descripción: Función que especificando su moneda convierte
     * una cantidad de dinero a dolares.
     *
     * @param quantity  Cantidad de dinero
     * @param currency  Tipo de Moneda, solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     * */
    public static double converToDolar(double quantity, String currency){
    //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
