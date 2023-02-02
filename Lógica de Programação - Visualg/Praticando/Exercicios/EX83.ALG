algoritmo "semnome"
var
   C, N, aux, ale: inteiro
   num: vetor[1..20] de inteiro
inicio
      para C <- 1 ate 20 faca
      aleatorio 0, 99
      leia (N)
      num[C] <- N
      fimpara
      
      limpatela
      
      para C <- 1 ate 20 faca
           escreval (C, "º valor é ", num[C])
      fimpara
      
      escreval ("==================================")
      escreval ("VALORES CITADOS EM ORDEM CRESCENTE")
      para C <- 1 ate 19 faca
           para ale <- C+1 ate 20 faca
                se (num[C] > num[ale]) entao
                   aux <- num[C]
                   num[C] <- num[ale]
                   num[ale] <- aux
                fimse
           fimpara
      fimpara
      
      escreval ()
      para C <- 1 ate 20 faca
           escreva (num[C], ".. ")
      fimpara
      
      

      
fimalgoritmo