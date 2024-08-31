#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*
    3) Desenvolver um algoritmo que leia um número não determinado de valores e
    calcule e escreva a média aritmética dos valores lidos, a quantidade de valores
    positivos, a quantidade de valores negativos e o percentual de valores negativos
    e positivos.
    */
    int i = 1, ns = 0, qtdp = 0, qtdn = 0;
    float med, n, cal, pn, pp;
    while (i != 0){
        if(ns == 0){
        printf("Quer digitar um numero?\nCaso sim, digite 1\nCaso nao, digite 0\n");
        scanf("%d", &i);
        }else{
        printf("Quer continuar digitando numeros?\nCaso sim, digite 1\nCaso nao, digite 0: ");
        scanf("%d", &i);
        }
        ns ++;
        if(i != 0){
        printf("Digite o %d numero: ", ns);
        scanf("%f", &n);
        cal = cal + n;
        if(n < 0){
        qtdn++;
        } else{
        qtdp++;
        }
        } else if (ns == 1){
        return 0;
        }
    }
    ns = ns - 1;
    pp = ((float)qtdp / ns) * 100;
    pn = ((float)qtdn / ns) * 100;
    med = cal / ns;
    printf("\nA media aritmetica eh: %.2f", med);
    printf("\nA quantidade de valores positivos eh: %d", qtdp);
    printf("\nA quantidade de valores negativos eh: %d", qtdn);
    printf("\nO percentual de valores positivos eh: %.2f", pp);
    printf("\nO percentual de valores negativos eh: %.2f", pn);
}
