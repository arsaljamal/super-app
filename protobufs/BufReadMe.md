## buf - A Command-Line Tool for Working with Protocol Buffers

Protocol buffers are a language- and platform-neutral data serialization format used for transmitting data between networked systems. The buf command-line tool allows you to work with protocol buffers in your terminal.

## Installation
To use buf, you will need to have protoc (the Protocol Buffers compiler) installed on your system.

Once you have protoc installed, you can install `buf` using go `install`:

``go get github.com/bufbuild/buf/cmd/buf``

## Usage: buf [command]
```

Available Commands:
breaking    checks for any issues with the input files
format      formats the input files
generate    generates code for the input files
lint        lints the input files
version     prints the version

Use "buf [command] --help" for more information about a command.
```

## Examples
# Lint .proto files
`buf lint --config buf.yaml`

# Format .proto files
`buf format -d -w`

# Generate code for specified languages

```
protoc --go_out=../gen/proto/go \
       --go_opt=paths=source_relative \
       --go-grpc_out=../gen/proto/go \
       --go-grpc_opt=paths=source_relative path/to/proto/**.proto

```

# Check for breaking changes
`buf breaking --exclude-imports --against-config buf.yaml --against "https://github.com/arsaljamal/super-app.git#branch=main"`


## Known Issues
buf `breaking` may produce false positives for imported files.