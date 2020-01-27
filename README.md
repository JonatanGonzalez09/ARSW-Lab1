# ARSW-Lab1 #

Realizado por: Jonatan Esteban Gonzalez Rodriguez

# BBP Formula #

## Part I - Introduction to Java Threads ##
Change the beginning with start() to run(). How does the output change? Why?


**start():**


![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/BBP_FORMULA/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/resources/start.jpg)


**run():**


![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/BBP_FORMULA/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/resources/run.jpg)

Como se puede observar en la ejecucion del programa. Cuando se ejecuta con start(), se corren los 3 hilos a la vez, es decir los datos salen en desorden. Mientras que cuando se ejecuta con run(), se corren los 3 hilos por bloques, primero ejecuta el primero hasta finzalizar, luego el segundo hasta finalizar y finalmente ejecuta el 3 hasta que lo finzalice.

## Part II - BBP Formula Exercise ##
Se utilizo la funcion ```join()``` para que el hilo actual espere a que el hilo sobre el que lo invoca termine su ejecución.

### **Para la ejecucion de pruebas:** ###
 _-Para empaquetar el proyecto:_
 ``` mvn package```
 
 _-Para ejecutar los test:_
 ``` mvn test```
 
 _- Para ejecutar el CountThreadsMain desde la terminal:_
     ```mvn exec:java -Dexec.mainClass=edu.eci.arsw.threads.CountThreadsMain```
     
 _- Para ejecutar el Main desde la terminal:_
 ```mvn exec:java -Dexec.mainClass=edu.eci.arsw.math.Main```

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

# Dogs Race case #

## Part I ##
Creation, commissioning and coordination of threads.

_1. Review the "concurrent cousins" program (in the folder part1), provided in the package edu.eci.arsw.primefinder. This is a program that calculates the prime numbers between two intervals, distributing their search among independent threads. For now, it has a single thread that seeks cousins between 0 and 30,000,000. Run it, open the operating system process manager, and verify how many cores are used by it._

**Programa que calcula los primos con un solo hilo.**
![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/DOGS_RACE/CONCURRENT_PROGRAMMING-JAVA_MAVEN-DOGS_RACE/parte2/resources/unHilo.jpg)

_2. Modify the program so that, instead of solving the problem with a single thread, do it with three, where each of these will make up the first part of the original problem. Check the operation again, and again check the use of the equipment cores._

**Programa que calcula los primos con tres hilos.**
![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/DOGS_RACE/CONCURRENT_PROGRAMMING-JAVA_MAVEN-DOGS_RACE/parte2/resources/tresHilos.jpg)

_3. What you have been asked for is: you must modify the application so that when 5 seconds have elapsed since the execution started, all the threads are stopped and the number of primes found so far is displayed. Then, you must wait for the user to press ENTER to resume their execution._

![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/DOGS_RACE/CONCURRENT_PROGRAMMING-JAVA_MAVEN-DOGS_RACE/parte2/resources/primos.jpg)

## Part II ##

_- Para ejecutar el main desde la terminal se utiliza el comando:_
``` mvn exec:java -Dexec.mainClass=edu.eci.arsw.primefinder.Main ```

## Part III ##
**1. Fix the application so that the results notice is shown only when the execution of all the ‘greyhound’ threads is finished. For this keep in mind:**

   _1. The action of starting the race and showing the results is carried out from line 38 of MainCanodromo._
   
   _2. The join() method of the Thread class can be used to synchronize the thread that starts the race, with the completion of the greyhound threads._
   
**2. Once the initial problem has been corrected, run the application several times, and identify the inconsistencies in the results of the same by seeing the ‘ranking’ shown on the console (sometimes valid results could appear, but in other cases such inconsistencies may occur). From this, identify the critical regions of the program.**

_Se realizaron pruebas para verificar el correcto funcionamiento del ganador y del boton de pausar y continuar la carrera._
**Parte de Interfaz sin pausar la carrera**

![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/DOGS_RACE/CONCURRENT_PROGRAMMING-JAVA_MAVEN-DOGS_RACE/parte2/resources/InterfazSinPausa.jpg)

**Parte de Consola sin pausar la carrera**

![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/DOGS_RACE/CONCURRENT_PROGRAMMING-JAVA_MAVEN-DOGS_RACE/parte2/resources/Consola1.jpg)

**Parte de Interfaz pausando la carrera**

![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/DOGS_RACE/CONCURRENT_PROGRAMMING-JAVA_MAVEN-DOGS_RACE/parte2/resources/InterfazConPausa.jpg)

**Parte de Consola pausando la carrera**

![](https://github.com/JonatanGonzalez09/ARSW-Lab1/blob/master/DOGS_RACE/CONCURRENT_PROGRAMMING-JAVA_MAVEN-DOGS_RACE/parte2/resources/Consola2.jpg)

**Region Critica**: _En la clase Galgo dentro del método corra(), se debio realizar un join debido a que los hilos necesitaban la informacion de el metodo; y al no tenerlo estaba generando datos corruptos._

**3. Use a synchronization mechanism to ensure that these critical regions only access one thread at a time. Verify the results.**

4. Implement the pause and continue functionalities. With these, when "Stop" is clicked, all the threads of the greyhounds should fall asleep, and when "Continue" is clicked they should wake up and continue with the race. Design a solution that allows you to do this using the synchronization mechanisms with the Locks primitives provided by the language (wait and notifyAll).
