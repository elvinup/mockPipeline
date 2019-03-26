pipeline {
  agent any

libraries {
  lib('lib-share-demo@master')
}
  stages {
      stage('Demo') {
	steps {
	  hello 'Shared Lib!'
	}
      }
  }
}
