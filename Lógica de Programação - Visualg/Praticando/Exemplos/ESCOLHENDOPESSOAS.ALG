algoritmo "EscolhendoPessoas"
var
   Sexo, Resp: caractere
   Idade, Cor, A, B: inteiro
inicio
Repita
      Escreval ("==================")
      Escreval ("SELETOR DE PESSOAS")
      Escreval ("==================")
      Escreva ("Qual o sexo? [M/F] ")
      Leia (Sexo)
      Escreva ("Qual a idade? ")
      Leia (Idade)
      Escreval ("Qual a cor do cabelo? ")
      Escreval ("----------------------")
      Escreval ("[1] Preto")
      Escreval ("[2] Castanho")
      Escreval ("[3] Loiro")
      Escreval ("[4] Ruivo")
      Leia (Cor)
      Escreva ("Quer continuar? [S/N] ")
      Leia (Resp)
Ate (Resp = "N")
A <- 0
B <- 0
Se (Sexo = "M") E (Idade > 18) E (Cor = 2) entao
   A <- A + 1
   Escreva ("O total de homens com mais de 18 anos e cabelos castanhos é " , A)
   Senao
        Se (Sexo = "F") E (Idade >= 25) E (Idade <= 30) E (Cor = 3) entao
           B <- B + 1
           Escreva ("O total de mulheres entre 25 e 30 anos e cabelos loiros é" , B)
           Senao
                Escreva ("Os requisitos não foram encontrados ")
        FimSe
FimSe
fimalgoritmo