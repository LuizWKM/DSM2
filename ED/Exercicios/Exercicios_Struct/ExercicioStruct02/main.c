#include <stdio.h>
#include <stdlib.h>
#define H 2
typedef struct Habitantes{
int idade;
char sexo;
float salario;
int numF;
}hab;

int main()
{
int i;
float salT = 0, mediaS = 0;
hab hab1[H];

for(i = 0; i < H;i++){
printf("\nDigite a idade do habitante: ");
scanf("%d", &hab1[i].idade);

printf("Digite o sexo do habitante, M ou F: ");
scanf(" %c", &hab1[i].sexo);

printf("Digite o salario do habitante R$");
scanf("%f", &hab1[i].salario);

printf("Digite o numero de filhos do habitante: ");
scanf("%d", &hab1[i].numF);

salT += hab1[i].salario;
}

for(i = 0; i < H;i++){
  printf("\n\nIdade do habitante: %d\nSexo do habitante: %c\nSalario do habitante R$%.2f\n",
         hab1[i].idade, hab1[i].sexo, hab1[i].salario);
  printf("\nNumero de filhos: %d", hab1[i].numF);
}
mediaS = salT / H;
printf("\nA media dos salarios dos habitantes eh R$%.2f", mediaS);
}
