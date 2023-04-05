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
        stage('git') {
            steps {
                git branch: 'main', credentialsId: 'token_github', url: 'https://github.com/ehuacachi/galaxyexamen-final-huacachi-elvis.git'
            }
        }
    }
}
