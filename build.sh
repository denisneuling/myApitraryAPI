#!/bin/bash
mvn clean install eclipse:eclipse: assembly:single javadoc:javadoc && chmod +x target/*.jar
