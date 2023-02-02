algoritmo "PodeDirigir"
var
   nascimento, atual, idade: real
inicio
      Escreval ("------------------------")
      Escreval ("Departamento de trânsito")
      Escreval ("------------------------")
      Escreva ("Ano de nascimento: ")
      Leia (nascimento)
      Escreva ("Ano atual: ")
      Leia (atual)
      idade <- atual - nascimento
      Escreval ("------")
      Escreval ("STATUS")
      Escreval ("------")
      Escreval ("Sua idade é: " , idade )
      Se (idade > 18) entao
         Escreval ("Você pode tirar carta de motorista ")
      Senao
         Escreval ("Espere completar 18 anos para tirar carta ")
      Fimse
fimalgoritmo