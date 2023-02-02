algoritmo "IMC2.0"
var
   P, A, IMC: real
inicio
      Escreval ("Calculadora de IMC ")
      Escreva ("Peso (Kg): ")
      Leia (P)
      Escreva ("Altura (m): ")
      Leia (A)
      IMC <- P / (A^2)
      Escreval ("IMC: " , IMC)
      Se (IMC < 18) entao
         Escreval ("Abaixo do peso")
      Senao
           Se (IMC >= 18) e (IMC < 26) entao
              Escreval ("Peso ideal")
           Senao
                Se (IMC >= 26) e (IMC < 33) entao
                   Escreval ("Acima do peso")
                Senao
                     Escreval ("Obesidade")
                Fimse
           Fimse
      Fimse
fimalgoritmo