pipeline{
  agent any
  environment {
    CC = 'clang'

    __server_name = 'mail-server'
    __version = "${env.BUILD_NUMBER}"
    __artifact_name = "${__server_name}-${__version}.jar"
  }

  stages{
      stage('example'){
        environment{
          DEBUG_FLAGS = '-g'
        }
        
        steps{
          echo "${CC} ${DEBUG_FLAGS}"
          echo "${__artifact_name}"
          echo "${env.g_name}"
          // sh "printenv"
        }
      }
  }

}