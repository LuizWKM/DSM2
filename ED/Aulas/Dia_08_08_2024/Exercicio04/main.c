#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*
    2) Crie um programa em C que recebe 5 valores e calcule:
    A) Quantos nºs pares e nºs impares?
    B) Média entre os 5 valores
    C) Quantos múltiplos de 5?
    */
    int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, pa = 0, im = 0, med = 0, mult = 0, co = 0, te = 0;

    printf("Digite o primeiro valor: ");
    scanf("%d", &n1);
    if(n1 % 5 == 0){
        mult++;
    }
    if(n1 % 2 == 0){
        pa++;
    } else {
        im++;
    }
    printf("Digite o segundo valor: ");
    scanf("%d", &n2);
    if(n2 % 5 == 0){
        mult++;
    }
    if(n2 % 2 == 0){
        pa++;
    }else {
        im++;
    }
    printf("Digite o terceiro valor: ");
    scanf("%d", &n3);
    if(n3 % 5 == 0){
        mult++;
    }
    if(n3 % 2 == 0){
        pa++;
    }else {
        im++;
    }
    printf("Digite o quarto valor: ");
    scanf("%d", &n4);
    if(n4 % 5 == 0){
        mult++;
    }
    if(n4 % 2 == 0){
        pa++;
    }else{
        im++;
    }
    printf("Digite o quinto valor: ");
    scanf("%d", &n5);
    if(n5 % 5 == 0){
        mult++;
    }
    if(n5 % 2 == 0){
        pa++;
    }else{
        im++;
    }
    med = (n1 + n2 + n3 + n4 + n5) / 5;
    printf("O numero de pares eh %d\nO numero de impares eh %d\n", pa,im);
    printf("A media entre os cinco numeros eh %d\nO numero de multiplos de 5 eh %d", med, mult);
}
