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
         Escreval ("Est? no peso ideal")
      Senao
         Escreval ("N?o est? no peso ideal")
      FimSe
fimalgoritmo