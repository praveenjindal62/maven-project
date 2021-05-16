pipeline{
    agent any
    stages{
        stage("Stage1") {
            steps{
                echo "Hello Stage 1"
            }
        }
    }
}