import java.util.Scanner;

public class balcão{

public static void main (String[] args){

Scanner nv = new Scanner (System.in);

System.out.println("Seja bem vindo ao meu bar, escolha uma opção de bebida"); // aqui apareceria um menu com as bebidas e os números

int escolha_bebidas = nv.nextInt();

switch (escolha_bebidas){

    case 1 :
            System.out.println("coca-cola");break;
    case 2 :
           System.out.println("suco de abacaxi");break;
    case 3 :  
          System.out.println("coquetel de coco");break;
    default :
         System.out.println("Isso aí não é bebida.");break; 

}

nv.close();
}
}