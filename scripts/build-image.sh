#!/bin/sh
set -euo pipefail

cp build/libs/hello-ktor-1.0-SNAPSHOT.jar ./run-env

cd "./run-env"

docker build \
  --build-arg server_name=${SERVER_NAME} \
  --build-arg server_version=${SERVER_VERSION} \
  -t hello:${SERVER_VERSION} .

rm -f hello-ktor-1.0-SNAPSHOT.jar