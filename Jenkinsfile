pipeline {
    agent {
        docker {
            image "maven:3-alpine"
            args "-v /root/.m2:/root/.m2"
        }
    }
    stages {
        stage("build") {
            steps {
                sh "mvn clean package"
            }
        }
        stage("test") {
             steps {
                 sh "echo test"
             }
        }
    }
}