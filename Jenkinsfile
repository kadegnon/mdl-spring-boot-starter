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

}
