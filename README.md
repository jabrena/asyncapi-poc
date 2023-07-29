# Async API POC

A POC to review Async API Spec and some tools related.

## Async API Examples

[./specs/](./specs/)

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
sudo ag ./specs/hello-world-asyncapi.yaml @asyncapi/html-template -o examples/html-example
sudo ag ./specs/hello-world-asyncapi.yaml @asyncapi/markdown-template -o examples/markdown-example
sudo ag ./specs/hello-world-asyncapi.yaml @asyncapi/java-spring-template -o examples/spring-example
sudo ag ./specs/hello-world-asyncapi.yaml @asyncapi/java-spring-cloud-stream-template -o examples/spring-cloud-stream-example

sdk install java 20-tem
sdk use java 20-tem
jwebserver -p 9000 -d "$(pwd)/html-example/"
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