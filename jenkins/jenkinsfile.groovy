node{
    stage("checkout"){
        checkout scm
    }
    stage("Build"){
       
     sh "mvn clean verify package"
    }
   
    stage("RUN"){
        sh "cd src/main/java"
        sh "ls -lrt"
        sh "javac Helloworld.java"
        sh "java Helloworld"
    }
}
