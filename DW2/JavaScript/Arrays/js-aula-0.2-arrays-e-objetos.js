//ARRAYS (Vetor ou lista)
let produtos = ["Computador", "Notebook", "Celular", "Tablet"];
console.log(typeof produtos);
console.log(produtos);
// EXIBINDO ELEMENTOS DE UM VETOR PELO ÍNDICE (SEM LOOP)
console.log(produtos[0]);
console.log(produtos[1]);
console.log(produtos[2]);
console.log(produtos[3]);
// EXIBINDO ELEMENTOS DO VETOR COM FOR (COM ÍNDICES)
for (let c in produtos) {
  //console.log(`${c + 1 } - ${produtos[c]}`)
  //Cashing (converte o tipo da variável)
  console.log(`${Number(c) + 1} - ${produtos[c]}`);
}
//EXIBINDO ELEMENTOS DO VETOR COM O FOREACH (com indices)
produtos.forEach(function (produto, i) {
  console.log(i + 1 + " - ", produto);
});

// MÉTODOS DE MANIPULAÇÃO DE VETORES
let listaFrutas = ["Laranja", "Maçã", "Banana"];
console.log(`Nosso vetor é o: ${listaFrutas}`);
//PUSH - insere um novo elemento no FINAL da lista
listaFrutas[3] = "Morango"; //Adicionando sem o PUSH
console.log(`Nosso vetor é o: ${listaFrutas}`);
listaFrutas.push("Abacaxi");
console.log(`Nosso vetor é o: ${listaFrutas}`);
// UNSHIFT - Insere um novo elemento no INICIO da lista
listaFrutas[0] = "Pera";
console.log(`Nosso vetor é o: ${listaFrutas}`);
listaFrutas.unshift("Laranja");
console.log(`Nosso vetor é o: ${listaFrutas}`);
// LENGTH - Retornar o número de elementos no vetor
let numeros = [6, 8, 2, 9, 3];
console.log(`Nosso vetor é o: ${numeros}`);
console.log(`O número de elementos nesse vetor é ${numeros.length}.`);
// SORT -  Ordena o vetor
console.log(`O primeiro valor do vetor é ${numeros[0]}.`);
console.log(`O nosso vetor ordenado é o ${numeros.sort()}.`);
console.log(`O primeiro valor do vetor é ${numeros[0]}.`);
////////////////////////////////////////////////////////////////////////////////////////

//OBJETOS LITERAIS (Atributos e Métodos)
const carro = {
  //Atributos
  modelo: "gol",
  cor: "vermelho",
  //Metodos
  acelerar() {
    return "Acelerando...";
  },
  frear() {
    return "Freando...";
  },
};
console.log(carro.modelo);
console.log(carro.acelerar());

// OBJETO
const product = {
  nome: "Computador",
  marca: "Lenovo",
  preco: 3000,
  descricao: "PC moderno com bom desempenho",
};
console.log(
  `O ${product.nome} da marca ${product.marca}, custa apenas ${product.preco}. ${product.descricao}.`
);

// ARRAY DE OBJETOS
const productList = [
  {
    nome: "Computador",
    marca: "Intel",
    preco: 4000,
    descricao: "PC moderno com bom desempenho",
  },
  {
    nome: "Tablet",
    marca: "Samsung",
    preco: 2000,
    descricao: "Ótima velocidade de processamento"
  },
  {
    nome: "Celular",
    marca: "Apple",
    preco: 15000,
    descricao: "Muito barato"
  }
];
console.log(productList);
// EXIBINDO ARRAY DE OBJETOS COM FOREACH
productList.forEach((product) => {
    console.log(`Produto: ${product.nome}`);
    console.log(`Marca: ${product.marca}`);
    console.log(`Preço: ${product.preco}`);
    console.log(`Descrição: ${product.descricao}\n`);
  });
