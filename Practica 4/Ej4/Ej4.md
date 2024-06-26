# Ejercicio 4

Determinar si las sentencias son verdaderas o falsas, justificando la respuesta con la notacion Big-Oh $O(n)$

## Punto A

$T(n) = 3^n$ es de $O(2^n)$ ?

Aplicamos la formula de Big-Oh:

$3^n \leq c*2^n$ Tal que $n \gt n_0$

**Hallar:**

$c = ?$

$n_0 = ?$

Si realizamos calculos sobre los dos, podemos suponer que los valores que debemos buscar son $c = 1$ debido que toda cuenta multiplicado por 1 queda con el mismo valor y $n_0=0$ es decir que podriamos empezar por 0 como primer valor de ese numero podriamos seguri determinando que $3^n \leq c*2^n$.

Por lo tanto podemos asegurar que $T(n) = 3^n$ es de $O(2^n)$

## Punto B

$T(n) = n+\log_{2}n$ es de $O(n)$ ?

Aplicamos la formula de Big-Oh:

$n+\log_{2}n \leq c*n$ Tal que $n \gt n_0$

$n \leq c_1*n$

$+$

$\log_{2}n \leq c_2*n$

**Hallar:**

$c_1 = ?$ $c_2 = ?$ $n_0 = ?$ $n_1 = ?$

Si realizamos los calculos para los 2 casos, podemos suponer que los valores que debemos buscar son $c_1 = 1$ y $n_0 = 0$ debido a que al multiplizar cualquier valor por 1 da como resultado lo mismo y como vemos se cumple la regla que $n \leq c_1*n$ en el caso del logaritmo los valores que debemos busar son $c_2 = 2$ y $n_1 = 1$ debido a que el logatimo de base 2 de 0 no existe por lo tanto debemos seleccionar como primer valor el 1 que cumple la regla de que $\log_{2}n \leq c_2*n$

Por lo tanto:

$n + \log_2{n} \leq (c_1+c_2)n$ con $n_0 = 1*(max(0,1))$

$n + \log_2{n} \leq (1+1)n$ con $n_0 = 1*(1)$

$n + \log_2{n} \leq (2)n$ con $n_0 = 1$

Es decir que podemos decir que $T(n) = n+\log_{2}n$ es de $O(n)$

## Punto C

$n^{1\over 2} + 10^{20}$ es de $O(n^{1\over 2})$ ?

Aplicamos la formula de Big-Oh:

$n^{1\over 2} + 10^{20} \leq c*n^{1\over 2}$ tal que $n \geq n_0$

**Hallar:**

$c_1 = ?$ $c_2 = ?$ $n_0 = ?$ $n_1 = ?$

Si realizamos los calculos para los 2 partes de la fomula matematica, podemos suponer que para:

$n^{1\over 2} \leq c*n^{1\over 2}$

Podemos determinar que $c_1 = 1$  debido a que multimplicar cualquier valor por 1 da como resultado lo mismo y para $n_0 = 0$ para que cumpla la regla de la formula de Big-Oh.

En cuanto a la segunda parte, podemos suponer que para:

$10^{20} \leq c*n^{1\over 2}$

Podemos determinar que $c_1 = 1$ y que $n_1 = 10^{40}$ para que se cumpla la regla de la formula de Big-Oh.

Entonces

$T(n) \leq c_1*n^{1\over 2} + c_2*n^{1\over 2}$

$T(n) \leq (c_1+ c_2)*n^{1\over 2}$

$T(n) \leq (1 + 1)*n^{1\over 2}$

$T(n) \leq c*n^{1\over 2}$ con $c = 1$ y $n_0 = 10^{40}$ -> $max(0,10^{40})$

