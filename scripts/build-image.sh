#!/usr/bin/env bash
set -euo pipefail

cd "./run-env"
docker build --build-arg server_name=${SERVER_NAME} -t hello:${VERSION} .
