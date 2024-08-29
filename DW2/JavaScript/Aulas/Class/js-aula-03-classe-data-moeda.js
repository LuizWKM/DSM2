//CLASSE, DATA E MOEDA

//OBJETO LITERAL
const carro = {
  //ATRIBUTOS
  marca: "Ford",
  modelo: "Focus",
  ano: 2014,
  //MÉTODOS
  buzinar() {
    return "Beep! Beep!";
  },
};
console.log(carro.marca, carro.modelo);
console.log(carro.buzinar());

//CLASSE
class Carro {
  //ATRIBUTOS
  constructor(marca, modelo, ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }
  // MÉTODOS
  buzinar() {
    return "Beep! Beep!";
  }
}
// Criando uma instância (objeto) da classe Carro
//const carroPopular = new Carro("Ford", "Focus", 2014)
const carroPopular = new Carro();
carroPopular.marca = "Fiat";
carroPopular.modelo = "Uno";
carroPopular.ano = 2012;
console.log(
  carroPopular.marca,
  carroPopular.modelo,
  carroPopular.ano,
  carroPopular.buzinar()
);

const carroEsportivo = new Carro("Chevrolet", "Camaro", 2024);
console.log(
  carroEsportivo.marca,
  carroEsportivo.modelo,
  carroEsportivo.ano,
  carroEsportivo.buzinar()
);

///////////////////////////////////////////////////////////////////////////////////////////////////////
// MANIPULANDO DATAS NO JAVASCRIPT
// Criando uma instância da classe Date do JS (para utilizar os seus métodos)
const dataAtual = new Date();
// PEGAR O DIA ATUAL
const dia = dataAtual.getDate();
console.log(`Hoje é dia ${dia}!`);
// PEGAR O MÊS ATUAL
const mês = dataAtual.getMonth() + 1;
console.log(`Estamos no mês ${mês}!`);
// PEGAR O ANO ATUAL
const ano = dataAtual.getFullYear();
console.log(`Estamos no mês ${ano}!`);
console.log(`Hojé é ${dia}/${mês}/${ano}`);
///////////////////////////////////////////////////
// MANIPULANDO MOEDAS NO JAVASCRIPT
let salario = 2500.30;
console.log(salario);
// toFixed - define o número de casa decimais
console.log(salario.toFixed(2));
console.log(salario.toFixed(0));
// .replace - altera o formato da casa decimal
console.log(salario.toFixed(2).replace(".", ","));
// toLocaleString - faz a formatação para determinada moeda
// REAL
console.log(
  salario.toLocaleString("pt-br", { style: "currency", currency: "BRL" })
);
// DOLAR
console.log(
  salario.toLocaleString("en", { style: "currency", currency: "USD" })
);
// EURO
console.log(
  salario.toLocaleString("pt-br", { style: "currency", currency: "EUR" })
);
// CONVERTENDO REAL - DÓLAR
let salarioDolar = salario * 0.18
console.log(
  salarioDolar.toLocaleString("en", {style: "currency", currency: "USD"})
);
//////////////////////////////////////////////////////////////////////////////////
// FORMATANDO STRINGS
const nome = "Luiz Medina";
console.log(nome);
// LETRAS MAIÚSCULAS - .toUpperCase()
console.log(nome.toUpperCase());
// LETRAS MAIÚSCULAS - .toLowerCase()
console.log(nome.toLowerCase());
// CONTAR LETRAS - .Length
console.log(nome.length)
// PODEMOS USAR LENGTH TAMBÉM PARA ARRAYS
const list = ['Maçã', 'Banana', 'Morango']
console.log(list.length);