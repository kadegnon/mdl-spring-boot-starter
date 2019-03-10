node {

  stage('Configure') {

  }

  stage('Checkout') {
    git 'https://github.com/kadegnon/mdl-spring-boot-starter'
    sh "chmod +x ./mvnw .mvn/wrapper"
  }
  
  
  stage('Install') {
    sh "./mvnw clean install -DskipTests"
  }

  stage('Tests') {
    sh "./mvnw test"
  }
  
  stage('Archive') {
    junit allowEmptyResults: true, testResults: '**/target/**/TEST*.xml'
  }
  
  stage('Deliver for development') {
      when {
          branch 'develop'
      }
      steps {
          sh 'echo "Develop branch - new features added "'
      }
  }
  
  stage('Deploy for production') {
      when {
          branch 'master'
      }
      steps {
          sh 'echo "Master branch - new version released "'
      }
  }

}
