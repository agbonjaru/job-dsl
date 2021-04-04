pipeline {
  agent any
  stages {
    stage('get code from pipeline') {
      steps {
        git(url: 'https://github.com/agbonjaru/jenkinsfiles.git', branch: 'master')
      }
    }

    stage('Build') {
      steps {
        echo 'deploying'
      }
    }

  }
  environment {
    M3 = 'mvn'
  }
}