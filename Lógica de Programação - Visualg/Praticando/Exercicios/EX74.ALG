algoritmo "semnome"
var
   C: inteiro
   V: vetor[0..9] de inteiro
inicio
      para C <- 0 ate 9 faca
           se (C % 2 = 0) entao
              V[C] <- 5
              escreva (C, " =")
              escreva (V[C], "/")
           senao
                V[C] <- 3
                escreva (C, " =")
                escreva (V[C], "/")
           fimse
      fimpara
fimalgoritmo