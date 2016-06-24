#INFORME TRABAJO FINAL 
##GRUPO GO
###PROYECTO SMART!
*** 

#Release Note

##Caracteristicas Principales: 

1. Se permite seleccionar desde un menu la modalidad deseada
2. En la opcion strategy es posible ir cambiando de modelo en tiempo de ejecucion.
3. La opcion smart implementa un juego de preguntas y respuestas de logica

##Pass/Fail Ratio del sistema
Se utilizo la herramienta JaCoCo para ecplipse y esto muestra
![](/Diagramas/test-Final.png) 
	
##Bugs Conocidos
1. Se crean clases para mostrar logo pero no se pudo implementar de manera correcta, por eso no se integro al proyecto final.
2. Se cierran todas las ventanas al cerrar una de ellas.
3. Si esta en el BeatModel y se quiere setear sin ninguna entrada da error.

##Descarga ejecutable e intrucciones de ejecucion 
Version V1.0
El sitio del ejecutable es: <https://github.com/fawolfmann/IngSoftwareFinalGo/tree/master/ejecutable>
Aqui se puede descargar el ejecutbale de nuestro proyecto.
Para ejecutarlo simplemente se debe clikear el .jar si esto no funciona se debe entrar en las propiedades y decir que es un ejecutable.

-----------------------------------------------------------------------------------
*** 
# Manejo de configuraciones
El manejo de configuraciones se muestra en el repositorio.
Este es el LINK <https://github.com/fawolfmann/IngSoftwareFinalGo/blob/master/docs/CM_PLAN_Final.pdf>

-----------------------------------------------------------------------------------
***

#Requerimientos 
###Lectores esperados
Para este documento se espere que los lectorers tengan el producto SMART! descargado y utilizable.
Hay que tener los conceptos basico de Ingenieria en Software.
###Requerimientos de usuario
 1. Este programa debe ser para el divertimento o el desarrollo de la logica del usuario.
 2. El sistema proveera preguntas y respuesta al cabo de un tiempo.
 3. Se muestran los graficos de secuencia y de casos de uso para su mayor comprension.
![](/Diagramas/Secuencia_usuario.jpg) 	
En este diagrama se ve como un usuario tiene acceso al programa, la forma en que tiene que usarlo.
![](/Diagramas/UseCase.jpg) 	
En este diagrama se ven todos los casos de usos que puede tener un usuario al utilizar el sistema.
![](/Diagramas/activity.jpg)	
En este diagrama se puede ver las actividades que tiene que generar y poder verse del sistema.

###Arquitectura del sistema
 Se detalla la arquitectura del programa con el grafico de arquitectura, se ve que es un tipo de arquitectura MVC con patrones Observer tambien aplicados, se puede ver las conexiones a las interfaces entre las clases creadas y las utilizadas.
![](/Diagramas/Arq.jpg) 
Aqui se puede ver la forma en que se re-utilizan las clases y patrones se aplican de nuevo, como el nuevo observer que se crea.
Tambien se puede observar la correcta aplicacion del patron de arquitectura MVC a las nuevas clases creadas.

###Especificacion de requerimientos
#### Requerimiento funcionales:
1. Requerimiento 1: Solo se pueda crear una instancia del modelo creado.
	* Para esto se debe implemnetar una patron que solo deje instanciar una ves el modelo.
2. Requerimiento 2: Puede que el producto reproduzca sonidos.
	* Se puede utilizar librerias aplicadas para estas funcionalidades.
3. Requerimiento 3: El producto debe tener un contador de tiempo
	* Debe implentar del BeatBar entregado, sin modificarlo, hacer un temporizador.
4. Requerimiento 4: Se debe poder ejecutar varios modelos al mismo tiempo.
	* Para este punto se debe implementar la interfaz de Runnable.
5. Requerimiento 5: Se debe poder volver a empezar el juego cuando se finaliza una pregunta.
	* Debe tener una implementacion para cuando termine una pregunta no finalice el juego.
6. Requerimiento 6: Se tiene que poder contar la cantidad de veces que se instancia la modelo del corazon.
	* Dentro del BeatBar se tiene que poder ver la cantidad de veces instanciado o tratado de instanciar, sin modificar lo brindado.
