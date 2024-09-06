#include <stdio.h>
#include <stdlib.h>

#define TAML 5
#define TAMC 5
int main()
{
    int mat[TAML][TAMC];
    int vet[5];
    int l = 0, c = 0, dp = 0;

    for(l = 0; l < TAML;l++){
        for(c = 0; c < TAMC;c++){
            if(mat[l] == mat[c]){
            mat[l][c] = 1;
            vet[c] = mat[l][c];
            } else{
            mat[l][c] = 0;
            }
        }
    }

        for(c = 0; c < TAMC;c++){
            printf("%d ", vet[c]);
        }
        printf("\n");

}
