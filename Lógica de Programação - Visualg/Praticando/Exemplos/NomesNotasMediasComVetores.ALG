algoritmo "semnome"
var
   nome: vetor[1..4] de caractere
   p1: vetor[1..4] de real
   p2: vetor[1..4] de real
   m: vetor[1..4] de real
   c: inteiro
   somaMedias, mediaTurma: real
inicio
      para c <- 1 ate 4 faca
           escreva ("Digite nome do aluno: ")
           leia (nome[c])
           escreva ("Digite a nota de ", nome[c], ":")
           leia (p1[c])
           escreva ("Digite a nota de ", nome[c], ":")
           leia (p2[c])
           m[c] <- (p1[c] + p2[c]) / 2
           somaMedias <- somaMedias + m[c]
      fimpara

      mediaTurma <- somaMedias / c
      
      limpatela
      
      escreval ("LISTAGEM DE ALUNOS")
      escreval ("---------------------")
      escreval ("A média da turma foi: ", mediaTurma)
      para c <- 1 ate 4 faca
          escreval ("A media de ", nome[c]:8 , " é: ", m[c]:3:1)
          se (m[c] >= mediaTurma) entao
             escreval (nome[c], " está acima da média")
          senao
               escreval (nome[c], " está reprovado")
          fimse
      fimpara
      
      
fimalgoritmo