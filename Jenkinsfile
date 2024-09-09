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
                    bat '''
                      cat README.md
                    '''
                }
        }  
    }
}
