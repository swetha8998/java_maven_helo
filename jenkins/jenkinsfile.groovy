node{
    stage("checkout"){
        checkout scm
    }
    stage("Build"){
       
     sh "mvn clean build"
    }
   
    stage("deploy"){
        
        sh "mvn package"
    }
}
