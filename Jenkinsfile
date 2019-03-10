node {

  stage('Configure') {
    env.PATH = "${tool 'maven-3.5.2'}/bin:${env.PATH}"
  }

  stage('Checkout') {
    git 'https://github.com/kadegnon/mdl-spring-boot-starter'
  }

  stage('Build') {
    sh 'mvn -B -V -U -e clean package test'
  }

  stage('Archive') {
    junit allowEmptyResults: true, testResults: '**/target/**/TEST*.xml'
  }

}
