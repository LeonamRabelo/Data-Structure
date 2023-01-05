package Ordenacao;

public class HeapSort{
    public void heapSort(Pessoa[]p, int tamanho, int i, int tipo){
    if(tipo==1){
        for(int k = tamanho / 2 - 1; i >= 0; i--){
            aplicarHeapNome(p, tamanho, k);
        }
        for(int j = tamanho-1; j > 0; j--){
            Pessoa aux = p[0];
            p[0] = p[j];
            p[j] = aux;
            
            aplicarHeapNome(p, j, 0);
        }
    }else if(tipo==2){
        for(int k = tamanho / 2 - 1; i >= 0; i--){
            aplicarHeapMatricula(p, tamanho, k);
        }
        for(int j = tamanho-1; j > 0; j--){
            Pessoa aux = p[0];
            p[0] = p[j];
            p[j] = aux;
            
            aplicarHeapMatricula(p, j, 0);
        }
    }else if(tipo==3){
        for(int k = tamanho / 2 - 1; i >= 0; i--){
            aplicarHeapNota(p, tamanho, k);
        }
        for(int j = tamanho-1; j > 0; j--){
            Pessoa aux = p[0];
            p[0] = p[j];
            p[j] = aux;
            
            aplicarHeapNota(p, j, 0);
        }
    }  
    }
    
    public void aplicarHeapNome(Pessoa[]p, int tamanho, int i){
        int raiz = i;
        int esquerda = 2*i + 1;
        int direita = 2*i + 2;
        
        if(esquerda<tamanho && (p[esquerda].getNome().compareTo(p[raiz].getNome())>0)){
            raiz = esquerda;
        }
        if(direita < tamanho && (p[direita].getNome().compareTo(p[raiz].getNome())>0)){
            raiz = direita;
        }
        
        if(raiz != i){
            Pessoa aux = p[i];
            p[i] = p[raiz];
            p[raiz] = aux;
            
            aplicarHeapNome(p, tamanho, raiz);
        }
    }

    public void aplicarHeapMatricula(Pessoa[]p, int tamanho, int i){
        int raiz = i;
        int esquerda = 2*i + 1;
        int direita = 2*i + 2;
        
        if(esquerda<tamanho && (p[esquerda].getMatricula()) > p[raiz].getMatricula()){
            raiz = esquerda;
        }
        if(direita < tamanho && (p[direita].getMatricula() > p[raiz].getMatricula())){
            raiz = direita;
        }

        if(raiz != i){
            Pessoa aux = p[i];
            p[i] = p[raiz];
            p[raiz] = aux;
            
            aplicarHeapMatricula(p, tamanho, raiz);
        }
    }

    public void aplicarHeapNota(Pessoa[]p, int tamanho, int i){
        int raiz = i;
        int esquerda = 2*i + 1;
        int direita = 2*i + 2;
        
        if(esquerda<tamanho && (p[esquerda].getNota()) > p[raiz].getNota()){
            raiz = esquerda;
        }
        if(direita < tamanho && (p[direita].getNota() > p[raiz].getNota())){
            raiz = direita;
        }

        if(raiz != i){
            Pessoa aux = p[i];
            p[i] = p[raiz];
            p[raiz] = aux;
            
            aplicarHeapNota(p, tamanho, raiz);
        }
    }
}
