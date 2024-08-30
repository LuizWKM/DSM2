#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*
    2) Desenvolver um algoritmo que leia a altura de 8 pessoas. Este programa
    deverá calcular e mostrar:
    a. A menor altura do grupo;
    b. A maior altura do grupo;
    */
    int p;
    float alt, malt, menalt;
    for(p = 0; p <= 7; p++){
        printf("Digite a altura da %d pessoa em centimetros: ", p + 1);
        scanf("%f", &alt);
        if(p == 0){
            malt = alt;
            menalt = alt;
        }
        if(alt > malt){
            malt = alt;
        }
        if(alt < menalt){
            menalt = alt;
        }
    }
    printf("\n\nA maior altura eh: \nEm cm %.2fcm\nEm m %.2fm", malt, malt/100);
    printf("\n\nA menor altura eh: \nEm cm %.2fcm\nEm m %.2fm", menalt, menalt/100);
}
