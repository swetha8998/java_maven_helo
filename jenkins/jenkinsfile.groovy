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
    stage("converting to war file"){
        sh "jar -cvf Sampleproject.war*
}
