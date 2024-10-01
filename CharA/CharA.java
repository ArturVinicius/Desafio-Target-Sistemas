package CharA;

/* 2) Escreva um programa que verifique, em uma string, a existência da letra
 ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes
 em que ela ocorre.*/

public class CharA {

    public static void ocurrenceA (String text){

        text = text.toLowerCase();
        int count=0;
        for (int i=0;i<text.length();i++){
            if(text.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Nessa frase ou texto teve um total de : " + count +" ocorrencias da letra a");
    }
}
