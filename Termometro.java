import java.util.Scanner;

import java.util.Locale;

public class Termometro {
    
public static void main (String[] args){

Locale.setDefault(Locale.US);

Scanner entrada = new Scanner(System.in);

double temperatura;

do{ 
    System.out.println("Qual a temperatura? e para sair do programa é só digitar -1 aqui");

temperatura = entrada.nextDouble();
entrada.nextLine();

System.out.println("De qual sistema de medida essa temperatura vem?");

String texto1 = entrada.nextLine().toLowerCase().trim();

System.out.println("E para qual vai?");

String texto2 = entrada.nextLine().toLowerCase().trim();

if (texto1.equals("celsius") && texto2.equals("fahrenheit"))
    {

System.out.printf(" Convertendo de celsius para fahrenheit, tem-se que: %.2f\n", temp_Cel_fah(temperatura));

}  else if (texto1.equals("celsius") && texto2.equals("kelvin" ))
    {

System.out.printf("Convertendo Celsius para Kelvin, tem-se que: %.2f\n", temp_Cel_kel(temperatura) );

} else if (texto1.equals("fahrenheit") && texto2.equals("celsius"))
    {

    System.out.printf("Convertendo de Fahrenheit para Celsius, tem-se que: %.2f\n ",  temp_Fah_cel(temperatura)); 

} else if (texto1.equals("fahrenheit") && texto2.equals("kelvin"))
    {

System.out.printf("Convertendo de Fahrenheit para Kelvin, tem-se: %.2f\n ", temp_Fah_kel(temperatura));

} else if (texto1.equals("kelvin") && texto2.equals ("celsius" ))
    {

System.out.printf("Convertendo Kelvin para Celsius, tem-se: %.2f\n" + temp_Kel_cel(temperatura));

} else if (texto1.equals("kelvin") && texto2.equals("fahrenheit"))
    {

System.out.printf("Convertendo de Kelvin para Fahrenheit,tem-se: %.2f\n", temp_Kel_fah(temperatura));

} else System.out.println("Resposta invalida");

} while( temperatura <10000000 || temperatura != -1);

entrada.close();
}

public static double temp_Cel_fah  (double temperatura){

return (temperatura * 9/5) + 32;

} 

public static double temp_Cel_kel (double temperatura){

return temperatura + 273.15;

}

public static double temp_Fah_cel (double temperatura){

return (temperatura - 32) * 5/9;

}

public static double temp_Fah_kel (double temperatura){

return (temperatura - 32) * 5/9 + 273.15;

}

public static double temp_Kel_cel (double temperatura){

return temperatura - 273.15;

}

public static double temp_Kel_fah  (double temperatura){

return (temperatura - 273.15) * 9/5 + 32;

}

}