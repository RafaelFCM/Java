algoritmo "semnome"
var
a, c, resp: inteiro
escolhido: caractere

procedimento gerador (aP: caractere)
inicio
      escreval (escolhido)
      para c <- 1 ate a faca
           escreval (aP)
      fimpara
      escreval (escolhido)
fimprocedimento

inicio
      escreva ("Quantas vezes quer reproduzir o procedimento? ")
      leia (a)
      escreval ("Qual borda você quer usar? ")
      escreval ("[1] +-------=======------+ ")
      escreval ("[2] ~~~~~~~~:::::::~~~~~~~ ")
      escreval ("[3] <<<<<<<<------->>>>>>> ")
      escreva ("Opção: ")
      leia (resp)
      se (resp = 1) entao
         escolhido <- "+-------=======------+"
      senao
           se (resp = 2) entao
              escolhido <- "~~~~~~~~:::::::~~~~~~~"
           senao
                se (resp = 3) entao
                   escolhido <- "<<<<<<<<------->>>>>>>"
                fimse
           fimse
      fimse
      gerador ("Aprendendo Portugol")

fimalgoritmo