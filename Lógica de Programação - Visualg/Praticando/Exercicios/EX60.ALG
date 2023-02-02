algoritmo "semnome"
var
   media, soma, idade, contagem, maisVelho, mulherMaisJovem, homensMais30, mulheresMenos18 : real
   resp, nome, sexo, nomeMaisVelho, nomeMulherMaisJovem: caractere
inicio
maisVelho <- 0
mulherMaisJovem <- 100
soma <- 0
contagem <- 0
Escreva ("Quer continuar a inserir novos funcionários? [S/N] ")
Leia (resp)
Enquanto (resp = "S") faca
      Escreva ("Qual seu nome? ")
      Leia (nome)
      Escreva ("Qual sua idade? ")
      Leia (idade)
      Escreva ("Qual o sexo? [M/F] ")
      Leia (sexo)
      Se (idade > maisVelho) entao
         nomeMaisVelho <- nome
      FimSe
      Se ((sexo = "F") e (idade < mulherMaisJovem)) entao
         nomeMulherMaisJovem <- nome
      FimSe
      Se ((sexo = "M") e (idade > 30)) entao
         homensMais30 <- homensMais30 + 1
      FimSe
      Se ((sexo = "F") e (idade < 18)) entao
         mulheresMenos18 <- mulheresMenos18 + 1
      FimSe
      soma <- soma + idade
      contagem <- contagem + 1
      Escreval ("===============================================================")
      Escreva ("Quer continuar a inserir novos funcionários? [S/N] ")
      Leia (resp)
FimEnquanto
      media <- soma / contagem
      Escreval ("O nome da pessoa mais velha é ", nomeMaisVelho)
      Escreval ("O nome da mulher mais jovem é ", nomeMulherMaisJovem)
      Escreval ("A média de idade do grupo é ", media)
      Escreval ("Quantidade de homens tem mais de 30 anos é ", homensMais30)
      Escreval ("Quantidade de mulheres tem menos de 18 ano é ", mulheresMenos18)

fimalgoritmo