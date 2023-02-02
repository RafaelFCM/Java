algoritmo "semnome"
var
   N1, N2: inteiro
   M: real
   S: caractere
funcao media(var A, B: inteiro): real
var
N3: real
inicio
N3 <- (A + B)/2
Retorne N3
fimfuncao

funcao situacao(var C: real): caractere
inicio
Se (C>7) entao
   escreval ("APROVADO")
Senao
     Se ((C>=5) e (C<=7)) entao
        escreval ("RECUPERAÇÃO")
     Senao
          escreval ("REPROVADO")
     FimSe
FimSe
fimfuncao


inicio
      escreva ("Digite primeira nota: ")
      leia (N1)
      escreva ("Digite segunda nota: ")
      leia (N2)
      M <- media(N1, N2)
      escreval ("A média do aluno é ", M)
      S <- situacao(M)

fimalgoritmo