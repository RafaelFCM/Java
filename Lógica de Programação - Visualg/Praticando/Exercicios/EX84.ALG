algoritmo "semnome"
var
   C, respIdade: inteiro
   respNome: caractere
   idade: vetor[1..9] de inteiro
   nome: vetor[1..9] de caractere
inicio

      para C <- 1 ate 9 faca
           escreva ("Digite seu nome: ")
           leia (respNome)
           nome[C] <- respNome
           escreva ("Digite sua idade: ")
           leia (respIdade)
           idade[C] <- respIdade
      fimpara
      
      limpatela
      
      escreval ("INFORMAÇÕES DOS MENORES DE IDADE")
      para C <- 1 ate 9 faca
           se (idade[C] < 18) entao
              escreval ("Nome: ", nome[C], "     Idade: ", idade[C])
           fimse
      fimpara

fimalgoritmo