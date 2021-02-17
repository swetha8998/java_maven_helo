node{
    stage("checkout"){
        checkout scm
    }
    stage("Build"){
       
     sh "mvn clean verify package"
    }
   
    stage("RUN"){
        
        sh "javac src/main/java/Helloworld.java"
        sh "cd /src/main/java
        sh "java Helloworld"
    }
}
