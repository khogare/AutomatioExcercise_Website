pipeline {

    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/khogare/AutomatioExcercise_Website.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Run TestNG Tests') {
            steps {
                bat 'mvn test'
            }
        }

    }

    post {

        always {

            // Publish TestNG Results
            publishTestNGResults testResultsPattern: 'target/surefire-reports/testng-results.xml'

            // Archive reports
            archiveArtifacts artifacts: 'target/surefire-reports/*.*', fingerprint: true
        }
    }
}