algoritmo "semnome"
var
   C, resp, posicaoMaiorNota, alunosAcimaMedia: inteiro
   media, maiorNota, totalNota: real
   nota: vetor[1..10] de real
inicio
      totalNota <- 0
      para C <- 1 ate 10 faca
           escreva ("Digite a nota: ")
           leia (resp)
           nota[C] <- resp
           totalNota <- totalNota + resp
      fimpara
      
      media <- totalNota / C
      
      limpatela
      
      para C <- 1 ate 10 faca
           se (nota[C] > media) entao
              alunosAcimaMedia <- alunosAcimaMedia + 1
           fimse
      fimpara
      
      maiorNota <- 0
      para C <- 1 ate 10 faca
           se (nota[C] > maiorNota) entao
              maiorNota <- nota[C]
              posicaoMaiorNota <- C
           fimse
      fimpara
      
      escreval ("Média das notas da turma é: ", media)
      escreval ("São ", alunosAcimaMedia, " alunos acima da média da turma")
      escreval ("A maior nota digitada foi: ", maiorNota)
      escreval ("A maior nota foi digitada na posição: ", posicaoMaiorNota)

fimalgoritmo