algoritmo "semnome"
var
   C, resp: inteiro
   num: vetor[1..10] de inteiro
inicio
      para C <- 1 ate 10 faca
           escreva ("Digite um numero: ")
           leia (resp)
           num[C] <- resp
      fimpara
      
      limpatela

      para C <- 1 ate 10 faca
           se (num[C] % 2 = 0) entao
              escreval ("O ", C, "? valor, que ? o n?mero ", num[C], ", ? par")
           fimse
      fimpara

fimalgoritmo