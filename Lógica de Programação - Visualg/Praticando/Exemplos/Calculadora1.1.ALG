algoritmo "semnome"
var
   Angulo, A, B, C: Real
inicio
   Escreva ("Informe um ?ngulo: ")
   Leia (Angulo)
   A <- Abs(Sen(GraupRad(Angulo)))
   B <- Abs(Cos(GraupRad(Angulo)))
   C <- Abs(Tan(GraupRad(Angulo)))
   Escreva ("Sen ? " , A , " Cos ? ", B , " Tg ? ", C)
fimalgoritmo