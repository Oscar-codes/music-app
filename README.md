# music-app
## Indicaciones para usar Music-api

**Configurando la base de datos MySQL**

La Base de datos que utilice para este proyecto fue hecha con MySQL Server para poder utilizarla hay que imporpar el archivo Query que se encuentra en la carperta musicbd.

#Importar una base de datos en MySQL 
Para importar un volcado de MySQL , lo primero que hay que hacer es crear la base de datos en la que se hará la importación. Para hacer esto, si no tienes ningún gestor de bases de datos, tienes que conectarte al servidor de bases de datos como usuario «root» desde el CMD.
```
mysql -u root –p
```

Esto hará que se abra el Shell de MySQL o MariaDB. A continuación, podrás crear la base de datos.
```
mysql> CREATE DATABASE musicbd;
```

Si todo ha ido bien, verás algo parecido a esto:
```
Query OK, 1 row affected (0.00 sec)
```

Una vez creada, hay que salir de ese Shell; para ello pulsa CTRL+D. Una vez estés en la línea de comandos normal, será el momento de lanzar el comando que se encargará de realizar la importación de la base de datos.

```
mysql -u username -p musicbd < musicbd.sql
```
`username` es el nombre del usuario con acceso a la base de datos.
`musicbd` es el nombre de la base de datos donde se realizará la importación.
`musicbd.sql `es el nombre del archivo que contiene todas las instrucciones sql que se van a importar.
Si durante el proceso de importación se produjera algún tipo de error, se mostrará en la pantalla. Como puedes ver, exportar e importar una base de datos en MySQL o MariaDB es un proceso muy sencillo.


## Indicaciones para usar el proyecto SpringBoot music-api

Para poder usar el proyecto puedes obtar por usar el IDE Spring Tool Suite , descargarlo aca  [Spring Boot ](https://spring.io/tools).
Una vez descargado descomprimir el archivo en la ruta que almacenaras los proyectos SpringBoot.

**Importando el Proyecto SpringBoot**


