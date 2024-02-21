# test-custom

Makefile - it has python image pointing to artifactory

Dockerfile - it has keycloack image pointing to artifactory

renovate.json - preset and custom manager enabled to lookup for Makefile and search new docker image of python in artifactory renotest.jfrog.io

Current Behavior :

Testing the same config available in renovate.json for customer manager with docker.io and depNametemplate as docker, the regex is working fine

Expected Behavior:

When trying to test with artifactory, it doesn't work. more look a config issue but not sure what should i mention in the depNameTemplate

