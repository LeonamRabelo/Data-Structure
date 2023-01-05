package Ordenacao;

public class InsertionSort{
     void insertionSort(Pessoa p[], int tamanho, int tipo){
        if(tipo==1){
        Pessoa aux[] = new Pessoa[tamanho];
        for(int i=0;i<tamanho;i++){
            aux[i]=p[i];
            for(int j=i;j>0;j--){
            if((aux[i].getNome().compareTo(p[j-1].getNome())<0)){
                p[j] = p[j-1];
                p[j-1] = aux[i];
            }
        }
        }
        }

        if(tipo==2){
        Pessoa aux[] = new Pessoa[tamanho];
        for(int i=0;i<tamanho;i++){
            aux[i]=p[i];
            for(int j=i;j>0;j--){
            if((aux[i].getMatricula()<p[j-1].getMatricula())){
                p[j] = p[j-1];
                p[j-1] = aux[i];
            }
        }
        }
        }

        if(tipo==3){
            Pessoa aux[] = new Pessoa[tamanho];
            for(int i=0;i<tamanho;i++){
                aux[i]=p[i];
                for(int j=i;j>0;j--){
                if((aux[i].getNota()<p[j-1].getNota())){
                    p[j] = p[j-1];
                    p[j-1] = aux[i];
                }
            }
            }
            }
    }
}