pipeline{
  agent any
  environment {
    CC = 'clang'
  }

  stages{
      stage('example'){
        environment{
          DEBUG_FLAGS = '-g'
        }
        
        steps{
          echo "${CC} ${DEBUG_FLAGS}"
          sh "printenv"
        }
      }
  }

}