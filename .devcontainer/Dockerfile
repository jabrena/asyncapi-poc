ARG VARIANT="17"
FROM mcr.microsoft.com/vscode/devcontainers/java:0-${VARIANT}
#FROM ubuntu:jammy-20230624

RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
     && apt-get -y install --no-install-recommends nodejs npm \
     && npm install -g @asyncapi/generator