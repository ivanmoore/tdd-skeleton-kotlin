#!/usr/bin/env bash
set -e
./gradlew clean test jacocoTestReport
open build/reports/jacoco/test/html/index.html
