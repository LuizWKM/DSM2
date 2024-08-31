    /*
    4) Escrever um algoritmo que leia uma
    quantidade desconhecida de números e
    conte quantos deles estão nos
    seguintes intervalos: [0-25], [26-50],
    [51-75] e [76-100]. A entrada de dados deve
    terminar quando for lido um número negativo.
    */
    #include <stdio.h>
    #include <stdlib.h>

    int main() {
    int i = 0;
    int int1 = 0, int2 = 0, int3 = 0, int4 = 0;
    float n = 0;
    printf("\nVoce pode ir digitando quantos numeros quiser, mas apos digitar um numero negativo o programa acaba.\n");
    while(1){
        printf("\nDigite o %d numero: ", i + 1);
        if(scanf("%f", &n) != 1){
        while (getchar() != '\n');
        printf("Entrada inválida. Tente novamente.\n");
        continue;
        }
        if(n < 0){
            printf("\nVoce digitou um numero negativo, iniciado o termino da entrada de dados!\n");
            break;
        } else{
        if (n >= 0 && n <= 25){
            int1++;
        }else if (n >= 26 && n <= 50){
            int2++;
        }else if (n >= 51 && n <= 75){
            int3++;
        }else if (n >= 76 && n <= 100){
            int4++;
        }
        }
        i++;
    }
    printf("\nO numero de numeros entre   [0-25] eh: %d", int1);
    printf("\nO numero de numeros entre  [26-50] eh: %d", int2);
    printf("\nO numero de numeros entre  [51-75] eh: %d", int3);
    printf("\nO numero de numeros entre [76-100] eh: %d", int4);

    return 0;
}
