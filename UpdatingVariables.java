public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono $200
        salary = salary + 200;

        System.out.println("Tu salario es de: " + salary);

        //pension: $50 descuento

        salary = salary - 50;
        System.out.println("Tu saldo final es de: " + salary);

        // 2 horas extra $30 c/u
        //Comida: $45

        salary = salary + (30*2) - 45;
        System.out.println("Tu saldo final es de: " + salary);

        //Actualizando cadenas de texto
        String employeeName = "Melissa Villarreal";
        employeeName = employeeName + " Campos";
        System.out.println(employeeName);

    }
}
// Es importante reutilizar las variables para no desperdiciar
//memoria de RAM
