#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*
    02 Crie um programa em C que verifique a qual departamento
    um funcionario pertence, sendo o
    1 - Recursos Humanos, 2 - Financeiro,
    3 - Compras, 4 - Vendas, 5 - Diretoria
    */
    int esc;
    printf("Todos os departamentos:");
    printf("\n1 - Recursos Humanos\n2 - Financeiro\n3 - Compras\n4 - Vendas");
    printf("\n5 - Diretoria");
    printf("\nDigite a qual departamento ele pertence: ");
    scanf("%d", &esc);
    switch(esc){
case 1:
    printf("O funcionario eh de Recursos Humanos");
    break;
case 2:
    printf("O funcionario eh do Financeiro");
    break;
case 3:
    printf("O funcionario eh de Compras");
    break;
case 4:
    printf("O funcionario eh de Vendas");
    break;
case 5:
    printf("O funcionario eh da Diretoria");
    break;
default:
    printf("Departamento incorreto!");
    return 0;
    }
}
