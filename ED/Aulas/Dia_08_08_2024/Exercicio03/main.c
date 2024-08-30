#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*
    1) Crie um programa em C que
    verifique quantos nºs primos
    existem entre 1 a 1000
    */
    int cont = 1, xamp = 1,conte = 0, pri = 0;
    for (cont = 1;cont <=1000; cont++){
    xamp = cont;
    for(; xamp >= 1; xamp--){
        if(cont % xamp == 0){
           conte++;
        }
    }
   if(conte == 2){
   printf("\n%d", cont);
   pri++;
   }
   conte = 0;
    }
   printf("\nQuantidade de numeros primos %d", pri);
   }


