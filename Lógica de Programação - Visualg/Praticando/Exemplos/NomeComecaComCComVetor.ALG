algoritmo "semnome"
var
   c: inteiro
   nome: caractere
   apenasC: vetor[1..10] de caractere
   totC: inteiro
inicio
      totC <- 0
      para c <- 1 ate 10 faca
           escreva ("Digite seu nome: ")
           leia (nome)
           se (copia(maiusc(nome), 1, 1) = "C") entao
              totC <- totC + 1
              apenasC[totC] <- nome
           fimse
      fimpara
      
      limpatela
      
      escreval ("LISTAGEM FINAL")
      para c <- 1 ate totC faca
           escreval (apenasC[c])
      fimpara
fimalgoritmo