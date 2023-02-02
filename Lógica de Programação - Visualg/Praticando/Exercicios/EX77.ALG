algoritmo "semnome"
var
   C: inteiro
   nome: vetor[1..7] de caractere
   resp: caractere
inicio
      para C <- 1 ate 7 faca
           escreva ("Digite um nome: ")
           leia (resp)
           nome[C] <- resp
      fimpara
      escreval ("===============================================")
      escreval ("Os nomes informados, na ordem inversa, são: ")
      C <- 8
      repita
            C <- C - 1
            escreval (nome[C])
      ate (C < 2)
fimalgoritmo