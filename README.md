# ARSW-Lab1 #

Realizado por: Jonatan Esteban Gonzalez Rodriguez

## Part I - Introduction to Java Threads ##
Change the beginning with start() to run(). How does the output change? Why?


**start():**


![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/BBP_FORMULA/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/resources/start.jpg)


**run():**


![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/BBP_FORMULA/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/resources/run.jpg)

Como se puede observar en la ejecucion del programa. Cuando se ejecuta con start(), se corren los 3 hilos a la vez, es decir los datos salen en desorden. Mientras que cuando se ejecuta con run(), se corren los 3 hilos por bloques, primero ejecuta el primero hasta finzalizar, luego el segundo hasta finalizar y finalmente ejecuta el 3 hasta que lo finzalice.

## Part II - BBP Formula Exercise ##
Se utilizo la funcion ```join()``` para que el hilo actual espere a que el hilo sobre el que lo invoca termine su ejecución.

## Part III - Performance Evaluation ## 
 ### 1. Single thread ###
 ![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/BBP_FORMULA/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/resources/unHilo.jpg)
 ### 2. As many threads as processing cores (have the program determine this using the Runtime API). (4 hilos) ###
 Para saber que cantidad de procesadores tenemos se corre el comando: ```Runtime.getRuntime().availableProcessors()```
 ![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/BBP_FORMULA/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/resources/cuatroHilos.jpg)
 ### 3. So many threads as double processing cores. (8 hilos) ###
 ![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/BBP_FORMULA/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/resources/ochoHilos.jpg)
 ### 4.  200 threads ###
 ![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/BBP_FORMULA/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/resources/200Hilos.jpg)
 ### 5.  500 threads ###
 ![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/BBP_FORMULA/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/resources/500Hilos.jpg)
 
 ### **Preguntas** ###
_1. According to Amdahls law, where S (n) is the theoretical performance improvement, P the parallel fraction of the algorithm, and n the number of threads, the greater n, the greater the improvement should be. Why is the best performance not achieved with the 500 threads? How does this performance compare when 200 are used?._

 ``` El mejor rendimiento no se logra con los 500 hilos debido a que los núcleos del computador no son suficientes para ejecutar simultáneamente esta cantidad de hilos. Al comparar el rendimiento con el de 200 se ve que mejora debido a que va a usar menos hilos y por ende en cada hilo hará menos pausas y reanudaciones para llevar los datos correctos, además en la grafica se puede ver que el procesamiento de la CPU es menos denso con 200 hilos que con 500. ```
 
 _2. How does the solution behave using as many processing threads as cores compared to the result of using twice as much?_
 
 ``` Al usar el doble de nucleos de la maquina se puede evidenciar en las graficas que hay un mejor rendimiento en cuando a los hilos ejecutados y a la CPU usada. ```
 
 _3. According to the above, if for this problem instead of 500 threads on a single CPU, 1 wire could be used on each of 500 hypothetical machines, would Amdahls's law be better applied? If, instead, c threads were used in 500 / c distributed machines (where c is the number of cores of said machines), would it be improved? Explain your answer._
 
 ``` La ley de Amdahls estaria mejor aplicada en 500 maquinas diferentes, ya que se tienen los procesadores de cada maquina exclusivos para poder ejecutar los hilos en paralelo. A diferencia que se use solo una maquina ya que esta no correra los 500 hilos simultaneamente debido a que los nucleos que tiene no dejarian procesar 500 hilos en simultaneo. Se podria ejecutar los 500 hilos en una sola maquina, solo si esta permitiera procesar esa cantidad de hilos en simultaneo de lo contrario no porque ya n no va a ser 500 si no la cantidad de hilos que la maquina pueda ejecutar simultaneamente. ```