7. Requerimiento 7: El modelo debe proveer alguna forma de poder modificar las vistas en tiempo de ejecucion.
	* Para este punto se puede utilizar patrones de diseno que puedan modificar cosas en tiempo de ejecucion.



#### Requerimiento no funcionales
1. Eficiencia: no se detalla el nivel de eficiencia a nivel de espeacio ni desempeno, el producto no tiene limitaciones en este sentido.
2. Usabilidad: se espera que con una o dos veces de uso el usuario pueda entender sin ninguna explicacion el funcionamiento del programa.
3. Seguridad: la seguridad del producto se tiene que dar en la no modificacion del usuario al sistema.
4. Confiabilidad: se espera que el producto no tenga mayor que un 20% de falla del sistema, se reanuda abriendo y cerrando el sistema.
5. Velocidad: el sistema tendra una alta tasa de respuesta del sistema a un cambio, uno 3 segundos como maximo.
6. Portabilidad: el producto contendra un solo ejecutable por lo que tiene que ser altamente protable y ejecutable en toda maquina con Java.
7. Desarrollo: se debe codificar en lenguaje java, pudiendo utilizar la ultima version del java JDK java 8

-----------------------------------------------------------------------------------
***

#Arquitectura del Trabajo SMART!
En este documento se muestra todo lo referenciado a la arquitectura del sistema.
####Diagrama de Arquitectura
![](/Diagramas/Arq.jpg)
En este diagrama se ve como se relacionan los componentes, se puede obsrevar el patron de arquitectura MVC, teniedno la relacion entre los componetes de modelos las vistas y los controladores.
Tambien se puede ver la relacion de los componentes con las interfaces entregadas, la conexcion entre los distintos componetes del la arquitectura.
Y se agrago el patron de diseno Observer a los Observers ya entregados, para una rapida comuncacion entre los compnentes.

-----------------------------------------------------------------------------------
***

#Diseno e implementacion
En este documento se encuentra el detalle de la implentacion creada.
####Diagrama de clases entregado
Este diagrama fue creado en base a las clases entregadas. 
![](/Diagramas/clasesTodo.jpg)
Se puede observar los patrones Observer implentados, la conexcion entre las interfaces y las clases.
####Diagrama de clases Tempo
Este diagrma de clase muestra las clases e interfaces creadas para el proyecto final.
![](/Diagramas/ClasesTempo.jpg)
En este diagrama se puede ver como se conectan las nuevas clases creadas con las interfaces dadas, se ve como se impleneto el patron MVC en este nuevo proyecto
Los patrones observer implementados.
####Diagrama de objetos
En este diagrma se ve la forma en que un objeto crea a otro, o los objetos que se crean cuando se hace un nuevo ojeto de la clases de testDrive.
![](/Diagramas/objetos.jpg)

####Diagrama de Paquetes
En este diagrama se ve las formas en que se agrupan las clases dentro del proyecto
![](/Diagramas/PackageDiagram1.jpg)

###Implemetacion para modificar modelo en tiempo de ejecucion
####Se utilizo el patron de diseno de Strategy para generar esta implentacion.
Este patron nos permite cambiar en tiempo de ejecucion el modelo que mostramos en la vista StrategyView la cual extiende a DJView.
![](/Diagramas/Clases-Strategy.jpg)

-----------------------------------------------------------------------------------
***
#Testing
Se crearon tests para poder chequear que el producto este funcioncado correctamente, aunq los test se generaron al final del proyecto y tuvo que generarse nuevos metodos en las clases para el correcto testeo.
####Test creados
![](/Diagramas/test-final.png)
En esta imagen se puede observar los test creados.
####Ejemplo de Test
![](/Diagramas/testEj1.png)
En esta imagen se ve como se implementa unn  test, se tiene que setear algunas cosas para que el test sea automatizado.

####Test de sistema
El test del sistema como conjunto se genera a mano con las sigueintes instrucciones:
1. Se ejecuta el programa
2. Haga click en el boton Corazon
3. Haga click en la flecha hacia la derecha ">>"

######Resultado Esperado:
En la DJView se espera ver los latidos del corazon 
el barra del beatbar y debajo el numero de veces que se intento
instanciar el model, en este caso 2 veces.

