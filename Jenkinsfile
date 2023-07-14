 pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    stages {
        stage('BUILD MAVEN PROJECT') {

            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/hsndev/springDockerKubernetes']])
                sh 'mvn clean install'
            }
        }
        stage('BUILD DOCKER IMAGE'){
            agent{
                docker {
                    image 'FROM openjdk:17-jdk-slim-buster'
                }
            }
            steps {
                sh 'docker build -t jenkins/docker-backend-1.jar .'
            }
        }
    }
}
