algoritmo "semnome"
var
   C, resp: inteiro
inicio
      C <- 31
      Enquanto (C > 1) faca
      C <- C - 1
      Se (C % 4 = 0) entao
         Escreva (" [", C, " ]")
      Senao
           Escreva (C)
      FimSe
      FimEnquanto
      Escreva (" Acabou!")
fimalgoritmo