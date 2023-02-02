algoritmo "semnome"
var
c, voto, candidato1, candidato2, candidato3, candidato4, candidato5, nulo, branco: inteiro
pn, pb: real
inicio
escreval ("ELEIÇÕES")
escreval ("Vote nos candidatos de 1 a 4")
escreval ("Vote nulo com 5")
escreval ("Vote em branco com 6")
escreval ("Digite 0 para fianlizar a eleição")
escreval ()

c <- 0
repita
aleatorio on
escreval ("Digite o voto: ")
leia (voto)
aleatorio off

se (voto = 1) entao
   candidato1 <- candidato1 + 1
senao
     se (voto = 2) entao
        candidato2 <- candidato2 + 1
     senao
          se (voto = 3) entao
             candidato3 <- candidato3 + 1
          senao
               se (voto = 4) entao
                  candidato4 <- candidato4 + 1
               senao
                    se (voto = 5) entao
                       nulo <- nulo + 1
                    senao
                         se (voto = 6) entao
                            branco <- branco + 1
                         fimse
                    fimse
               fimse
          fimse
     fimse
fimse

c <- c + 1
ate (voto = 0)
c <- c - 1

escreval ()
escreval ("Contagem de votos:")
escreval ("Candidato 1: ", candidato1)
escreval ("Candidato 2: ", candidato2)
escreval ("Candidato 3: ", candidato3)
escreval ("Candidato 4: ", candidato4)
escreval ("Nulo: ", nulo)
escreval ("Branco: ", branco)
escreval ("Total de votos: ", c)

pn <- nulo / c * 100
pb <- branco / c * 100
escreval ("Porcentagem de votos nulos em relação ao total: ", pn:2:2)
escreval ("Porcentagem de votos brancos em relação ao total: ", pb:2:2)
fimalgoritmo