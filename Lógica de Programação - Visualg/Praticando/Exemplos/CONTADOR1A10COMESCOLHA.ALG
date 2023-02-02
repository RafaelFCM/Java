algoritmo "Contador1a10ComEscolha"
var
   C: inteiro
   Resp: inteiro
inicio
      Escreval ("=========================")
      Escreval ("|        M E N U        |")
      Escreval ("=========================")
      Escreval ("| [1] Contar de 1 a 10  |")
      Escreval ("| [2] Contar de 10 a 1  |")
      Escreval ("| [3] Sair              |")
      Escreval ("=========================")
      Leia (Resp)
      Escolha (Resp)
               Caso 1
                    C <- 1
                    Repita
                    Escreva (C , ".. " )
                    C <- C + 1
                    Ate (C > 10)
               Caso 2
                    C <- 10
                    Repita
                    Escreva (C , ".. " )
                    C <- C - 1
                    Ate (C < 1)
               Caso 3
               Escreva ("Saindo")
fimalgoritmo
