algoritmo "semnome"
var
   C, resp, totalIdade, maiorIdade, posicaoMaiorIdade: inteiro
   media: real
   idade: vetor[1..8] de inteiro
inicio
      totalIdade <- 0
      para C <- 1 ate 8 faca
           escreva ("Digite sua idade: ")
           leia (resp)
           idade[C] <- resp
           totalIdade <- totalIdade + resp
      fimpara
      
      media <- totalIdade / C
      
      limpatela
      
      para C <- 1 ate 8 faca
           escreval (C, "º idade é: ", idade[C])
      fimpara

      escreval ()
      escreval ()
      escreval ("================================================")
      escreval ()
      escreval ()

      para C <- 1 ate 8 faca
           se (idade[C] > 25) entao
              escreval ("O ", C, "º valor tem mais de 25 anos")
           fimse
      fimpara
      
      maiorIdade <- 0
      para C <- 1 ate 8 faca
           se (idade[C] > maiorIdade) entao
              maiorIdade <- idade[C]
              posicaoMaiorIdade <- C
           fimse
      fimpara
      
      escreval ("Médias das idades informadas é: ", media)
      escreval ("A maior idade digitada foi: ", maiorIdade)
      escreval ("A maior idade foi digitada na posição: ", posicaoMaiorIdade)

fimalgoritmo