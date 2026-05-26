pipeline{
    agent any

    tools{
    maven 'Maven3'
    jdk 'JDK17'
    }

    stages{

        stage('Checkout'){
            steps{
                git 'https://github.com/sandeshg510/Selenium-Framework.git'
            }
        }

        stage('Run Tests'){
             steps{
             sh 'mvn clean test'
             }
    }
    }
}