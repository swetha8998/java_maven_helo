node{
    stage("checkout"){
        checkout scm
    }
    stage("Build"){
       
        
      mvn clean configure install
    }
   
    stage("RUN"){
        sh "javac HelloWorld.java"
        sh "java HelloWorld"
    }
}
