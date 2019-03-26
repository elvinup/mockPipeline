pipeline {
  agent any

libraries {
  lib('patching-library@master')
}
  stages {
      stage('Demo') {
	steps {
	  hello 'Elvin'
	}
      }
  }
}
