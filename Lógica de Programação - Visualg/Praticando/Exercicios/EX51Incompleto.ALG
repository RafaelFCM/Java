algoritmo "semnome"
var
    valor, C, valorMenor, valorMaior: real
inicio
      C <- 0
      valorMenor <- 1000000000000000000
      valorMaior <- 0
      Enquanto (C < 8) faca
      C <- C + 1
      Escreva ("Digite o valor do produto: ")
      Leia (valor)
      Se (valor > valorMaior) entao
         valorMaior <- valor
      Senao
           Se (valor < valorMenor) entao
           valorMenor <- valor
           FimSe
      FimSe
      FimEnquanto
      Escreval ("Valor mais caro: ", valorMaior)
      Escreva ("Valor mais barato: ", valorMenor)
fimalgoritmo
