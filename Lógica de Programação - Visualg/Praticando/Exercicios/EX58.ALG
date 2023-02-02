algoritmo "semnome"
var
   contagem, idade, somaIdade: inteiro
   media: real
inicio
      Enquanto (idade <> 999) faca
      Escreva ("Qual a sua idade? ")
      Leia (idade)
      somaIdade <- somaIdade + idade
      contagem <- contagem + 1
      FimEnquanto
      media <- somaIdade / contagem
      Escreva ("A média das idades inseridas é ", int(media))
fimalgoritmo