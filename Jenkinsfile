pipeline{
    agent any

    tools{
    maven 'Maven3'
    jdk 'JDK17'
    }

    stages{

        stage('Run Tests'){
             steps{
             sh 'mvn clean test'
             }
    }
    }
}