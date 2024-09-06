#include <stdio.h>
#include <stdlib.h>

#define TAML 2
#define TAMC 2
int main()
{
    int mat[TAML][TAMC];
    int l = 0, c = 0, maior = 0;

    for(l = 0; l < TAML;l++){
        for(c = 0; c < TAMC;c++){
            printf("Digite o valor: ");
            scanf("%d",&mat[l][c]);
            if(maior <= mat[l][c]){
                maior = mat[l][c];
            }
        }
    }
    printf("%d",maior);
}
