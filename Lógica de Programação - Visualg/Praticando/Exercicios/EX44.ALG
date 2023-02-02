algoritmo "semnome"
var
   C, N1, N2, incremento: inteiro
inicio
      Escreva ("Digite o numero que começa a contagem regressiva: ")
      Leia (N1)
      Escreva ("Digite o numero que termina a contagem regressiva: ")
      Leia (N2)
      Escreva ("Digite o incremento da contagem regressiva: ")
      Leia (incremento)
      C <- N1 - incremento
      Enquanto (C < N2) faca
      C <- C + incremento
      Escreva (C)
      FimEnquanto
      Escreva (" Acabou!")
fimalgoritmo