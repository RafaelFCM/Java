algoritmo "semnome"
var
   idade, CM, CH, SH, MH, mulheres20, idadeH, C, mais18, menos5, maior, M, S : real
   nome, sexo: caractere
inicio
      C <- 0
      Enquanto (C < 5) faca
      C <- C + 1
      Escreva ("Digite nome: ")
      Leia (nome)
      Escreva ("Digite idade: ")
      Leia (idade)
      Escreva ("Digite sexo: [H/M] ")
      Leia (sexo)
      S <- S + idade
      Se ((sexo = "M") e (idade > 20)) entao
         mulheres20 <- mulheres20 + 1
      FimSe
      Se (sexo = "M") entao
         CM <- CM + 1
      FimSe
      Se (sexo = "H") entao
         idadeH <- idadeH + idade
         CH <- CH + 1
      FimSe
      Se (idade > maior) entao
         maior <- idade
      FimSe
      FimEnquanto
      M <- S / 5
      MH <- idadeH / CH
      Escreval ("S?o ", CM, " mulheres cadastradas ")
      Escreval ("S?o ", CH, " homens cadastradas ")
      Escreval ("M?dia das idades: ", int(M))
      Escreval ("M?dia das idades dos homens: ", int(MH))
      Escreval ("S?o ", mulheres20, " mulheres com mais de 20 anos ")
fimalgoritmo
