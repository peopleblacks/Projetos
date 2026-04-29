import java.util.Scanner;

public class banco{

public static void main (String[] args){

Scanner scan = new Scanner(System.in);

double SaldoAtual = 490; // isso é o saldo da conta do nosso indivíduo

int id1 = 1; // id da conta do malandro

System.out.println("Qual operação financeira deseja realizar? Para saque digite 1. Para trasnferencia intercontas, 2 e para ver o extrato, 3");

int operações = scan.nextInt();

switch (operações){

case 1:
if (SaldoAtual>0 && subtração_saldo(SaldoAtual, operações)>0) {

System.out.print("qual a quantia a ser retirada?");

double ValorSaque = scan.nextDouble();

System.out.println("A quantia retirada foi: " + ValorSaque );

System.out.println("O montante restante na conta é: "+ subtração_saldo(SaldoAtual,ValorSaque) );

} else {
    System.out.print("operação invalida");
};break;

case 2:
if (SaldoAtual > 0 ){
System.out.println("Qual o id da outra conta?");

int id2 = scan.nextInt();

System.out.println("Qual o valor a transferir?");

double ValorTransferido = scan.nextDouble();

System.out.println("Transferimos um total de: " + transferencia_saldo (SaldoAtual,ValorTransferido) +" da conta: " + id1 + " para a conta: " + id2);}

else {
System.out.println("Isso é um problema");
};break;



case 3 :

System.out.print("Saldo vigente n conta é: "+ SaldoAtual);break;

default: System.out.println("=("); break;
}

scan.close();

}

public static double subtração_saldo (double SaldoAtual, double ValorSaque){

return SaldoAtual - ValorSaque;

}

public static double transferencia_saldo (double SaldoAtual, double ValorTransferido){

if ( ( SaldoAtual - ValorTransferido) >0 ){ return SaldoAtual - ValorTransferido;}

else{ return 0;}
}

} 

// achar uma forma de colocar operações nees treco sem dar erro. Talvez colocr em métodos fora do strign seja uma resposta viável