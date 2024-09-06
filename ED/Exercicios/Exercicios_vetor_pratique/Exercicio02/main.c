#include <stdio.h>
#include <stdlib.h>

#define TAM 5
int main()
{
    /*
    Exercício 02: Crie um programa em C para armazenar
    números fornecidos pelos usuários em 2 vetores inteiros
    de 5 elementos cada. Em seguida, imprima a soma das posições
    equivalentes.
    */
    int vet1[TAM], vet2[TAM];
    int i = 0, soma;

    for(i = 0; i < TAM;i++){
        printf("Digite o %d numero do vetor 1: ", i + 1);
        scanf("%d", &vet1[i]);
        printf("Digite o %d numero do vetor 2: ", i + 1);
        scanf("%d", &vet2[i]);
    }
    for(i = 0; i < TAM;i++){
        soma = vet1[i] + vet2[i];
        printf("\nA soma dos vetores da posicao %d, de numeros %d e %d eh: %d", i + 1, vet1[i], vet2[i], soma);
    }
}
