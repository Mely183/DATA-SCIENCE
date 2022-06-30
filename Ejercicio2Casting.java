import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio2Casting {
    public static void main(String[] args) {
        /*
        Usando los dos tipos de casting que aprendiste
        (implícito y explícito), resuelve los siguientes
        casteos indicando qué tipo es y si se está calculando
        estimación o exactitud.


        double j = 298.638; //divídelo entre 25 y conviertelo a long
  */
        //------------------------------------------------------------
        char c = 'z' ; //conviertelo a int
        int cI = (int) c;
        System.out.println(cI);

        //------------------------------------------------------------
        int i = 250; //conviertelo a long y luego de long a short
        long li = (long)i; // conversión de int a long
        short lis = (short)li; //conversión de long a short

        System.out.println(i);
        System.out.println(li);
        System.out.println(lis);

        //---------------------------------------------------------------
        double d = 301.067; //conviertelo a long
        long dl = (long)d; //conversión de double a long
        System.out.println(dl);

        //---------------------------------------------------------------
        int e = 100; //súmale 5000.66 y conviertelo a float
        System.out.println((float) e + 5000.66); // se puede convertir directamente desde el sout


        //---------------------------------------------------------------
        int f = 737; //multiplícalo por 100 y conviertelo a byte
        System.out.println((byte) f * 100);


        //---------------------------------------------------------------

        double dd = 298.638; //divídelo entre 25 y conviertelo a long
        System.out.println((long) dd / 25);



    }
}
