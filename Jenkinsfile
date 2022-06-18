pipeline {
    agent any
    stages {
        stage('Build Application') {
            steps {
                maven('mvn clean package','pom.xml')
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