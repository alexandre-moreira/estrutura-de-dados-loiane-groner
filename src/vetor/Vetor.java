package loiane_groner.vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

   /*
   Exemplo01
   public void adiciona(String elemento){
        for (int i = 0; i<this.elementos.length;i++){
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }
    Exemplo02
    public void adiciona(String elemento) throws Exception {
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }else{
            throw new Exception("Vetor já está cheio, nao é possível adicionar mais elementos.");
        }
    }
*/
    //Exemplo03
    public boolean adiciona(String elemento) {
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }else{
            return false;
        }
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i=0; i<this.tamanho-1;i++){
            s.append(elementos[i]);
            s.append(", ");
        }

        if(this.tamanho>0){
            s.append(elementos[this.tamanho-1]);
        }
        s.append("]");

        return s.toString();
    }
}
