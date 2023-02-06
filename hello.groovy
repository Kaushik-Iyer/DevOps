pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Question1')
        {
            steps{
                echo "How are you?"
            }
        }
        stage('Question2')
        {
            steps{
                echo "What do you do?"
            }
        }
        stage("Goodbye")
        {
            steps{
                echo "Goodbye"
            }
        }
    }
}
