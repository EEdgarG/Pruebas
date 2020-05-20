/**
 *
 * @author EEdgar
 * @version Beta 1
 * Sabado 25 de noviembre de 2017, 3:11pm
 * Pruebas sobre dudas o curiosidades de java
 */

import java.util.Arrays;
import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args){
        //tiposPrimitivos();
        //arreglos();
//        System.out.printf("%n%d%n", 13 / 13);
        /*int[] arreglo = new int[10];
        Arrays.fill(arreglo, 0);
        int[] bono = new int[18];
        for(int i = 0; i < bono.length; i++)
            bono[i] += 1;*/
        System.out.printf("%d%n", 2%4);
    }
    
    public static void arreglos(){
        int[] arreglo = new int[10];
        
        for(int contador = 0; contador < arreglo.length; contador++){
            if(contador == 5)
                ++arreglo[contador];
        }
        System.out.println();
        for(int contador = 0; contador < arreglo.length; contador++){
            System.out.printf("%d, ", arreglo[contador]);
        }
    }
    
    public static void tiposPrimitivos(){
        Scanner entrada = new Scanner(System.in);
        String cadena = "Introduce un numero entre";
        byte bytep = -128;
        byte byteg = 127;
        short shortp = -32_768;
        short shortg = 32_767;
        int intp = -2_147_483_648;
        int intg = 2_147_483_647;
        long longp = -9_223_372_036_854_775_808L;
        long longg = 9_223_372_036_854_775_807L;
        float floatp = -3.402_823_466_385_288_6E+38F;
        float floatg = 3.402_823_466_385_288_6E+38F;
        double doublep = -1.797_693_134_862_315_7E+308D;
        double doubleg = 1.797_693_134_862_315_7E+308D;
        char caracter;
        
        //prueba con boolean----------------------------------------------------
        boolean valor;
        
        System.out.println("Ingresa un valor boolean: ");
        valor = entrada.nextBoolean();//se escribira true o false
        
        if(valor == false){
            System.out.println("es falso");
        }
        if(valor == true){
            System.out.println("es verdadero");
        }
        
        //prueba con byte-------------------------------------------------------
        byte muyPequeno;
        System.out.print("Prueba con byte\n");
        System.out.printf("%d y %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        
        //prueba con short------------------------------------------------------
        short pequeno;
        System.out.print("Prueba con short\n");
        System.out.printf("%d y %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
        
        //prueba con int--------------------------------------------------------
        int unEntero;
        System.out.print("Prueba con int\n");
        System.out.printf("%d y %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        
        //prueba con long-------------------------------------------------------
        long largo;
        System.out.print("Prueba con long\n");
        System.out.printf("%d y %d%n", Long.MIN_VALUE, Long.MAX_VALUE);
        //prueba con float------------------------------------------------------
        float flotante;
        System.out.print("Prueba con float\n");
        System.out.printf("%f y %f%n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("%f y %f%n", Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY);
        //prueba con double-----------------------------------------------------
        double doblef;
        System.out.print("Prueba con double\n");
        System.out.printf("%f y %f%n", Double.MIN_VALUE, Double.MAX_VALUE);
        //prueba con char-------------------------------------------------------
        System.out.print("Prueba con char\n");
        System.out.println("Introduce un caracter:");
        caracter = entrada.next().charAt(0);
        System.out.println("La letra es: " + caracter);
    }
}
