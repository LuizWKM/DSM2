#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*
    6) Escrever um algoritmo que gera e escreve os números ímpares entre 100 e
    200.
    */
    int n;
    for (n = 100; n <=200; n++){
        if(n % 2 != 0){
            printf("%d\n", n);
        }
    }
}
