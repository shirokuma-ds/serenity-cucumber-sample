pipeline {
  agent any
  stages {
    stage('Run Chrome') {
      steps {
        sh 'mvn clean verify'
      }
    }

  }
  environment {
    JAVA_HOME = 'JAVA_HOME'
    MVN = 'MVN'
  }
}