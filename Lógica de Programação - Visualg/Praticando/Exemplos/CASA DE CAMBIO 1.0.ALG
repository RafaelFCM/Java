algoritmo " Casa de Cambio 1.0"
var
   Moeda_Atual: caractere
   Moeda_Trocada: caractere
   Reais: real
   Dolares: real
inicio
      Escreva ("Bem-vindo a casa de câmbio! Precisa trocar qual moeda? ")
      Leia (Moeda_Atual)
      Escreva ("Você quer trocar para qual moeda? ")
      Leia (Moeda_Trocada)
      Escreva ("Qual a quantidade em reais que deseja trocar? ")
      Leia (Reais)
      Escreva ("1 dolar está 5 reais atualmente, logo, ")
      Dolares <- (Reais/5)
      Escreva ("com ", Reais , " reais, você recebe ", Dolares , " dólares")
fimalgoritmo