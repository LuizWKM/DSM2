#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*
    5) Fa�a um algoritmo estruturado que
    leia uma quantidade n�o determinada de
    n�meros positivos. Calcule a quantidade
    de n�meros pares e �mpares, a m�dia
    de valores pares e a m�dia geral dos n�meros
    lidos. O n�mero que encerrar� a leitura ser� zero.
    */
    int i = 1, np = 0, ni = 0, ia = 0, num = 0;
    float calp = 0, calg = 0, mp = 0, mg = 0;
    printf("\nQuer comecar a digitar numeros?\nSe sim, digite 1\nSe nao, digite 0\n");
    scanf("%d", &i);
    printf("\nOBS: digite apenas numeros positivos!");
    while(i != 0){
        printf("\nDigite o %d numero: ", ia + 1);
        scanf("%d", &num);
        if(num > 0){
        if(num % 2 == 0){
            np++;
            calg = calg + (float)num;
            calp = calp + (float)num;
        } else if (num % 2 != 0){
            ni++;
            calg = calg + (float)num;
        }
        ia++;
        }
        printf("Quer continuar a digitar numeros?\nSe sim, digite 1\nSe nao, digite 0\n");
        scanf("%d", &i);
        }
    mp = calp / (float)np;
    mg = calg / (float)ia;
    printf("\nQuantidade de numeros pares: %d", np);
    printf("\nQuantidade de numeros impares: %d", ni);
    printf("\nMedia dos valores pares: %.2f", mp);
    printf("\nMedia geral dos numeros lidos: %.2f", mg);
}
