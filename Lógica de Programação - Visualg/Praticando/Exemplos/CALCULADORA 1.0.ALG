algoritmo "Calculadora 1.0"
var
  A, B: Inteiro
  C: Real
  D: Real
  nome: caractere
inicio
  Escreva ("Bem-vindo a calculadora 1.0, vamos aprender? ")
  Leia (nome)
  Escreva ("Como se chama? ")
  Leia (nome)
  Escreval ("Prazer ", nome)
  Escreva ("Escolha um n?mero qualquer: ")
  Leia (A)
  Escreva ("Escolha outro n?mero qualquer: ")
  Leia (B)
  C <- (A+B)^2
  Escreval ("O quadrado da soma desses 2 n?meros ?: ", C)
  D <- RaizQ(C)
  Escreva ("A raiz quadr?tica de ", C , " ? ", D)
fimalgoritmo