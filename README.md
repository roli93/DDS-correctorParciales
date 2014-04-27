DDS-correctorParciales
======================

Simple sistema de corrección de parciales, creado para el Trabajo Práctico 3 de la asignatura Diseño de Sisitemas, UTN-FRBA

Decisiones de Diseño

Para el modelado del dominio de la corrección de parciales se han tomado diversas decisiones en el diseño, con el fin de mejorar algunas de sus cualidades. 

Podemos citar como una de ellas, la separación del concepto de pregunta del concepto de respuesta dada. Si bien se podría haber incluido dentro de la pregunta como atributo la respuesta que se dio (ya que van de la mano y siempre que se cree una respuesta habrá que crear la pregunta, dado que no se soporta la carga previa de exámenes), se prefirió separar el concepto de pregunta para mejorar la extensibilidad del sistema: si en un futuro se requiriera modelar la carga de preguntas y resoluciones al sistema, tener a la pregunta como una entidad separada permitirá que varias respuestas dadas se asocien a ella. Asimismo esto contribuye a la abstracción, ya que crea la idea de “pregunta”, que es un concepto natural del dominio.

 Otra decisión a citar es la de distribuir en diferentes clases los métodos de corrección, asegurándose de que expongan una interfaz uniforme. Esto permite descentralizar las diferentes operaciones que le corresponden a cada forma de corrección, generando módulos más cohesivos ya que no habrá un módulo único encargado de resolver varias formas de corrección diferentes. Otra cualidad a la que contribuye es a la claridad, ya que se delega el trabajo en otro modulo único y no es necesario enfrentarse a todos los métodos de corrección (en un gran if, por ejemplo) codificados en un solo lugar.
 
Asimismo, dados los requerimientos de resolver la corrección de parciales, y la ausencia de requerimientos sobre la carga de exámenes y resoluciones en el sistema, se ha decidido no modelar esta última característica, dado que complejizaría al sistema innecesariamente.

Se ha del mismo modo definido una clase abstracta con el fin de nuclear en ella comportamiento que es común a sus clases hijas,  evitando la repetición de lógica en estas últimas y permitiendo reutilizar ese comportamiento.
Finalmente podemos decir que se ha decidido reducir el acoplamiento existente entre las clases Pregunta y RespuestaDada al momento de verificar la corrección de una respuesta: en lugar de que la respuesta obtenga atributos de la pregunta para contrastarlos con su valor, lo cual generaría mayor dependencia en la respuesta de detalles internos de la pregunta,  se delega en el mensaje suRespuestaEs() que se encarga de cotejar si la respuesta dada es correspondiente a la pregunta. 
