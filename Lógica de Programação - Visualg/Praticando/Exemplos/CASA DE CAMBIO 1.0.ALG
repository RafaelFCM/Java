algoritmo " Casa de Cambio 1.0"
var
   Moeda_Atual: caractere
   Moeda_Trocada: caractere
   Reais: real
   Dolares: real
inicio
      Escreva ("Bem-vindo a casa de c?mbio! Precisa trocar qual moeda? ")
      Leia (Moeda_Atual)
      Escreva ("Voc? quer trocar para qual moeda? ")
      Leia (Moeda_Trocada)
      Escreva ("Qual a quantidade em reais que deseja trocar? ")
      Leia (Reais)
      Escreva ("1 dolar est? 5 reais atualmente, logo, ")
      Dolares <- (Reais/5)
      Escreva ("com ", Reais , " reais, voc? recebe ", Dolares , " d?lares")
fimalgoritmo