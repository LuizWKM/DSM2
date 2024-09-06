#include <stdio.h>
#include <stdlib.h>

#define TAML 4
#define TAMC 4
int main()
{
    int mat[TAML][TAMC];
    int l = 0, c = 0;

    for(l = 0; l < TAML;l++){
        for(c = 0; c < TAMC;c++){
            if(mat[l] == mat[c]){
            mat[l][c] = 1;
            } else{
            mat[l][c] = 0;
            }
        }
    }
    for(l = 0; l < TAML;l++){
        for(c = 0; c < TAMC;c++){
            printf("%d ", mat[l][c]);

        }
        printf("\n");
    }
}
