#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*2) Sendo p um ponteiro, qual a diferen�a entre:
    a) p++;
    R: soma em 1 o ponteiro que est� sendo apontado.

    b) (*p)++;
    R: Vai somar em 1 o conte�do do em que o ponteiro est� apontando

    c) *(p++);
    R: Vai fazer com que o ponteiro aponte para um conte�do que esteja 1 espa�o da
    mem�ria afrente do que o ponteiro est� apontando.

    d) *(p+10);
    R: Vai fazer com que o ponteiro aponte para um conte�do que esteja 10 espa�o da
    mem�ria afrente do que o ponteiro est� apontando.

    3)Como � realizada a compara��o entre ponteiros?
    R: � realizada como se fosse uma variavel qualquer, a diferen�a � o que voc� quer
    comparar entre eles, se for por exemplo p1 == p2, ser� comparado se os ponteiros
    est�o apontando para o mesmo espa�o da mem�ria, agora se for necess�rio comparar o
    conte�do dentro dos espa�os de mem�ria, ser� feito da seguinte forma: *p1 == *p2

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
    R: 4, come�a com p = &y, ou seja agora o ponteiro p est�
    apontando para o espa�o de mem�ria da vari�vel y e o
    conte�do de y = 0, logo, *p = y e y = *p, depois disso
    fala que x = *p, logo x = 0, e ap�s isso x = 4, dizendo
    que x = 4, ap�s isso se faz um (*p)++, que faz com que
    o conte�do dentro de p seja somado mais um, o que faz
    com que *p = 1, e y = 1 tamb�m, e abaixo desse faz x--
    que faz com que seja realizada uma opera��o de subtra��o
    com x, fazendo x = x - 1, agora x = 3, abaixo desse tem
    se uma soma de (*p) += x, que � a mesma coisa que conte�do
    de p = *p + x, que seria (*p) = 1 + 3, logo conte�do de p
    = 4, e y por estar sendo o espa�o de mem�ria que p est� apontando
    tamb�m se torna 4, logo a resposta � 4.
*/

