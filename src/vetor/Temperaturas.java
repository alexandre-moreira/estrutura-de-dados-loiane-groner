package loiane_groner.vetor;
// [1] - Definicao
// Armazenar temperaturas em um vetor.

public class Temperaturas {
    public static void main(String[] args) {
        // Forma primitiva, usando variáveis
        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;

        // Utilizando um vetor
        double[] temperaturas = new double[5];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 31.7;
        temperaturas[3] = 34;
        temperaturas[4] = 31.1;

        System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);

        System.out.println("O tamanho do array: " + temperaturas.length);

        for(int i=0; i<temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + " é : "+ temperaturas[i]);
        }
        separador();
        for(double temp:temperaturas){
            System.out.println(temp);
        }
    }
    public static void separador(){
        int tamanho=20;
        for (int i=0; i<tamanho; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
