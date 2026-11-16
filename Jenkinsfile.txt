
pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Fetching source code'
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java application'
                bat 'mvn clean compile'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging application into JAR'
                bat 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Copying JAR to deployment folder'

                bat '''
                if not exist C:\\StudentResultDeployment mkdir C:\\StudentResultDeployment

                copy /Y target\\student-result-app-1.0-SNAPSHOT.jar C:\\StudentResultDeployment\\student-result-app.jar
                '''
            }
        }
    }
}
