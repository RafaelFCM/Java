algoritmo "semnome"
var
   canal, c4, c5, c7, c12, pessoas, pessoasTotais: inteiro
   p4, p5, p7, p12: real
inicio
   escreval ("Pesquisa de audiência de canal de TV")
   escreval ("Número dos canais da pesquisa: 4,5,7,12")
   escreval ("Digite 0 para finalizar a pesquisa")
   escreval ()

   repita
      escreva ("Qual canal estão assistindo: ")
      leia (canal)
      enquanto (canal <> 4) e (canal <> 5) e (canal <> 7) e (canal <> 12) e (canal <> 0) faca
            escreval ("Canal inválido, digite outro válido")
            escreva ("Qual canal estão assistindo: ")
            leia (canal)
      fimenquanto
      se (canal = 0) entao
         escreval ("Ignore a pergunta a seguir")
      fimse
      escreva ("Quantas pessoas estão assistindo: ")
      leia (pessoas)
      se (canal = 4) entao
         c4 <- c4 + pessoas
      senao
         se (canal = 5) entao
            c5 <- c5 + pessoas
         senao
            se (canal = 7) entao
               c7 <- c7 + pessoas
            senao
               se (canal = 12) entao
                  c12 <- c12 + pessoas
               fimse
            fimse
         fimse
      fimse
      pessoasTotais <- pessoasTotais + pessoas
   ate (canal = 0)
   escreval ("Fim da pesquisa")
   escreval ()

   p4 <- c4 / pessoasTotais * 100
   p5 <- c5 / pessoasTotais * 100
   p7 <- c7 / pessoasTotais * 100
   p12 <- c12 / pessoasTotais * 100

   escreval ("Porcentagem audiencia canal 4: ", p4:3:2)
   escreval ("Porcentagem audiencia canal 5: ", p5:3:2)
   escreval ("Porcentagem audiencia canal 7: ", p7:3:2)
   escreval ("Porcentagem audiencia canal 12: ", p12:3:2)
fimalgoritmo