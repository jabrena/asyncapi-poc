# Async API POC

A POC to review Async API Spec and some tools related.

## Goals

- [x] Learn to define Async API Specs
- [x] Learn to generate documentation from Async API Specs
- [x] Learn to use Spectral for Async API
- [x] Learn to define a Spectral ruleset for Async API Specs
- [ ] Learn to use Microcks
- [ ] Learn to use Testcontainers support for Microcks
- [ ] Learn to use Maven/Gradle plugin for Async API


## Async API examples

```bash
cd specs
```

## Microcks

https://microcks.io/

Microcks is now able to import AsyncAPI definitions for enriching the API catalogs with Event typed APIs. When set up accordingly, it is also able to mock the API by publishing samples messages on a dedicated message broker destination.

```bash
cd microcks
docker-compose up -d
open http://localhost:8080
docker-compose down
```

## Async API Generator

https://www.asyncapi.com/tools/generator

**Async API Generator Templates:**

```
@asyncapi/java-template	Generates Java JMS application	click here
@asyncapi/java-spring-template	Generates Java Spring service	click here
@asyncapi/java-spring-cloud-stream-template	Generates Java Spring Cloud Stream service	click here
@asyncapi/html-template	Generates HTML documentation site	click here
@asyncapi/markdown-template	Generates documentation in Markdown file
```

**How to:**

```bash
# Move to a Script executed at codespaces level.
sudo apt update
sudo apt install nodejs npm
nodejs --version
npm --version
sudo npm install -g @asyncapi/generator

ag --help
sudo ag ./specs/complex-asyncapi.yaml @asyncapi/html-template -o ./docs
sudo ag ./specs/hello-world-asyncapi.yaml @asyncapi/html-template -o examples/html-example
sudo ag ./specs/hello-world-asyncapi.yaml @asyncapi/markdown-template -o examples/markdown-example
sudo ag ./specs/hello-world-asyncapi.yaml @asyncapi/java-spring-template -o examples/spring-example
sudo ag ./specs/hello-world-asyncapi.yaml @asyncapi/java-spring-cloud-stream-template -o examples/spring-cloud-stream-example

sdk install java 20-tem
sdk use java 20-tem
jwebserver -p 9000 -d "$(pwd)/docs/"
sdk env install
sdk env
```

## References

- https://studio.asyncapi.com/
- https://www.asyncapi.com/docs/tutorials/getting-started/hello-world
- https://github.com/asyncapi/cli
- https://github.com/asyncapi/generator
- https://www.asyncapi.com/docs
- https://www.asyncapi.com/docs/tools/generator
- https://hub.docker.com/r/stavshamir/springwolf-kafka-example/tags
- https://github.com/asyncapi/jasyncapi
- https://www.confluent.io/events/kafka-summit-europe-2021/getting-started-with-asyncapi-how-to-describe-your-kafka-cluster/
- https://www.asyncapi.com/blog/asyncapi_codegen_scst
- https://github.com/springwolf/springwolf-core
- https://microcks.io/blog/async-features-with-docker-compose/
- https://microcks.io/documentation/using/asyncapi/