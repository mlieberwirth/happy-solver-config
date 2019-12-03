#!/usr/bin/env bash

java -Dspring.cloud.config.profile=local \
     -Dspring.profiles.active=local \
     -Xmx112M \
     -Xms112M \
     -jar happy-solver-monitor.jar
