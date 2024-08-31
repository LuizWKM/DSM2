#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*
    7) Escreva um algoritmo que leia um valor
    inicial A e imprima a sequência de
    valores do cálculo de A! e o seu resultado.
    Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120.
    */
    int i = 0, resultado = 1, n = 0;
    printf("Digite um numero: ");
    scanf("%d", &n);
    printf("%d != %d", n, n);
    resultado = n;
    for(i = n - 1;i >= 1; i--){
        resultado = resultado * i;
        printf(" x %d", i);
    }
    printf(" = %d", resultado);
}
