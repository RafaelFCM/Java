algoritmo "ImpostoECambio"
var
      V, Ca, Ce, T, I, A, R, IR: real
inicio
      Escreva ("Qual foi o preço do videogame? (em dolar) ")
      Leia (V)
      Escreva ("Qual foi o preço da camiseta? (em dolar) ")
      Leia (Ca)
      Escreva ("Qual foi o preço do celular? (em dolar) ")
      Leia (Ce)
      Escreva ("Qual foi o preço do tênis? (em dolar) ")
      Leia (T)
      Escreval ("O imposto atual é de 60% do valor total, logo, ")
      I <- (V+Ca+Ce+T)*1.6
      A <- I-(V+Ca+Ce+T)
      R <- I*5
      IR <- A*5
      Escreval ("o valor total com imposto foi ", I , " dólares ")
      Escreval ("O valor apenas do imposto foi ", A , " dólares ")
      Escreval ("Calculando o câmbio, foram ", R , " reais totais gastos ")
      Escreval ("Calculando o câmbio, foram ", IR , " reais em impostos ")
fimalgoritmo