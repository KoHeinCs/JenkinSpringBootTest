pipeline {
    agent any
    stages {
        stage('Build Application') {
            steps {
                 bat "mvn clean package"
            }
            post {
                success {
                    echo "Now Archiving the Artifacts ... "
                    archiveArtifacts artifacts: "**/*.war"
                }
            }
        }
    }
}