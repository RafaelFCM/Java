algoritmo "AnalisadorDeValores"
var
   C, V, A, B: inteiro
   S, M: real
inicio
      C <- 0
      S <- 0
      M <- 0
      Repita
      Escreva ("Digite um valor: ")
      Leia (V)
      C <- C + 1
      S <- S + V
      M <- S / 2
      Ate (C = 5)
      Escreval ("A soma dos 5 numeros é " , S)
      Escreval ("A media dos 5 numeros é " , M)
      Se (V % 5 = 0) entao
         Escreva ("Dentre os 5 numeros citados " , A , " são divisiveis por 5" )
      FimSe
fimalgoritmo