#include <stdio.h>
#include <stdlib.h>
#define tam 100
int main()
{
    int *pt , vet[tam], i;
    pt = vet;

    for(i = 0;i < tam;i++){
        *(pt + i) = 0;
    }
    for(i = 0;i < tam;i++){
        *(pt+i) = i + 1;
        printf("\n%d", *(pt+i));
    }

}
