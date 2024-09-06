#include <stdio.h>
#include <stdlib.h>
#define TAM 4
int main()
{
    /*
    Exercício 01: Crie um programa em C que armazene 4 notas
    de um aluno em um vetor, em seguida, calcule a média aritmética
    entre essas notas.
    */
    float nota[TAM];
    int i;
    float media, mediaT;

    for(i = 0;i < TAM;i++){
        printf("Digite a %d nota: ", i + 1);
        scanf("%f", &nota[i]);
        media = media + nota[i];
    }
    media = media / 4;
    printf("A media do aluno eh: %.2f", media);

}
