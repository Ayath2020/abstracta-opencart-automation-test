pipeline {
    agent any

    environment {
        SELENIUM_URL = "http://selenium:4444/wd/hub"
    }

    stages {
        stage('Test') {
            steps {
                echo "🚀 Ejecutando pruebas automatizadas con Selenium remoto"
                sh './gradlew clean test -Dwebdriver.remote.url=${SELENIUM_URL}'
            }
        }

        stage('Publicar Reporte Serenity') {
            steps {
                echo "📊 Publicando reporte en el panel de Jenkins"
                publishHTML(target: [
                    reportDir: 'target/site/serenity',
                    reportFiles: 'index.html',
                    reportName: 'Reporte de Pruebas Automatizadas'
                ])
            }
        }
    }

    post {
        always {
            echo "🧾 Publicación post-ejecución activa (aunque falle)"
            publishHTML(target: [
                reportDir: 'target/site/serenity',
                reportFiles: 'index.html',
                reportName: 'Reporte de Pruebas Automatizadas'
            ])
        }
    }
}
