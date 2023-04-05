pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                sh 'HOLA MUNDO JENKINS'
                sh 'docker ps'
                sh 'ls -lta'
            }          
        }
        stage('docker containers') {
            steps {
                sh 'docker ps'
            }
        }
    }
}
