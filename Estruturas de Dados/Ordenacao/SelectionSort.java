package Ordenacao;

public class SelectionSort{
void selectionSort(Pessoa p[],int tamanho, int tipo){
    int menor;
    Pessoa aux[] = new Pessoa[tamanho];
    if(tipo==1){
    for (int i =0;i<tamanho-1;i++){
            menor=i;
        for(int j=i+1; j<tamanho; j++){
            if(p[menor].getNome().compareTo(p[j].getNome())>0)
                menor=j;
        }
            if(i!=menor){
                aux[i]=p[i];
                p[i] = p[menor];
                p[menor]=aux[i];
            }
        }
    }
        if(tipo==2){
        for (int i =0;i<tamanho-1;i++){
                menor=i;
            for(int j=i+1; j<tamanho; j++){
                if(p[menor].getMatricula()>p[j].getMatricula())
                    menor=j;
            }
                if(i!=menor){
                    aux[i]=p[i];
                    p[i] = p[menor];
                    p[menor]=aux[i];
                }
            }
        }
        if(tipo==3){
            for (int i =0;i<tamanho-1;i++){
                    menor=i;
                for(int j=i+1; j<tamanho; j++){
                    if(p[menor].getNota()>p[j].getNota())
                        menor=j;
                }
                    if(i!=menor){
                        aux[i]=p[i];
                        p[i] = p[menor];
                        p[menor]=aux[i];
                    }
                }
            }
    }
}