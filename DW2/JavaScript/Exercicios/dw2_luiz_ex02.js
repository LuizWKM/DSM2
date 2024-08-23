//Exercicio 1
/*
Arrays
1 – Crie um vetor contendo os nomes de todos 
os estados brasileiros. Em seguida, exiba esse vetor 
na tela através de uma estrutura forEach. 
Os índices do vetor também devem ser exibidos.
*/
let estadosBr = [
  "Acre - AC",
  "Alagoas - AL",
  "Amapá - AP",
  "Amazonas - AM",
  "Bahia - BA",
  "Ceará - CE",
  "Espírito Santo - ES",
  "Goiás - GO",
  "Maranhão - MA",
  "Mato Grosso - MT",
  "Mato Grosso do Sul - MS",
  "Minas Gerais - MG",
  "Pará - PA",
  "Paraíba - PB",
  "Paraná - PR",
  "Pernambuco - PE",
  "Piauí - PI",
  "Rio de Janeiro - RJ",
  "Rio Grande do Norte - RN",
  "Rio Grande do Sul - RS",
  "Rondônia - RO",
  "Roraima - RR",
  "Santa Cataria - SC",
  "São Paulo - SP",
  "Sergipe - SE",
  "Tocantins - TO",
  "Distrito Federal - DF",
];
estadosBr.forEach((est, i) => {
  console.log(i + 1 + " - " + est);
});
/////////////////////////////////////////////////////////////////////////////////////////////////////
//Exercicio 2
/*
Objetos literais
2 – Crie um objeto literal para descrever você. 
Esse objeto deve ter no mínimo 5 chaves, 
por exemplo, nome, idade, cidade, hobby, música preferida. 
Em seguida, exiba as chaves e valores na tela.
*/
const luiz = {
  nome: "Luiz Ricardo",
  idade: 20,
  cidade: "Registro - SP",
  hobby: "Ler",
  musica_pref: "Ain't no Sunshine",
};
console.log(`\nNome: ${luiz.nome}\nIdade: ${luiz.idade}\nCidade: ${luiz.cidade}
Hobby: ${luiz.hobby}\nMúsica preferida: ${luiz.musica_pref}`);
/////////////////////////////////////////////////////////////////////////////////////////////////////
//Exercicio 3
/*
Array de objetos

3 – Crie um array de objetos de filmes com no mínimo 3 filmes. 
Cada filme deve possuir no mínimo 4 chaves, por exemplo, título, gênero, ano e classificação de idade. 
Em seguida, exiba o array de objetos através de uma estrutura forEach.
*/
const movieList = [
  {
    titulo: "V de Vingança",
    genero: "Ação",
    ano: 2005,
    clas_ida: "16 - Não recomendado para menores de 16 anos"
  },
  {
    titulo: "Trem-Bala",
    genero: "Comédia, Ação",
    ano: 2022,
    clas_ida: "16 - Não recomendado para menores de 16 anos"
  },
  {
    titulo: "Zoolander",
    genero: "Comédia",
    ano: 2001,
    clas_ida: "10 - Não recomendado para menores de 10 anos"
  },
  {
    titulo: "Guerra Mundial Z",
    genero: "Terror/Ação",
    ano: 2013,
    clas_ida: "14 - Não recomendado para menores de 14 anos"
  }
];

movieList.forEach((movie) => {
    console.log(`\nTítulo: ${movie.titulo}`);
    console.log(`Genêro: ${movie.genero}`);
    console.log(`Ano de lançamento: ${movie.ano}`);
    console.log(`Classificação indicativa: ${movie.clas_ida}\n`);
});
