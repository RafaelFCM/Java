algoritmo "semnome"
var
   C, N: inteiro
   num: vetor[1..30] de inteiro
   resp: inteiro
inicio
      para C <- 1 ate 30 faca
      aleatorio 1, 15
      leia (N)
      num[C] <- N
      fimpara
      
      limpatela
      
      escreva ("Digite um número [1 a 15]: ")
      leia (resp)
      
      escreval ()
      
      escreval ("O número chave escolhido é: ", resp)

      escreval ()

      para C <- 1 ate 30 faca
           se (num[C] = resp) entao
              escreval ("Essa chave aparece na posição: ", C)
           fimse
      fimpara

fimalgoritmo