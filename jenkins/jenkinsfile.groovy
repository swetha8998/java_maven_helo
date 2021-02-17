node{
    stage("checkout"){
        checkout scm
    }
    stage("Build"){
       
     sh "mvn clean verify"
    }
   
    stage("RUN"){
        sh "javac HelloWorld.java"
        sh "java HelloWorld"
    }
}
