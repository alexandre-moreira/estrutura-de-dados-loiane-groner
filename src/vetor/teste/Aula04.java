package loiane_groner.vetor.teste;

import loiane_groner.vetor.Vetor;

public class Aula04 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("Curso");
        vetor.adiciona("Estrutura de dados");

        System.out.println(vetor.tamanho());
        System.out.println(vetor);
    }
}
