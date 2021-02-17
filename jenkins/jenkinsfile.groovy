node{
    stage("checkout"){
        checkout scm
    }
    stage("Build"){
       
     sh "mvn clean verify"
    }
   
    stage("RUN"){
        sh "cd src/main/java"
        sh "javac HelloWorld.java"
        sh "java HelloWorld"
    }
}
