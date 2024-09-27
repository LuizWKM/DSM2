#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*2) Sendo p um ponteiro, qual a diferença entre:
    a) p++;
    R: soma em 1 o ponteiro que está sendo apontado.

    b) (*p)++;
    R: Vai somar em 1 o conteúdo do em que o ponteiro está apontando

    c) *(p++);
    R: Vai fazer com que o ponteiro aponte para um conteúdo que esteja 1 espaço da
    memória afrente do que o ponteiro está apontando.

    d) *(p+10);
    R: Vai fazer com que o ponteiro aponte para um conteúdo que esteja 10 espaço da
    memória afrente do que o ponteiro está apontando.

    3)Como é realizada a comparação entre ponteiros?
    R: É realizada como se fosse uma variavel qualquer, a diferença é o que você quer
    comparar entre eles, se for por exemplo p1 == p2, será comparado se os ponteiros
    estão apontando para o mesmo espaço da memória, agora se for necessário comparar o
    conteúdo dentro dos espaços de memória, será feito da seguinte forma: *p1 == *p2

    4) Qual o valor de y no final do programa abaixo?
    int main() {
        int y, *p, x;
    y = 0;
    p = &y;
    x = *p;
    x = 4;
    (*p)++;
    x--;
    (*p) += x;
    printf("y = %d\n", y);
    return(0);
    }
    R: 4, começa com p = &y, ou seja agora o ponteiro p está
    apontando para o espaço de memória da variável y e o
    conteúdo de y = 0, logo, *p = y e y = *p, depois disso
    fala que x = *p, logo x = 0, e após isso x = 4, dizendo
    que x = 4, após isso se faz um (*p)++, que faz com que
    o conteúdo dentro de p seja somado mais um, o que faz
    com que *p = 1, e y = 1 também, e abaixo desse faz x--
    que faz com que seja realizada uma operação de subtração
    com x, fazendo x = x - 1, agora x = 3, abaixo desse tem
    se uma soma de (*p) += x, que é a mesma coisa que conteúdo
    de p = *p + x, que seria (*p) = 1 + 3, logo conteúdo de p
    = 4, e y por estar sendo o espaço de memória que p está apontando
    também se torna 4, logo a resposta é 4.
*/

