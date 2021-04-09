pipeline{
    agent any
    stages{
        stage('clean and build phase'){
            steps{
            bat "mvn clean"
         }
        }
        stage('Test'){
            steps {
            bat "mvn test"
            }
        }
        stage('deploy'){
            steps {
            bat "mvn package"
            }
        }
    }
}
