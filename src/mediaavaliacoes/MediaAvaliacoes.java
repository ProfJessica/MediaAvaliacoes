
package mediaavaliacoes;

//Implemente em Java, um código que leia a nota de 3 avaliações de um
//aluno. A primeira avaliação tem peso 2, a segunda tem peso 3 e a
//terceira, peso 5. Calcule a média do aluno. 

//Se a média do aluno for maior ou igual a 7, o aluno está aprovado. 
//Se a média do aluno for maior ou igual a 6 e menor que 7, o aluno irá para avaliação final. 
//E se a média do aluno for menor que 6, o aluno está reprovado. 

//Mostre o resultado das decisões. Para cálculo da média ponderada utilize:


public class MediaAvaliacoes {

    public static void main(String[] args) {
        int n1 = 5; //peso 2
        int n2 = 5; //peso 3
        int n3 = 5; //peso 5
        
        int media = (n1*2 + n2*3 + n3*5)/10;
        
        // variavel1 && variavel2 -> E LÓGICO
        // variavel || variavel2 -> OU LÓGICO
        
        
        // media >= 7 ---> aprovado (if)
        // media >= 6 && media < 7 ---> avaliação final (else if)
        // media < 6 --> reprovado --> else
        
        if(media >= 7){
            System.out.println("Sua média é: " + media + " Parabéns, você foi aprovado!!");
        } else if (media >= 6 && media < 7){
            System.out.println("Sua média é: " + media + " Ops!... Avaliação Final.");
        } else {
            System.out.println("Sua média é: " + media + "! Que pena, você foi reprovado.");
        }
        
    }
    
}
