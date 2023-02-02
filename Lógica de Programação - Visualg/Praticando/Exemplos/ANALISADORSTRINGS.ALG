algoritmo "AnalisadorStrings"
var
   nome: caractere
   C: inteiro
inicio
      escreva ("Digite seu nome: ")
      leia (nome)
      escreval ("Total de letras do seu nome é: ", compr(nome))
      escreval ("Seu nome em letras maiusculas é: ", maiusc(nome))
      escreval ("Seu nome em letras minusculas é: ", minusc(nome))
      escreval ("A primeira letra do seu nome é: ", maiusc(copia (nome, 1, 1)))
      // aparece a primeira letra do nome digitado e em maiusculo
      escreval ("A ultima letra do seu nome é: ", copia (maiusc(nome), 6, 1))
      // aparece a ultima letra do nome digitado
      // porém perceba que só vai dar certo pra nomes que a sexta letra é a utima
      escreval ("A ultima letra do seu nome é: ", copia (maiusc(nome), compr(nome), 1))
      // perceba que agora coloquei pra aparecer a ultima letra de qq coisa, pois é o proprio comprimento da coisa
      escreval ("Seu nome tem a letra A na posição: ", pos("A", maiusc(nome)))
      // perceba que estou procurando pos("A"), por isso coloquei maiusc(nome)
      // perceba que nomes com 2 ou mais letras A, ele só mostra a primeira que aparece
      escreval ("O código da letra A é: ", asc("A"))
      escreval ("A letra do código 65 é: ", carac(65))

      para C <- compr(nome) ate 1 passo -1 faca
           escreva (copia(maiusc(nome), C, 1))
      fimpara
      // assim que se escreve ao contrario uma palavra


fimalgoritmo