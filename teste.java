import java.util.Scanner;

public class teste{

public static void main (String[] args){

Scanner entrada = new Scanner(System.in);

double saldo = 500;
int id1 = 1;
int id2 = 0;
int opcao = 0;
do{

System.out.println("----Digite qual função será executada hoje----");
System.out.println("----Digite 1 para sacar o dinheiro----");
System.out.println("----Digite 2 para ver o extrato da sua conta----");
System.out.println("----Digite 3 para realizar uma transferência monetária----");
System.out.println("----Digite 4 para sair do programa----");

 opcao = entrada.nextInt();

if(saldo > 0 && opcao == 1){

System.out.println("Qual o valor a ser retirado da sua conta bancária?");

double subt_saldo = entrada.nextDouble();

System.out.println("A quantia retirada da conta foi de: "+ subt_saldo);

System.out.println("O seu saldo restante na conta é de: " + saque_conta(saldo, subt_saldo));

} else if (saldo > 0 && opcao == 2){

System.out.println("Seu saldo é de: " + saldo);

}
else if (saldo >0 && opcao == 3 && id1 != id2){

System.out.println("Para qual outra conta você gostria de transferir o dinheiro? Digite o id dela");

id2 = entrada.nextInt();

System.out.println("Qual a quantia desejada para ser transferida?");

double transferencia = entrada.nextDouble();

System.out.println("Portanto o valor de: " + transferencia + " foi transferido da conta 1 para a conta " + id2 );

System.out.println("E o restante que sobrou na sua conta foi de: " + transferencia_interbancaria(saldo, transferencia));
}
else {

System.out.println("Saindo do sistema");

}

}while(opcao != 4);

}


public static double saque_conta (double saldo , double subt_saldo){

if(saldo>subt_saldo){

return saldo - subt_saldo;

} else{

return 0;

}

}
public static double transferencia_interbancaria (double saldo, double tranferencia){

if ( saldo > tranferencia){

return saldo - tranferencia;


} else {

return 0;

}
}
}