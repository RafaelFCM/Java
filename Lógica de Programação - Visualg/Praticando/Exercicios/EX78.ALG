algoritmo "semnome"
var
   C, resp: inteiro
   num: vetor[1..15] de inteiro
inicio
      para C <- 1 ate 15 faca
           escreva ("Digite um numero: ")
           leia (resp)
           num[C] <- resp
      fimpara
      
      limpatela
      
      para C <- 1 ate 15 faca
           escreval (C, "º valor é: ", num[C])
      fimpara
      
      escreval ("================================================")
      
      para C <- 1 ate 15 faca
           se (num[C] % 10 = 0) entao
              escreval ("O valor ", num[C], " é multiplo de 10")
           fimse
      fimpara

fimalgoritmo