# QWAZR Java Example
    
This is a basic MVC Web application for QWAZR.

## Getting started

Download this example and start the simple Web application.

Clone (download) the example :

    git clone https://github.com/qwazr/qwazr-java-example.git
    
Move in the directory:
    
    cd qwazr-java-example

Start the server using **Docker** :

    docker run -v $(pwd):/var/lib/qwazr  -p 9090:9090 -p 9091:9091 qwazr/server

Or start it using **Maven** :

    mvn qwazr:start

The web application is now visible here:

[http://localhost:9090](http://localhost:9090)
    
## Where to go now ?

Just browse the source code, we add some README.md files to guide you.

- The [configuration](etc)
- The [JAVA source code](src/main/java/com/qwazr/example)
- The [HTML template](src/main/resources/com/qwazr/example)
