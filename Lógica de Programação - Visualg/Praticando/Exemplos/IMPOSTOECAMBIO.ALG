algoritmo "ImpostoECambio"
var
      V, Ca, Ce, T, I, A, R, IR: real
inicio
      Escreva ("Qual foi o pre?o do videogame? (em dolar) ")
      Leia (V)
      Escreva ("Qual foi o pre?o da camiseta? (em dolar) ")
      Leia (Ca)
      Escreva ("Qual foi o pre?o do celular? (em dolar) ")
      Leia (Ce)
      Escreva ("Qual foi o pre?o do t?nis? (em dolar) ")
      Leia (T)
      Escreval ("O imposto atual ? de 60% do valor total, logo, ")
      I <- (V+Ca+Ce+T)*1.6
      A <- I-(V+Ca+Ce+T)
      R <- I*5
      IR <- A*5
      Escreval ("o valor total com imposto foi ", I , " d?lares ")
      Escreval ("O valor apenas do imposto foi ", A , " d?lares ")
      Escreval ("Calculando o c?mbio, foram ", R , " reais totais gastos ")
      Escreval ("Calculando o c?mbio, foram ", IR , " reais em impostos ")
fimalgoritmo