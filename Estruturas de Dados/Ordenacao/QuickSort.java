package Ordenacao;
import java.util.Comparator;

public class QuickSort<T>{

    public boolean quickSort(T[] vetor, Comparator<T> comparador) {
        if (vetor == null || comparador == null) {
            return false;
        }
        int inicio = 0;
        int fim = vetor.length - 1;
        return quickSort(vetor, comparador, inicio, fim);
    }

    private boolean quickSort(T[] vetor, Comparator<T> comparador, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, comparador, inicio, fim);
            quickSort(vetor, comparador, inicio, posicaoPivo - 1);
            quickSort(vetor, comparador, posicaoPivo + 1, fim);
        }

        return true;
    }

    private int separar(T[] vetor, Comparator<T> comparador, int inicio, int fim) {
        T pivo = vetor[inicio];
        int i = inicio + 1, f = fim;

        while (i <= f) {
            if (comparador.compare(vetor[i], pivo) <= 0) {
                i++;
            } else if (comparador.compare(pivo, vetor[f]) < 0) {
                f--;
            } else {
                T troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }

        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}