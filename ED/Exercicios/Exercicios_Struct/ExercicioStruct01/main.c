#include <stdio.h>
#include <stdlib.h>
typedef struct Livro{
    char titulo[100];
    int anoE;
    int numP;
    float preco;
    }liv;
int main()
{
    int i, numPT = 0;
    float mediaP;
    liv vet[2];
    for(i = 0;i < 5;i++){
       printf("\nDigite o titulo do livro: ");
       scanf("%s", &vet[i].titulo);

       printf("Digite o ano da edicao: ");
       scanf("%d", &vet[i].anoE);

       printf("Digite o numero de paginas: ");
       scanf("%d", &vet[i].numP);

       printf("Digite o preco R$");
       scanf("%f", &vet[i].preco);

       numPT += vet[i].numP;
       fflush(stdin);
    }

    mediaP = (float)numPT / 5;
    for(i = 0;i < 5;i++){
        printf("\n\nTitulo do livro: %s\nAno da edicao: %d\n", vet[i].titulo, vet[i].anoE);
        printf("Numero de paginas: %d\nPreco R$%.2f", vet[i].numP, vet[i].preco);
    }
    printf("\nMedia do numero de paginas: %.2f\n\n", mediaP);
    return(0);
}
