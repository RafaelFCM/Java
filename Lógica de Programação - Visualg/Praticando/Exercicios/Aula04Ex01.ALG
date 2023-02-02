algoritmo "semnome"
var
c, idade, faixa1, faixa2, faixa3, faixa4, faixa5: inteiro
p: real
inicio
c <- 1
enquanto (c < 21) faca
escreval (c, "º pessoa")
escreva ("Digite sua idade: ")
aleatorio on
leia (idade)
aleatorio off
c <- c + 1

se (idade <= 15) entao
   faixa1 <- faixa1 + 1
senao
     se (idade > 15) e (idade <= 30) entao
        faixa2 <- faixa2 + 1
     senao
          se (idade > 30) e (idade <= 45) entao
             faixa3 <- faixa3 + 1
          senao
               se (idade > 45) e (idade <= 60) entao
                  faixa4 <- faixa4 + 1
               senao
                    faixa5 <- faixa5 + 1
               fimse
          fimse
     fimse
fimse

fimenquanto

escreval ("Faixa etária:")
escreval ("Numero de pessoas ate 15 anos: ", faixa1)
escreval ("Numero de pessoas de 16 a 30 anos: ", faixa2)
escreval ("Numero de pessoas de 31 a  45 anos: ", faixa3)
escreval ("Numero de pessoas 46 a 60 anos: ", faixa4)
escreval ("Numero de pessoas acima de 61 anos: ", faixa5)

p <- faixa1 / (c-1) * 100

escreval ("Porcentagem de pessoas ate 15 anos, em relação ao todo: ")
escreva (p, "%")
fimalgoritmo

