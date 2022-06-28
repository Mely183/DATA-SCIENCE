public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;
        long nL = 1234567890L;
        // para distinguir el número como long es colocando
        //una L al final del dato
        double nD = 123.4561234;
        // usualmente double se usa cuando quieres realizar
        //un calculo matematico con mucha presición

        float nF = 123.345F;
        // para diferenciar el double del float es necesario
        //colocar una F al final de los digitos

        var salary = 1000; // int
        //pensión 3%
        var pension = salary*0.03; //double
        var totalSalary = salary - pension;
        System.out.println("Tu salario es de: " + salary);
        System.out.println("El deposito de tu pensión es: " + pension);
        System.out.println("Tu saldo total es de: " + totalSalary);

        var employeeName = "Melissa Villarreal";
        System.out.println("EMPLOYEE: " + employeeName + " \nSALARY: " + totalSalary);
    }

}


//  TIPOS DE DATOS
//byte= -128 a 127 ---------------------> 1 byte
//short= -32,768 a 32,767----------------> 2 byte
//int= -2,147,483,648 a 2,147,483,647----> 4 byte
//long= -9,223,372,036,854,775,808 a +9,223,372,036,845,775,807

// PARA NÚMEROS PUNTO FLOTANTE

// float= ---------------->4 bytes
// double=---------------->8 bytes

// PARA TEXTOS
// char= es de rango unico solo puede tener un caracter

// PARA LOS LÓGICOS
// boolean= True o False