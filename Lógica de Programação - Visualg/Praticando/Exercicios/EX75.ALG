algoritmo "semnome"
var
   A, B, C, D: inteiro
   V: vetor[0..15] de inteiro
inicio
      para C <- 0 ate 1 faca
          V[C] <- C
          escreval ()
          escreva (C, "º termo =")
          escreva (V[C])
      fimpara
      A <- 1
      B <- 1
      para C <- 2 ate 15 faca
      D <- A+B
      A <- B
      B <- D
          V[C] <- D
          escreval ()
          escreva (C, "º termo =")
          escreva (V[C])
      fimpara
fimalgoritmo