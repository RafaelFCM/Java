algoritmo "semnome"
var
   sal, totalM, totalF: real
   sexo, resp: caractere
inicio
Escreva ("Quer continuar a inserir novos funcionários? [S/N] ")
Leia (resp)
Enquanto (resp = "S") faca
      Escreva ("Qual seu salário? ")
      Leia (sal)
      Escreva ("Qual o sexo? [M/F] ")
      Leia (sexo)
      Se (sexo = "M") entao
         totalM <- totalM + sal
      Senao
           Se (sexo = "F") entao
              totalF <- totalF + sal
           FimSe
      FimSe
      Escreva ("Quer continuar a inserir novos funcionários? [S/N] ")
      Leia (resp)
FimEnquanto

      Escreval ("Total pago a homens: ", totalM)
      Escreva ("Total pago a mulheres: ", totalF)
      
fimalgoritmo