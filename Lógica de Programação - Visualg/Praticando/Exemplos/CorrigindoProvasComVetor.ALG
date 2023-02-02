algoritmo "semnome"
var
   q1, q2, q3, q4, q5: caractere
   nome: vetor[1..3] de caractere
   resp1: vetor[1..3] de caractere
   resp2: vetor[1..3] de caractere
   resp3: vetor[1..3] de caractere
   resp4: vetor[1..3] de caractere
   resp5: vetor[1..3] de caractere
   c: inteiro
   nota: vetor[1..3] de real
   media: real

inicio
      escreval ("PASSO 1 - GABARITO")
      escreval ("------------------")
      escreva ("Questão 1: ")
      leia (q1)
      escreva ("Questão 2: ")
      leia (q2)
      escreva ("Questão 3: ")
      leia (q3)
      escreva ("Questão 4: ")
      leia (q4)
      escreva ("Questão 5: ")
      leia (q5)
      
      limpatela
      
para c <- 1 ate 3 faca
      escreval ("---------------------")
      escreval ("ALUNO ", c)
      escreval ("---------------------")
      escreva ("Nome: ")
      leia (nome[c])
      escreval ("Respostas do ", nome[c])
      escreva ("Questão 1: ")
      leia (resp1[c])
      escreva ("Questão 2: ")
      leia (resp2[c])
      escreva ("Questão 3: ")
      leia (resp3[c])
      escreva ("Questão 4: ")
      leia (resp4[c])
      escreva ("Questão 5: ")
      leia (resp5[c])
      se (resp1[c]=q1) entao
         nota[c] <- nota[c] + 2
      fimse
      se (resp2[c]=q2) entao
         nota[c] <- nota[c] + 2
      fimse
      se (resp3[c]=q3) entao
         nota[c] <- nota[c] + 2
      fimse
      se (resp4[c]=q4) entao
         nota[c] <- nota[c] + 2
      fimse
      se (resp5[c]=q5) entao
         nota[c] <- nota[c] + 2
      fimse
      
fimpara
      
      media <- (nota[1] + nota[2] + nota[3]) / c
      
      limpatela
      
      escreval ("NOTAS FINAIS")
      escreval ("----------------------")
      escreval (nome[1], nota[1])
      escreval(nome[2], nota[2])
      escreval (nome[3], nota[3])
      escreval ("----------------------")
      escreva ("Média da turma: ", media)
fimalgoritmo