algoritmo "semnome"
var
   C: inteiro
   V: vetor[0..9] de inteiro
inicio
      para C <- 0 ate 9 faca
           V[C] <- 9 - C
           escreva (C, " =")
           escreva (V[C], "/")
      fimpara
fimalgoritmo