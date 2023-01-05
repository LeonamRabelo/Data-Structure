package Ordenacao;

public class MergeSort{

public void mergeSort(int inicio, int fim, Pessoa[] p, int tipo) {
    if(inicio < fim - 1) {
      int meio = (inicio + fim) / 2;

      mergeSort(inicio, meio, p, tipo);
      mergeSort(meio, fim, p, tipo);
      
      //intercala os elementos do vetor ordenando comparando com base no tipo passado por parametro
      switch(tipo){
        case 1: //por nome
        intercalaNome(p, inicio, meio, fim);
        break;

        case 2:
        intercalaMatricula(p, inicio, meio, fim);
        break;

        case 3:
        intercalaNota(p, inicio, meio, fim);

        break;
      }

    }
  }
  private static void intercalaNome(Pessoa[] p, int inicio, int meio, int fim) {
    Pessoa novoVetor[] = new Pessoa[fim - inicio];
    int i = inicio;
    int m = meio;
    int pos = 0;
    
    while(i < meio && m < fim) {
      if(p[i].getNome().compareToIgnoreCase(p[m].getNome()) <= 0) {
        novoVetor[pos] = p[i];
        pos = pos + 1;
        i = i + 1;
      } else {
        novoVetor[pos] = p[m];
        pos = pos + 1;
        m = m + 1;
      }
    }

    while(i < meio) {
      novoVetor[pos] = p[i];
      pos = pos + 1;
      i = i + 1;
    }
    while(m < fim) {
      novoVetor[pos] = p[m];
      pos = pos + 1;
      m = m + 1;
    }

    for(pos = 0, i = inicio; i < fim; i++, pos++) {
      p[i] = novoVetor[pos];
    }
  }

  private static void intercalaMatricula(Pessoa[] p, int inicio, int meio, int fim) {
    Pessoa novoVetor[] = new Pessoa[fim - inicio];
    int i = inicio;
    int m = meio;
    int pos = 0;
    
    while(i < meio && m < fim) {
      if(p[i].getMatricula()!=(p[m].getMatricula())) {
        novoVetor[pos] = p[i];
        pos = pos + 1;
        i = i + 1;
      } else {
        novoVetor[pos] = p[m];
        pos = pos + 1;
        m = m + 1;
      }
    }

    while(i < meio) {
      novoVetor[pos] = p[i];
      pos = pos + 1;
      i = i + 1;
    }
    while(m < fim) {
      novoVetor[pos] = p[m];
      pos = pos + 1;
      m = m + 1;
    }

    for(pos = 0, i = inicio; i < fim; i++, pos++) {
      p[i] = novoVetor[pos];
    }
  }

  private static void intercalaNota(Pessoa[] p, int inicio, int meio, int fim) {
    Pessoa novoVetor[] = new Pessoa[fim - inicio];
    int i = inicio;
    int m = meio;
    int pos = 0;
    
    while(i < meio && m < fim) {
      if(p[i].getNota()!=(p[m].getNota())) {
        novoVetor[pos] = p[i];
        pos = pos + 1;
        i = i + 1;
      } else {
        novoVetor[pos] = p[m];
        pos = pos + 1;
        m = m + 1;
      }
    }

    while(i < meio) {
      novoVetor[pos] = p[i];
      pos = pos + 1;
      i = i + 1;
    }
    while(m < fim) {
      novoVetor[pos] = p[m];
      pos = pos + 1;
      m = m + 1;
    }

    for(pos = 0, i = inicio; i < fim; i++, pos++) {
      p[i] = novoVetor[pos];
    }
  }

}