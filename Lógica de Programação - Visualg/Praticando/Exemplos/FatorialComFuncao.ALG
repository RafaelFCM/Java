algoritmo "semnome"

var
   Numero: inteiro
   F: inteiro
   
Funcao Fatorial (V: inteiro): inteiro
var
   Contagem: inteiro
   Resposta: inteiro
   
inicio
      Resposta <- 1
      Para Contagem <- 1 ate V faca
           Resposta <- Resposta * Contagem
      Retorne Resposta
      FimPara
FimFuncao

inicio
      Escreva ("Digite um numero: ")
      Leia (Numero)
      F <- Fatorial(Numero)
      Escreva ("O valor de ", Numero, "! e igual a ", F)
fimalgoritmo