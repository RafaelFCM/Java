algoritmo "ContagemConversaoDinheiro"
var
   RS, D, cont, A: real
inicio
      Escreva ("Quantas convers?es ser?o feitas? ")
      Leia (A)
      cont <- 1
      Enquanto (cont <= A) faca
               Escreval ("Fale um valor em reais: ")
               Leia (RS)
               D <- RS / 5
               Escreval ("O valor em d?lares ?: " , D)
               cont <- cont + 1
      FimEnquanto
fimalgoritmo