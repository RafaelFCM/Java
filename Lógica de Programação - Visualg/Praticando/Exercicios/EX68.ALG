algoritmo "semnome"
var
   C, mulheres, homensMais100: inteiro
   sexo: caractere
   peso, media, somaPesoMulheres, maiorPesoH, maiorPesoHomens, mediaPesoMulheres: real
   
inicio
      mulheres <- 0
      homensMais100 <- 0
      somaPesoMulheres <- 0
      maiorPesoH <- 0
      Para C <- 1 ate 8 faca
      Escreva ("Qual seu sexo? [M/F] ")
      Leia (sexo)
      Escreva ("Qual seu peso? [Kg] ")
      Leia (peso)
      Se (sexo = "F") entao
      mulheres <- mulheres + 1
      FimSe
      Se ((sexo = "M") e (peso > 100)) entao
      homensMais100 <- homensMais100 + 1
      FimSe
      Se ((sexo = "M") e (peso > maiorPesoH)) entao
      maiorPesoH <- peso
      FimSe
      Se (sexo = "F") entao
      somaPesoMulheres <- somaPesoMulheres + peso
      FimSe
      FimPara
      mediaPesoMulheres <- somaPesoMulheres / mulheres
      maiorPesoHomens <- maiorPesoH
      Escreval ("Mulheres cadastradas: ", mulheres)
      Escreval ("Homens com mais de 100Kg: ", homensMais100)
      Escreval ("Media peso mulheres: ", mediaPesoMulheres)
      Escreval ("Maior peso dos homens: ", maiorPesoHomens)
fimalgoritmo