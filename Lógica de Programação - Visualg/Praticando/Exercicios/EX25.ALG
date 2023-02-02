algoritmo "semnome"
var
   R1, R2, R3: inteiro
inicio
       Escreva ("Fale um valor para o segmento de reta: ")
       Leia (R1)
       Escreva ("Fale outro valor para o segmento de reta: ")
       Leia (R2)
       Escreva ("Fale outro valor para o segmento de reta: ")
       Leia (R3)
       Se ((R1+R2>R3) e (R1+R3>R2) e (R3+R2>R1)) entao
          Escreva ("É possível formar um triângulo")
          Senao
               Escreva ("Não é possível formar um triângulo")
       FimSe
fimalgoritmo
