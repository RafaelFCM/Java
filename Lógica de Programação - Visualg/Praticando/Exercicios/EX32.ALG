algoritmo "semnome"
var
   resp, N: inteiro
inicio
      Escreva ("Qual valor voc? acha que foi sorteado? [1 a 5] ")
      Leia (resp)
      Aleatorio 1, 5
      Leia (N)
      Escreval ("N?mero escolhido pelo PC foi, ", N)
      Aleatorio off
      Se (N = resp) entao
         Escreva ("ACERTOU")
      Senao
           Escreva ("ERROU")
      FimSe
fimalgoritmo