import java.util.Scanner;

public class pontuação_bon {
    
public static void main(String[] args) {
    
Scanner entrada = new Scanner(System.in);

int pontuaçao_bonus = 0;
int opcao;
do {

System.out.println("===Você possui um menu de opções para bonificar um morador na assistência social, para sir do programa digite -1===");

         System.out.println("=Para digitar a quantia de pessoas na familia digite 1=");
    
        System.out.println("=Existem deficiêntes na família na familia?Caso haja Digite 2=");
    
        System.out.println("=Para inserir a renda per capta da familia digite 3=");
    
        System.out.println("=Existe algum desempregado? Se sim, ele está assim a quantos meses? digite 4=");
    
        System.out.println("=Qual a taxa de perigo do bairro? lto, médio ou baixo? digite 5=");

  opcao = entrada.nextInt();

if (opcao == 1){
    System.out.println("Quantas pessoas existem na família?");

    int integrantes_familia = entrada.nextInt();

    pontuaçao_bonus = calc_dependentes(integrantes_familia, pontuaçao_bonus);

    System.out.println("Pontuação atual: " + pontuaçao_bonus);
}
else if (opcao == 2){
    System.out.println("Quantos pcds tem na família?");

    int pcds = entrada.nextInt();

    pontuaçao_bonus = qnt_pcd(pcds, pontuaçao_bonus);
    
    System.out.println("Pontuação atual: " + pontuaçao_bonus);
}
else if (opcao == 3){
    System.out.println("Qual a renda per capta da família?");
    int renda_familia = entrada.nextInt();
    pontuaçao_bonus = renda_percpt(renda_familia, pontuaçao_bonus);
    System.out.println("Pontuação atual: " + pontuaçao_bonus);
}
else if (opcao == 4){
    System.out.println("Diga a quantia de meses desempregado");
    int meses_desem = entrada.nextInt();
    pontuaçao_bonus = meses_desempregado(meses_desem, pontuaçao_bonus);
    System.out.println("Pontuação atual: " + pontuaçao_bonus);
}
else if (opcao == 5){
    System.out.println("Diga o nível de risco do bairro");
    System.out.println("Alto: 3 / Médio: 2 / Baixo: 1 / Nulo: 0");
    int risco_bairro = entrada.nextInt();
    pontuaçao_bonus = risco(risco_bairro, pontuaçao_bonus);
    System.out.println("Pontuação atual: " + pontuaçao_bonus);
}




} while ( opcao != -1);

entrada.close();

}



public static int calc_dependentes(int  integrantes_familia, int pontuaçao_bonus){

if ( integrantes_familia >= 5){

return pontuaçao_bonus +3;

}   else if (  integrantes_familia >0 &&  integrantes_familia <5){

return pontuaçao_bonus +2;

} else {

return pontuaçao_bonus +0;

} 

}

public static int qnt_pcd (int pcds, int pontuaçao_bonus){

if (pcds > 2){

    return pontuaçao_bonus +4;

} else if(pcds >=0 && pcds <= 2){

return pontuaçao_bonus +3;

} else {

return pontuaçao_bonus +0;

}


}

public static int renda_percpt (int renda_familia, int pontuaçao_bonus){

if ( renda_familia > 1.600){

return pontuaçao_bonus;

} else if (renda_familia <= 1.600){

return pontuaçao_bonus +2;

} else{

return pontuaçao_bonus +0;

}

}

public static int meses_desempregado (int meses_desem, int pontuaçao_bonus){

if (meses_desem >=12){

return pontuaçao_bonus +4;

} else if (meses_desem >= 3 && meses_desem <= 6){

return pontuaçao_bonus +2;

} else if (meses_desem > 0 && meses_desem <3){

return pontuaçao_bonus + 1;

} else {

return pontuaçao_bonus +0;

}

}

public static int risco (int risco_bairro, int pontuaçao_bonus){

if ( risco_bairro == 3){

return pontuaçao_bonus +3;

}
else if ( risco_bairro == 2){

return pontuaçao_bonus +2;

}
else if (risco_bairro == 1){

return pontuaçao_bonus +1;

}
else if (risco_bairro == 0){

return pontuaçao_bonus +0;

} else {

return pontuaçao_bonus +0;

}


}



}



