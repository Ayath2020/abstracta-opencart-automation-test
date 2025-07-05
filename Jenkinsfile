pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/tu_usuario/tu_repo.git'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'gradlew.bat clean test aggregate'  // Ejecuta Gradle Wrapper en Windows
            }
        }

        stage('Publish Serenity Report') {
            steps {
                publishHTML([
                    reportDir: 'build/reports/serenity',
                    reportFiles: 'index.html',
                    reportName: 'Serenity Report'
                ])
            }
        }
    }
}
