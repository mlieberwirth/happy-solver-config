#!/usr/bin/env bash

cd ..

./gradlew clean bootJar

cd run-local

mv ../build/libs/happy-solver-monitor.jar happy-solver-monitor.jar 

