algoritmo "semnome"
var
   m: vetor[1..3, 1..2] de inteiro
   linha, coluna: inteiro
inicio
      para linha <- 1 ate 3 faca
           para coluna <- 1 ate 2 faca
           escreva ("Digite valores para posição [", linha, ", ", coluna, "]:")
           leia (m[linha, coluna])
           fimpara
      fimpara
fimalgoritmo