#include <stdio.h>
#include <stdlib.h>

#define TAM 10
int main()
{
    //declarar o vetor com 10 posições
    int vet[TAM];
    int i = 0;

    //acessar todas as posições do vetor
    for(i = 0; i < TAM;i++){
      //solicitar os dados ao usuario
        printf("Digite o %d numero: ", i + 1);
        scanf("%d", &vet[i]);
    }

    //imprimir todos os valores do vetor
    for(i = 0; i < TAM;i++){
      printf("\nValor do vetor %d: %d", i + 1, vet[i]);
    }

    //imprimir somente os valores pares
    for(i = 0; i < TAM;i++){
      if(vet[i] % 2 == 0){
        printf("\nO %d numero %d eh par", i + 1,vet[i]);
      }
    }
    printf("\n\n");
    //imprimir somente os valores impares
    for(i = 0; i < TAM;i++){
      if(vet[i] % 2 != 0){
        printf("\nO %d numero %d eh impar", i + 1,vet[i]);
      }
    }

}
