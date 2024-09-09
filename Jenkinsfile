pipeline {
  agent any
  stages {
        stage('build') {
            steps {
                echo "Hello World!"
            }
        }
        stage('cat README') {
                when {
                    branch "DevFix*"
                }
                steps {
                    sh '''
                      cat README.md
                    '''
                }
        }  
    }
}
