algoritmo "NumeroPrimo"
var
   N, C, Divisiveis: inteiro
inicio
      Escreva ("Qual n?mero deseja descobrir se ? primo ou n?o? ")
      Leia (N)
      C <- 1
      Divisiveis <- 0
      Repita
            Escreva (C)
            Se (N % C = 0) entao
               Divisiveis <- Divisiveis + 1
            FimSe
            C <- C + 1
      Ate (C > N)
      Escreval (" ")
      Escreval ("O numero " , N , " ? divisivel por " , Divisiveis , " numeros ")
      Se (Divisiveis = 2) entao
         Escreva ("Numero " , N , " ? primo")
      Senao
           Escreva ("Numero " , N , " n?o ? primo")
      FimSe
fimalgoritmo