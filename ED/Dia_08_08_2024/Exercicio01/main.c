#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*
    01 Crie um programa em C que verifica se um nº é par ou impar.
    Em seguida verifique se o número é positivo ou negativo
    */
    int num;
    printf("Digite um numero inteiro: ");
    scanf("%d", &num);
    if(num % 2 == 0){
        printf("O numero eh par");
    } else {
        printf("O numero eh impar");
    }
    if(num > 0){
        printf("\nE o numero eh positivo");
    } else if (num < 0){
        printf("\nE o numero eh negativo");
    } else {
        printf("\nE o numero eh neutro");
    }
}
