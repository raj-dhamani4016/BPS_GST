pipeline{
    agent any
    stages{
        stage('clean and build phase'){
            steps{
            bat "mvn clean -f BPS_GST"
         }
        }
        stage('Test'){
            steps {
            bat "mvn test -f BPS_GST"
            }
        }
        stage('deploy'){
            steps {
            bat "mvn package -f BPS_GST"
            }
        }
    }
}
