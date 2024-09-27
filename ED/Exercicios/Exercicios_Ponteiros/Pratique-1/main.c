#include <stdio.h>
#include <stdlib.h>
#define tam 100
int main()
{
    int *pt = NULL;
    int vet[tam];
    int i;
    pt = vet;

    for(i = 0;i < tam;i++){
        *(pt + i) = 0;
        printf("\n%d %d", i, *(pt + i));
    }
    for(i = 0;i < tam;i++){
        *(pt + i) = i + 1;
        printf("\n%d %d", i, *(pt + i));
    }
    return(0);
}
