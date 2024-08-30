#include <stdio.h>
#include <stdlib.h>

#define TAM 5
int main()
{
    //declarar o vetor com 5 posicoes
    int numeros[TAM], copia[TAM], i;

    // solicitar os valores
    for(i = 0; i < TAM; i++){
        printf("\n Informe o valor %d: ", i + 1);
        scanf("%d", &numeros[i]);
    }

    //copiar os valores
    for(i = 0; i < TAM; i++){
        copia [i] = numeros[i];
    }

    //imprimir os valores do vetor copia
    for(i = 0; i < TAM; i++){
        printf("\n%d", copia[i]);
    }

    return 0;
}

