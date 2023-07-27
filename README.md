# Async API POC

## Async API Generator

https://www.asyncapi.com/tools/generator

Templates:

```
@asyncapi/java-template	Generates Java JMS application	click here
@asyncapi/java-spring-template	Generates Java Spring service	click here
@asyncapi/java-spring-cloud-stream-template	Generates Java Spring Cloud Stream service	click here
@asyncapi/html-template	Generates HTML documentation site	click here
@asyncapi/markdown-template	Generates documentation in Markdown file
```

```bash
sudo apt update
sudo apt install nodejs npm
nodejs --version
npm --version
sudo npm install -g @asyncapi/generator

ag --help
Usage: ag [options] <asyncapi> <template>

Options:
  -V, --version                  output the version number
  -d, --disable-hook [hooks...]  disable a specific hook type or hooks from given hook type
  --debug                        enable more specific errors in the console
  -i, --install                  installs the template and its dependencies (defaults to false)
  -n, --no-overwrite <glob>      glob or path of the file(s) to skip when regenerating
  -o, --output <outputDir>       directory where to put the generated files (defaults to current directory) (default:
                                 "/workspaces/asyncapi-poc/springwolf-kafka-example")
  -p, --param <name=value>       additional param to pass to templates
  --force-write                  force writing of the generated files to given directory even if it is a git repo with unstaged files or
                                 not empty dir (defaults to false)
  --watch-template               watches the template directory and the AsyncAPI document, and re-generate the files when changes occur.
                                 Ignores the output directory. This flag should be used only for template development.
  --map-base-url <url:folder>    maps all schema references from base url to local folder
  -h, --help                     display help for command

sudo ag ./hello-world-asyncapi.yaml @asyncapi/html-template -o html-example

sdk install java 20-tem
sdk use java 20-tem
jwebserver -p 9000 -d "$(pwd)/html-example/"

# Step 2: Stop the webserver & use the default Java version
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