algoritmo "Ex10"
var
   L, A, AT, T: real
inicio
      Escreval ("Qual a largura da parede em metros? ")
      Leia (L)
      Escreval ("Qual a altura da parede em metros? ")
      Leia (A)
      AT <- L * A
      Escreval ("A área a ser pintada é de ", AT , " metros quadrados ")
      T <- AT / 2
      Escreva ("A quantidade de tinta necessária para o serviço é de ", T , " litros ")
fimalgoritmo