node{
    stage("checkout"){
        checkout scm
    }
    stage("Build"){
       
        mavenPath = tool 'maven3'
       
        sh "${mavenPath}/mvn build"
    }
   
    stage("RUN"){
        sh "javac HelloWorld.java"
        sh "java HelloWorld"
    }
}
