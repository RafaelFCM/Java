algoritmo "semnome"
var
   contagem, idade, idadesTotais, pessoas21: inteiro
   media: real
   resp: caractere
inicio
      contagem <- 0
      Repita
      contagem <- contagem + 1
      Escreva ("Quantos anos voc? tem? ")
      Leia (idade)
      Escreva ("Quer continuar a digitar dados? ")
      Leia (resp)
      idadesTotais <- idadesTotais + idade
      Se (idade >= 21) entao
         pessoas21 <- pessoas21 + 1
      FimSe
      Ate (resp = "N")
      media <- idadesTotais / contagem
      Escreval ("Foram inseridas ", contagem, " idades")
      Escreval ("Numero de pessoas com 21 anos ou mais ? ", pessoas21)
      Escreva ("A m?dia das idade inseridas: ", int(media))

fimalgoritmo