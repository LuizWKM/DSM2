#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*
    1) Desenvolver um algoritmo que efetue a soma de todos os n�meros �mpares
    que s�o m�ltiplos de 5 e que se encontram no conjunto dos n�meros de 1 at�
    1000.
    */
    int som, i;
    for (i = 1; i <= 1000; i++){
        if(i % 2 != 0 && i % 5 == 0){
            som = som + i;
            printf("%d\n", i);
        }
    }
    printf("A soma de todos os numeros eh %d", som);
}
