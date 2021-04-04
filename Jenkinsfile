pipeline {
  agent any
  stages {
    stage('get code from pipeline') {
      steps {
        git(url: 'https://github.com/agbonjaru/jenkinsfiles.git', branch: 'master', credentialsId: 'gitCredentials')
      }
    }

    stage('Build') {
      steps {
        sh 'mvn build'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

  }
  environment {
    M3 = 'mvn'
  }
}