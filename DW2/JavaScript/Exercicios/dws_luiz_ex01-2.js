//FUNÇÃO ANÔNIMA
//Exercicio 05
/*
5 – Crie uma função anônima que receba duas notas como parâmetro. Se a média dessas notas for <=5, a função deve retornar o valor “Reprovado”, se não deve retornar o valor “Aprovado”.  O resultado deve ser exibido no console. Considere média = (nota1 + nota2) / 2.
*/

const media = function (n1, n2) {
  let med;
  med = (n1 + n2) / 2;
  if (med <= 5) {
    return "Reprovado";
  } else {
    return "Aprovado";
  }
};
let n11 = 7,
  n12 = 8;
console.log(media(n11, n12));

//ARROW FUNCTION COM PARÂMETRO ÚNICO
//Exercicio 06
/*
6 – Crie uma arrow function que receba um número como parâmetro e retorne o triplo desse número. O resultado deve ser exibido no console concatenado com uma string. (Ex: “O triplo do número é...”)
*/

const num = (n) => {
  return n * 3;
};
console.log(`O triplo do número é ${num(8)}`);

//ARROW FUNCTION COM MAIS DE UM PARÂMETRO
//Exercicio 07
/*
7 – Crie uma arrow function que receba quatro números como parâmetro e retorne a soma entre esses números. O resultado deve ser impresso no console.)
*/

const nums = (n1, n2, n3 ,n4) => {
    return n1 + n2 + n3 + n4;
}
console.log(`O resultado da soma entre os quatro números é ${nums(5,6,2,4)}`);

//FUNÇÃO IMEDIATA - IIFE (Immediately Invoked Function Expression)
//Exercicio 08
/*
8 – Crie uma função imediata que receba o nome de uma pessoa como parâmetro e exiba no console uma saudação a essa pessoa.
*/
const saudacao = (function(nome) {
    console.log(`Bom dia ${nome}!`)
})("Carlos Eduardo");