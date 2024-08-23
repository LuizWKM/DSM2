// DECLARAÇÃO DE VARIÁVEIS NO JS
// CONST X LET X VAR
const nome = "Diego";
// nome = "Afonso"
var idade;
var idade = 20;
idade = 10;
let cidade;
cidade = "Registro";
console.log(nome);
console.log(idade);
console.log(cidade);
/////////////////////////////////////////////////////////////////
// TYPEOF
const sobrenome = "Max";
const salario = 1500;
let endereco;
console.log(typeof sobrenome);
console.log(typeof salario);
console.log(typeof endereco);
/////////////////////////////////////////////////////////////////
// TIPOS DE FUNÇÕES
// FUNÇÃO SIMPLES
function minhaFuncao() {
  console.log("Olá, Mundo!");
}
minhaFuncao(); // Invocando a função para ser executada
// FUNÇÃO COM PARÂMETRO / ARGUMENTO

function saudacao(cidade, nome = "usuário") {
  // cidade = obrigátorio / nome = opcional
  console.log("Olá, bem-vindo, " + nome + " de " + cidade);
}
saudacao("Registro"); // Enviando argumento

function soma(n1, n2) {
  let resultado = n1 + n2;
  //Concatenando com literal/Template Strings ${ } = placeholder
  console.log(`A soma dos dois números foi: ${resultado}`);
}
soma(5, 5);
/////////////////////////////////////////////////////////////////
// FUNÇÃO COM RETORNO
function Soma(n1, n2) {
  return n1 + n2;
}
console.log(`A soma dos dois números foi ${Soma(2, 6)}.`);
/////////////////////////////////////////////////////////////////
// FUNÇÃO COM MAIS DE UM RETORNO
function parImpar(numero) {
  if (numero % 2 == 0) {
    return "Par";
  } else {
    return "Impar";
  }
}
let numero = 4;
console.log(`O número enviado é ${parImpar(numero)}`);

/////////////////////////////////////////////////////////////////
//DIA 08/08/2024
// FUNÇÃO ANÔNIMA = NÃO TEM NOME
const Dobro = function (x) {
  return x * 2;
};
console.log(`O dobro do número é ${Dobro(15)}`);
/////////////////////////////////////////////////////////////////
// ARROW FUNCTION (função anônima) - PÂRAMETRO ÚNICO
const dobro = (x) => {
  return x * 2;
};

console.log(dobro(20));
/////////////////////////////////////////////////////////////////
// ARROW FUNCTION (função anônima) - COM MAIS DE UM PARÂMETRO
const calculadora = (num1, operador, num2) => {
  return eval(`${num1} ${operador} ${num2}`);
};

console.log(`O resultado da operação é ${calculadora(6, "+", 6)}`);
/////////////////////////////////////////////////////////////////
// FUNÇÃO IMEDIATA - IIFE (Immediately Invoked Function Expression)
const iife = (function () {
  console.log("Execuntando imediatamente!");
})(); //PARÂMETROS

//IIFE COM PARÂMETRO
const start = (function (app) {
  console.log(`Executando imediatamente o app ${app}.`);
})("Whatsapp");
