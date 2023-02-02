algoritmo "semnome"
var
   time: vetor[1..3] de caractere
   c: inteiro
inicio
      para c <- 1 ate 3 faca
           escreva ("Digite o nome de um time: ")
           leia (time[c])
      fimpara
      
      limpatela
      
      escreval ("================")
      escreval ("TABELA - FUTEBOL")
      escreval ("================")
      escreval (time[1], " [] X [] ", time[2])
      escreval (time[2], " [] X [] ", time[1])
      escreval (time[1], " [] X [] ", time[3])
      escreval (time[3], " [] X [] ", time[1])
      escreval (time[3], " [] X [] ", time[2])
      escreval (time[2], " [] X [] ", time[3])
      
fimalgoritmo