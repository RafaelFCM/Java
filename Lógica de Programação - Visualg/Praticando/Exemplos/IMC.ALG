algoritmo "IMC"
var
   peso, altura, imc: real
inicio
      Escreva ("Peso (Kg): ")
      Leia (peso)
      Escreva ("Altura (m): ")
      Leia (altura)
      imc <- peso / (altura^2)
      Escreval ("Imc: " ,  imc:5:2)
      Se (imc >= 18.5) e (imc <= 24.5) entao
         Escreval ("Está no peso ideal")
      Senao
         Escreval ("Não está no peso ideal")
      FimSe
fimalgoritmo