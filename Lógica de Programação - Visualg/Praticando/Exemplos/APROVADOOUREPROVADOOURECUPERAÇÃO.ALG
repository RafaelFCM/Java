algoritmo "AprovadoOuReprovado"
var
   N1, N2, N3, M: real
inicio
      Escreval ("------------------")
      Escreval ("      ESCOLA")
      Escreval ("------------------")
      Escreva ("Primeira nota: ")
      Leia (N1)
      Escreva ("Segunda nota: ")
      Leia (N2)
      Escreva ("Terceira nota: ")
      Leia (N3)
      Escreval ("------------------")
      M <- (N1 + N2 + N3)/3
      Escreval ("Sua média é: " , M:4:1)
      Se (M >= 7.5) entao
         Escreval ("Aprovado")
      Senao
         Se (M < 7.5) e (M >= 4.5) entao
             Escreval ("Recuperação")
         Senao
             Escreval ("Reprovado")
         FimSe
      FimSe
      Escreva ("------------------")
fimalgoritmo