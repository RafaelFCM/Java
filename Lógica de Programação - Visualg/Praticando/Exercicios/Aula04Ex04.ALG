algoritmo "semnome"
var
c, idade, peso, pessoasC2, c1, c2, c3, c4: inteiro
altura, media, pC3: real
olhos, cabelo: caractere
inicio
enquanto (c < 10) faca
c <- c + 1
escreva ("Sua idade:")
leia (idade)
escreva ("Seu o peso [em kilo]:")
leia (peso)
escreva ("Sua altura [em metro]:")
leia (altura)
escreval ("Cor dos seus olhos:")
escreval ("A-Azul, P-Preto, V-Verde e C-Castanho")
escreva ("Sua opção:")
leia (olhos)
escreval ("Cor do seu cabelo:")
escreval ("P-Preto, C-Castanho, L-Louro e R-Ruivo")
escreva ("Sua opção:")
leia (cabelo)

se (idade > 50) e (peso < 60) entao
   c1 <- c1 + 1
fimse

se (altura < 1.5) entao
   c2 <- c2 + idade
   pessoasC2 <- pessoasC2 + 1
fimse

se (olhos = "A") entao
   c3 <- c3 + 1
fimse

se (olhos <> "A") e (cabelo = "R") entao
   c4 <- c4 + 1
fimse
fimenquanto
escreval ()
media <- c2 / pessoasC2
pC3 <- c3 / c

escreval ("Pessoas com mais de 50 anos e menos de 60 quilos: ", c1)
escreval ("Média das idades das pessoas com menos de 1,50m: ", media)
escreval ("Porcentagem de pessoas com olhos azuis entre todas: ", pC3)
escreval ("Quantidade de pessoas ruivas e sem olhos azuis: ", c4)
fimalgoritmo