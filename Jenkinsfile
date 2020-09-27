pipeline {
  agent {
    node {
      label 'slave1'
    }

  }
  stages {
    stage('Run Chrome') {
      steps {
        sh 'mvn clean verify'
      }
    }

  }
  environment {
    JAVA_HOME = '/usr/lib/jvm/java-1.8.0-openjdk'
    MVN_HOME = '/usr/share/maven'
  }
}