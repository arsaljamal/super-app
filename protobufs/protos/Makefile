# Directory containing .proto and .yaml files
PROTO_DIR = protos

# Directory for generated files
GEN_DIR = gen

# List of languages to generate code for
LANGUAGES = go

# Default target
all: lint format clean generate

#update:
#	buf mod update

# Lint .proto and .yaml files
lint:
	buf lint --config buf.yaml

# Format .proto and .yaml files
format:
	buf format -d -w

# Generate code for specified languages
generate:
	for i in $(LANGUAGES); do \
		if [ $$i == "go" ]; then \
		  	 mkdir -p ../gen/proto/go; \
			 find . -name '*.proto' -exec protoc --go_out=../gen/proto/go --go_opt=paths=source_relative --go-grpc_out=../gen/proto/go --go-grpc_opt=paths=source_relative {} +; \
		fi \
    done

# Check for breaking changes
breaking:
	buf breaking --exclude-imports --against-config buf.yaml --against "https://github.com/arsaljamal/super-app.git#branch=main"

# Check all targets
check: lint format breaking

# Clean generated files
clean:
	rm -r ../$(GEN_DIR)/*

.PHONY: all lint format generate breaking check clean
