algoritmo "AnalisadorStrings"
var
   nome: caractere
   C: inteiro
inicio
      escreva ("Digite seu nome: ")
      leia (nome)
      escreval ("Total de letras do seu nome ?: ", compr(nome))
      escreval ("Seu nome em letras maiusculas ?: ", maiusc(nome))
      escreval ("Seu nome em letras minusculas ?: ", minusc(nome))
      escreval ("A primeira letra do seu nome ?: ", maiusc(copia (nome, 1, 1)))
      // aparece a primeira letra do nome digitado e em maiusculo
      escreval ("A ultima letra do seu nome ?: ", copia (maiusc(nome), 6, 1))
      // aparece a ultima letra do nome digitado
      // por?m perceba que s? vai dar certo pra nomes que a sexta letra ? a utima
      escreval ("A ultima letra do seu nome ?: ", copia (maiusc(nome), compr(nome), 1))
      // perceba que agora coloquei pra aparecer a ultima letra de qq coisa, pois ? o proprio comprimento da coisa
      escreval ("Seu nome tem a letra A na posi??o: ", pos("A", maiusc(nome)))
      // perceba que estou procurando pos("A"), por isso coloquei maiusc(nome)
      // perceba que nomes com 2 ou mais letras A, ele s? mostra a primeira que aparece
      escreval ("O c?digo da letra A ?: ", asc("A"))
      escreval ("A letra do c?digo 65 ?: ", carac(65))

      para C <- compr(nome) ate 1 passo -1 faca
           escreva (copia(maiusc(nome), C, 1))
      fimpara
      // assim que se escreve ao contrario uma palavra


fimalgoritmo