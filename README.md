Equipo 5 
Eduardo Daniel Nanguelu Lopez
Eyssy Ivan Henandez Sanchez 
Jesus Gerardo Martinez Diaz
Aaron Arturo Moreno Rodriguez 

Tablero Jira:
https://matenimiento-software.atlassian.net/jira/software/projects/PA5/boards/2  

Para poder ejecutar springboot deberá cambiar en ApplicationsProperties el puerto de la base de datos en caso de tenerlo en otro, así como el usuario y la contraseña de ser necesario
        Importante:No cambiar el valor de server.port de ApplicationProperties (de lo contrario ya no servirá la aplicación en react)

Para ejecutar react:
    0. Tener ejecutados los 4 proyectos de SpringBoot ejecutándose para las llamadas a las APIS
    0.1. Descomprimir "Practica4_Flores_203418_Gómez_203437" con la opcion  "extraer aquí"
    1. Necesitamos ubicarnos en la carpeta del proyecto: '.../proyecto_corte_PW/vista-veterinaria'
    2. Necesitaremos instalar todas las dependencias usadas con el comando "npm install"
    3. De ser necesario (a algunos les pasa) instalar el paquete de react scripts: "npm i react-scripts"
    4. Una vez instaladas las dependencias (y las 4 aplicaciones de Springboot corriendo) procederemos a ejecutar el comando "npm start"