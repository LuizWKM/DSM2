#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*
    1) Desenvolver um algoritmo que efetue a soma de todos os números ímpares
    que são múltiplos de 5 e que se encontram no conjunto dos números de 1 até
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
