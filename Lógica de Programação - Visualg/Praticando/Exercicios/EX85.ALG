algoritmo "semnome"
var
   C: inteiro
   respSexo: caractere
   respNome: caractere
   respSal: real
   sexo: vetor[1..5] de caractere
   nome: vetor[1..5] de caractere
   sal: vetor[1..5] de real
inicio

      para C <- 1 ate 5 faca
           escreva ("Digite seu nome: ")
           leia (respNome)
           nome[C] <- respNome
           escreva ("Digite seu sexo [H/M]: ")
           leia (respSexo)
           sexo[C] <- respSexo
           escreva ("Digite seu salário: ")
           leia (respSal)
           sal[C] <- respSal
      fimpara
      
      limpatela
      
      escreval ("INFORMAÇÕES DAS MULHERES QUE GANHAM MAIS DE 5MIL")
      para C <- 1 ate 5 faca
           se ((sexo[C] = "M") e (sal[C] > 5000)) entao
              escreval ("Nome: ", nome[C], "        Sexo: ", sexo[C], "      Salário: ", sal[C])
           fimse
      fimpara

fimalgoritmo