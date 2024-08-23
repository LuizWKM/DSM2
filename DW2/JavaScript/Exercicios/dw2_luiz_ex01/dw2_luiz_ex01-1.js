//FUNÇÃO SIMPLES
//Exercicio 01
let nome = "Luiz Ricardo", idade = 20, cidade = "Registro - SP" 
function eu(){
    console.log(`Meu nome é ${nome} tenho ${idade} anos e moro em ${cidade}`)
}
eu()

//FUNÇÃO COM PARÂMETROS
//Exercicio 02
function num(n1, n2){
    let div = n1 / n2
    console.log("O resultado da divisão foi " + div)
}
num(8, 2)

//FUNÇÃO COM RETORNO
//Exercicio 03
function mult(n1, n2, n3){
    return n1 * n2 * n3
}
console.log(`O resultado da multiplicação foi ${mult(8,10,9)}`)

//FUNÇÃO COM MAIS DE UM RETORNO
//Exercicio 04
function id(idade){
    if(id >= 18){
        return 'Maior de idade'
    } else {
        return 'Menor de idade'
    }
}
let ida = 16
console.log(id(ida))
