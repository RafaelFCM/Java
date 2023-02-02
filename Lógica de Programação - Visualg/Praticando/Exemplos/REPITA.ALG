algoritmo "REPITA"
var
   S, N: real
   R: caractere
inicio
      S <- 0
      Repita
            Escreva ("Digite um valor: ")
            Leia (N)
            S <- S + N
            Escreva ("Você quer continuar? (S/N) ")
            Leia (R)
      Ate (R = "N")
      Escreva ("A soma de todos valores digitados é " , S)
fimalgoritmo