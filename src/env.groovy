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
          sh "${CC} ${DEBUG_FLAGS}"
          sh "printenv"
        }
      }
  }

}