#include <stdio.h>
#include <stdlib.h>

#define TAML 4
#define TAMC 3
int main()
{
    //declarar uma matriz
    int mat[TAML][TAMC];
    //contadores para a linha e a colua
    int l = 0, c = 0, qtdPares = 0;

    //preencher todas as posições com o valor 0
    for(l = 0; l < TAML;l++){ //caminha pelas linhas da matriz
        for(c = 0; c < TAMC;c++){ //caminha pelas colunas da matriz
        mat[l][c] = 0; //atribui 0 a linha l e coluna c
        }
    }
    //preencher a matriz com valores informados pelo usuario
    for(l = 0; l < TAML;l++){ //caminha pelas linhas da matriz
        for(c = 0; c < TAMC;c++){ //caminha pelas colunas da matriz
        printf("\nInforme o valor"); //solicita o valor
        scanf("%d", &mat[l][c]); //armazena o valor em mat[l][c]
        }
    }
    for(l = 0; l < TAML;l++){ //caminha pelas linhas da matriz
        for(c = 0; c < TAMC;c++){ //caminha pelas colunas da matriz
        if(mat[l][c] % 2 == 0){ //verifica valores pares
        qtdPares++; //soma a quantidade de pares
        }
        }
    }
    printf("O numero de pares eh: %d", qtdPares);
    return 0;
}
