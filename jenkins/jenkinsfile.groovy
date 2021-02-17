node{
    stage("checkout"){
        checkout scm
    }
    stage("Build"){
       
     sh "mvn clean compile"
    }
   
    stage("deploy"){
        
        sh "mvn package"
    }
}
