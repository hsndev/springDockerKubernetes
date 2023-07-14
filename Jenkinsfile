pipeline {
	agent none
  stages {
  	stage('Maven Install') {
    	agent {
      	docker {
        	image 'maven:3.5.0'
        }
      }
      steps {
      	sh 'mvn clean install'
      }
    }
    stage('Docker Build') {
    	agent any
      steps {
      	sh 'docker build -t dockerBackend .'
      }
    }
  }
}

//  pipeline {
//     agent any
//     tools {
//         maven 'Maven3'
//     }
//     stages {
//         stage('BUILD MAVEN PROJECT') {
//
//             steps {
//                 checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/hsndev/springDockerKubernetes']])
//                 sh 'mvn clean install'
//             }
//         }
//         stage('BUILD DOCKER IMAGE'){
//             agent{
//                 docker {
//                     image 'FROM openjdk:17-jdk-slim-buster'
//                 }
//             }
//             steps {
//                 sh 'docker build -t jenkins/hdbackend .'
//             }
//         }
//     }
// }
