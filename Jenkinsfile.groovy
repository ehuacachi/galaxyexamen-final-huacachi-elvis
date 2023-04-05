pipeline {

    agent any

    stages {

        stage('Build') {
            agent {
                sh 'HOLA MUNDO JENKINS'
            }
            
            steps {                
                sh 'FINALIZANDO JENKINS'
            }            
        }
    }
}
