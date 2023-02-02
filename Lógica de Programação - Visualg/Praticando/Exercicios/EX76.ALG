algoritmo "semnome"
var
   C, N, aux, ale: inteiro
   num: vetor[1..7] de inteiro
inicio
      para C <- 1 ate 7 faca
      aleatorio 0, 99
      leia (N)
      num[C] <- N
      fimpara
      
      limpatela
      
      para C <- 1 ate 7 faca
           escreval (C, "º valor gerado foi ", num[C])
      fimpara

fimalgoritmo