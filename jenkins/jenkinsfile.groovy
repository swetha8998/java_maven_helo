node{
    stage("checkout"){
        checkout scm
    }
    stage("Build"){
       
     sh "mvn clean verify package"
    }
   
    stage("RUN"){
        
        sh "javac src/main/java/Helloworld.java"
        sh "java Helloworld"
    }
}
