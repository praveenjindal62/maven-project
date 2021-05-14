pipeline {
    agent any 
    stages {
        stage('Clone and Clean Remo') { 
            steps {
                sh "mvn clean "
            }
        }
        stage('Test') { 
            steps {
                sh "mvn test" 
            }
        }
        stage('Deploy') { 
            steps {
                sh "mvn package" 
            }
        }
        stage('Archive Artefacts'){
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', followSymlinks: false
            }
        }
    }
}