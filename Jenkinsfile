pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Ayath2020/abstracta-opencart-automation-test.git'
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
