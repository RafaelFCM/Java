algoritmo "semnome"
var
   resp, N, C: inteiro

procedimento perg ()
inicio
      Escreva ("Qual valor você acha que foi sorteado? [1 a 10] ")
      Leia (resp)
fimprocedimento
inicio
      perg
      perg
      perg
      perg
      Aleatorio 1, 10
      Leia (N)
      Escreval ("Número escolhido pelo PC foi, ", N)
      Aleatorio off
      Se (N = resp) entao
         Escreva ("ACERTOU")
      Senao
           Escreva ("ERROU")
      FimSe
fimalgoritmo