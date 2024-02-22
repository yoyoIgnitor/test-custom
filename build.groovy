@Library('jenkins-libs@mtag') _
import groovy.transform.Field

@Field String TEAM_NAME = "star"
@Field String TEAM = "star"
@Field String PYTHON_BASE_IMAGE = "renotest.jfrog.io/dev-docker/python:3.10"
@Field String DEPLOYMENT_ROOT_DIR = "./deployment"