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
    int i;
    double mediaP = 0;
    liv livros[5];
    for(i = 0;i < 5;i++){
       fflush(stdin);
       printf("\nDigite o titulo do livro: ");
       scanf("%s", &livros[i].titulo);
       fflush(stdin);
       printf("Digite o ano da edicao: ");
       scanf("%d", &livros[i].anoE);

       printf("Digite o numero de paginas: ");
       scanf("%d", &livros[i].numP);

       printf("Digite o preco R$");
       scanf("%f", &livros[i].preco);

       mediaP += livros[i].numP;
       fflush(stdin);
    }

    mediaP /= 5.00;
    for(i = 0;i < 5;i++){
        printf("\n\nTitulo do livro: %s\nAno da edicao: %d\n", livros[i].titulo, livros[i].anoE);
        printf("Numero de paginas: %d\nPreco R$%.2f", livros[i].numP, livros[i].preco);
    }
    printf("\n\nMedia do numero de paginas: %.2lf\n\n", mediaP);
    return(0);
}
