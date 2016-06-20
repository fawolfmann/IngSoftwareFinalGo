#Requerimientos de Proyecto Final
##Preguntas logicas!! SMART
###Lectores esperados
Para este documento se espere que los lectorers tengan el producto SMART! descargado y utilizable.
Hay que tener los conceptos basico de Ingenieria en Software.
###Requerimientos de usuario
 1. Este programa debe ser para el divertimento o el desarrollo de la logica del usuario.
 2. El sistema proveera preguntas y respuesta al cabo de un tiempo.
 3. Se muestran los graficos de secuencia y de casos de uso para su mayor comprension.
![](/Diagramas/Secuencia_usuario.jpg) 	En este diagrama se ve como un usuario tiene acceso al programa, la forma en que tiene que usarlo.
![](/Diagramas/UseCase.jpg) 	En este diagrama se ven todos los casos de usos que puede tener un usuario al utilizar el sistema.
![](/Diagramas/activity.jpg)	En este diagrama se puede ver las actividades que tiene que generar y poder verse del sistema.

###Arquitectura del sistema
 Se detalla la arquitectura del programa con el grafico de arquitectura, se ve que es un tipo de arquitectura MVC con patrones Observer tambien aplicados, se puede ver las conexiones a las interfaces entre las clases creadas y las utilizadas.
![](/Diagramas/Arq.jpg) 
Aqui se puede ver la forma en que se re-utilizan las clases y patrones se aplican de nuevo, como el nuevo observer que se crea.
Tambien se puede observar la correcta aplicacion del patron de arquitectura MVC a las nuevas clases creadas.

###Especificacion de requerimientos
#### Requerimiento funcionales:
1. Requerimiento 1: Solo se pueda crear una instancia del modelo creado.
	*Para esto se debe implemnetar una patron que solo deje instanciar una ves el modelo.
2. Requerimiento 2: Puede que el producto reproduzca sonidos.
	*Se puede utilizar librerias aplicadas para estas funcionalidades.
3. Requerimiento 3: El producto debe tener un contador de tiempo
	*Debe implentar del BeatBar entregado, sin modificarlo, hacer un temporizador.
4. Requerimiento 4: Se debe poder ejecutar varios modelos al mismo tiempo.
	*Para este punto se debe implementar la interfaz de Runnable.
5. Requerimiento 5: Se debe poder volver a empezar el juego cuando se finaliza una pregunta.
	*Debe tener una implementacion para cuando termine una pregunta no finalice el juego.
6. Requerimiento 6: Se tiene que poder contar la cantidad de veces que se instancia la modelo del corazon.
	*Dentro del BeatBar se tiene que poder ver la cantidad de veces instanciado o tratado de instanciar, sin modificar lo brindado.
7. Requerimiento 7: El modelo debe proveer alguna forma de poder modificar las vistas en tiempo de ejecucion.
	*Para este punto se puede utilizar patrones de diseno que puedan modificar cosas en tiempo de ejecucion.



#### Requerimiento no funcionales
1. Eficiencia: no se detalla el nivel de eficiencia a nivel de espeacio ni desempeno, el producto no tiene limitaciones en este sentido.
2. Usabilidad: se espera que con una o dos veces de uso el usuario pueda entender sin ninguna explicacion el funcionamiento del programa.
3. Seguridad: la seguridad del producto se tiene que dar en la no modificacion del usuario al sistema.
4. Confiabilidad: se espera que el producto no tenga mayor que un 20% de falla del sistema, se reanuda abriendo y cerrando el sistema.
5. Velocidad: el sistema tendra una alta tasa de respuesta del sistema a un cambio, uno 3 segundos como maximo.
6. Portabilidad: el producto contendra un solo ejecutable por lo que tiene que ser altamente protable y ejecutable en toda maquina con Java.
7. Desarrollo: se debe codificar en lenguaje java, pudiendo utilizar la ultima version del java JDK java 8
