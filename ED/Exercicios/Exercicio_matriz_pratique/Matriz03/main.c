#include <stdio.h>
#include <stdlib.h>

#define TAML 7
#define TAMC 5
int main()
{
    int mat[TAML][TAMC];
    int l = 0, c = 0, maior = 0, lm = 0, cm = 0;

    for(l = 0; l < TAML;l++){
        for(c = 0; c < TAMC;c++){
            printf("Digite o valor: ");
            scanf("%d",&mat[l][c]);
            if(maior <= mat[l][c]){
                maior = mat[l][c];
                lm = l;
                cm = c;
            }
        }
    }
    printf("Maior numero: %d\nLinha: %d\nColuna: %d",maior, lm, cm);
}