###Matriz de trazabilidad
En esta matriz se ve los requerimientos cumplidos contra los test hechos.
|Requerimiento|Temporizador|Iniciar Modelo	|Setear Tiempo	|Jugar	|Elegir Pregunta|Jugador|Sistema|
|:------------:	|:------:	|:----:		|:----:		|:----:	|:----:		|:----:	|:-----:|
|Unica Instancia|		|	X	|		|	|		|	|	|
|Sonidos	|		|		|		|X	|		|	|	|
|Temporizador	|	X	|		|		|	|		|	|X	|
|Modelos paralelo|		|		|		|	|		|	|X	|
|Reiniciar	|		|		|		|	|		|X	|	|
|Contador de instancias|	|		|		|	|		|	|X	|
|Modificar vistas|		|		|		|	|		|	|	|
|Jugador	|		|		|		|	|	X	|X	|	|
|Sistema	|	X	|		|		|X	|		|	|	|
|Iniciar Modelo	|		|	X	|		|	|		|	|	|
|Setear Tiempo	|		|		|	X	|X	|		|	|	|
|Jugar		|		|		|		|X	|	X	|X	|	|
|Elegir Pregunta|		|		|		|X	|	X	|X	|	|



-----------------------------------------------------------------------------------
***

#Datos hisoricos
Esta tabla muestra las fechas y horas implementas en el proyecto

|Integrantes\Fechas|31/05   |04/06   |11/06   |12/06   |13/06   |18/06	|21/06|	   Total|
|:------:	   |:------:|:------:|:------:|:------:|:------:|:------:|:-----:|:-----:|
|Fabian		   |5	    |3	     |3	      |	7	|5	|5	|4	|32	|
|Agustin	   |5	    |5	     |5       |	7	|3	|5	|3	|33	|
|Nicolas	   |5	    |5	     |5	      |	7	|3	|5	|3	|33	|

Los tiempos fueron implementados para diferentes cosas
1. Programacion:
* Fabian:13 hs
* Agustin:14 hs
* Nicolas:19 hs

2. Elaboracion de Diagramas:
* Fabian:9 hs
* Agustin:7 hs
* Nicolas:7 hs

3. Elaboracion de informe:
* Fabian:10 hs
* Agustin:12 hs
* Nicolas:7 hs

-----------------------------------------------------------------------------------
***

#Lecciones aprendidas
Durante el trabajo final hemos podido aplicar lo que vimos en la materia y de esta manera pudimos afianzar el conocimiento y las buenas prácticas de la ingeniería de software.
Los puntos más importantes que hemos aprendido en este proyecto son:

* Trabajar en equipo, hemos podido trabajar en un proyecto común simultáneamente, sin afectar el trabajo de los demás.
* Utilizar el repositorio online de Github, que es una poderosa herramienta para trabajos futuros.
* El modelo de integración continua que nos permite llevar una evolución incremental en el proyecto.
* Realizar diagramas UML para poder discutir ideas, y expresarlas a los demás (en la presentación final).
* Utilizar patrones de diseño y de arquitectura para poder tener un proyecto organizado y mantenible. Además, estos patrones nos permiten implementar nuevas características en nuestras aplicaciones de manera rápida y efectiva.
* Usar testing automático para probar nuestro código de manera eficiente y libre de los errores humanos, y sin necesidad de hacerlo manualmente.

También hemos notado como todo lo que aprendimos en la materia, nos hubiese sido útil en proyectos anteriores que hemos realizado en la facultad como el proyecto final de la materia Algoritmos y Estructura de Datos. A modo de contraste, cuando realizamos este proyecto probábamos las funcionalidades manualmente, lo que consumía mucho tiempo, además de que a veces nos llevo a arrastrar errores a etapas posteriores del desarrollo.
El versionado lo llevábamos en Google Drive y combinábamos manualmente nuestro código lo que llevaba a tener un proyecto poco organizado, y dedicábamos mucho tiempo a integrarlo. 
Por último podemos agregar que el no haber realizado diagramas antes de la etapa de codificación nos llevo a un mal diseño del código en donde no usamos herencia o interfaces de manera adecuada.
En este momento, varias de estas prácticas las estamos aplicando en otras materias de la facultad y proyectos personales, y de esta manera seguiremos aprendiendo y mejorando en ello.
