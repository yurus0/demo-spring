pipeline {
    agent any // Use any available agent

    tools {
        mvn 'Maven 3.9.9'
    }
    stages {
        // Stage 0: Cloning the GitHub repository
        stage('Clone') {
            steps {
                // Clone the repository
                git branch: 'main', url: 'https://github.com/yurus0/demo-spring.git'
            }
        }

        // Stage 1: Build the project using Maven
        stage('Build') {
            steps {
                script {
                    // Clean and build the project, packaging it into a JAR or WAR file
                    sh 'mvn clean install'
                }
            }
        }
    }
}