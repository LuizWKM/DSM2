//Exercicio 01
/*
Manipulação de datas
1 – Crie uma função que a partir da data atual, 
exiba no console uma nova data da seguinte forma:

- Três dias a mais do que o dia atual.

- Quatro meses a mais do que o mês atual.

- Seis anos a mais do que o ano atual.

O formato da data deve ser exibida no padrão dia/mês/ano.
*/
const dataAtual = new Date();
const data = (dia, mes, ano) =>{
    return(`${dia + 3}/${mes + 5}/${ano + 6}`);
} 
console.log(`${data(dia = dataAtual.getDate(),mes = 
dataAtual.getMonth(),ano = dataAtual.getFullYear())}`)
//Exercicio 02
/*
Formatação de moedas

2 – Crie uma função que receba um 
determinado salário em real como parâmetro 
e converta esse salário para as moedas Dólar e Euro. 
Deverá ser feito a conversão de valores e formatação da moeda. 

Considere:

1 real = 0.20 dólar

1 real = 0.19 euro
*/
const salario = (sal) =>{
    const dol = sal * 0.20
    const euro = sal * 0.19 
    return(`Em Real: ${sal.toLocaleString("pt-br", {style: "currency", currency: "BRL"})}
Em Dolár: ${dol.toLocaleString("en", {style: "currency", currency: "USD"})}
Em Euro: ${euro.toLocaleString("pt-br", {style: "currency", currency: "EUR"})}`)
}
console.log(`${salario(5229.54)}`)
//Exercicio 03
/*
Formatação de strings

3 – Crie uma função que receba um nome como parâmetro e exiba no console este nome 
formatado somente com letras maiúsculas, somente com letras minúsculas, e em seguida 
exiba o número de letras que esse nome possui.
*/
const nome = (nom) =>{
    return(`Nome: ${nom}
Nome em maiúsculo: ${nom.toUpperCase()}
Nome em minúsculo: ${nom.toLowerCase()}
Número de letras que o nome possui: ${nom.length}`)
}
console.log(`${nome('Carlos')}`)
