algoritmo "semnome"
var
   idade, C, mais18, menos5, maior, M, S : real
inicio
      C <- 0
      maior <- 0
      Enquanto (C < 10) faca
      C <- C + 1
      Escreva ("Digite idade: ")
      Leia (idade)
      S <- S + idade
      Se (idade > 18) entao
         mais18 <- mais18 + 1
      Senao
           Se (idade < 5) entao
              menos5 <- menos5 + 1
           FimSe
      FimSe
      Se (idade > maior) entao
         maior <- idade
      FimSe
      FimEnquanto
      M <- S / 10
      Escreval ("Média das idades: ", int(M))
      Escreval ("Existem: ", mais18, " pessoas com idade maior que 18 anos")
      Escreval ("Existem ", menos5, " pessoas com idade menor que 5 anos")
      Escreva ("A maior idade é: ", maior)
fimalgoritmo
