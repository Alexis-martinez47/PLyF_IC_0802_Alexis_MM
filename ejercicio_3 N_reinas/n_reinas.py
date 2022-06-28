n=8                                                                 #numero de reinas
contador = 0                                                        #cuenta las soluciones posibles
columna = [False]*n                                                 #vector controla columna
diagonal_izquierda = [False]*(n*2)                                  #vector controla diagonal izquierda
diagonal_derecha = [False]*(n*2)                                    #vector controla diagonal derecha


#función recursiva backtrack, ya que backtracking va verificando todas las combinaciones posibles
def backtrack(y,n,contador):                                        #parametros y fila, n columna y contador
    if(y==n):
        #retorna
        return contador + 1                                         #contador aumenta 1
    
    for x in range(n):
        
        global columna
        global diagonal_izquierda
        global diagonal_derecha
        
        if(columna[x] or diagonal_izquierda[x+y] or diagonal_derecha[x-y+n-1]): 
            continue
        #se coloca la reina, declarando veradero en los vectores diagonal izquierda y derecha
        columna[x] = diagonal_izquierda[x+y] = diagonal_derecha[x-y+n-1] = True
        #enviamos la fila siguiente
        contador = backtrack(y+1,n,contador)
        #se quita la reina para probar otras posibilidades
        columna[x] = diagonal_izquierda[x+y] = diagonal_derecha[x-y+n-1] = False
        
    return contador
        
print(backtrack(0,n,contador))