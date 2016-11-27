#!/bin/bash

echo "## Maven version: ##"
mvn -v
echo "## Installation des dépendances qui ne disposent pas de pom.xml. ##"
mvn install:install-file -Dfile=src/main/resources/WyLog_v2.jar -DgroupId=net.wytrem.logging -DartifactId=wylog -Dversion=2.0 -Dpackaging=jar
echo "## Installation terminée. ##"