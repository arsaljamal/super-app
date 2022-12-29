# Directory containing .proto and .yaml files
PROTO_DIR = protos

# Directory for generated files
GEN_DIR = gen

# List of languages to generate code for
LANGUAGES = go dart kotlin java web

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
			 find . -name '*.proto' -exec protoc --go_out=../gen/proto/go --go_opt=paths=source_relative \
			                              --go-grpc_out=../gen/proto/go --go-grpc_opt=paths=source_relative {} +; \
		elif [ $$i == "dart" ]; then \
			 mkdir -p ../gen/proto/dart; \
			 find . -name '*.proto' -exec protoc --dart_out=grpc:../gen/proto/dart {} +; \
		elif [ $$i == "kotlin" ]; then \
        			 mkdir -p ../gen/proto/kotlin; \
        			 find . -name '*.proto' -exec protoc --plugin=protoc-gen-grpckt=protoc-gen-grpc-kotlin.sh \
        			  							  --kotlin_out=../gen/proto/kotlin --grpckt_out=../gen/proto/kotlin {} +; \
        elif [ $$i == "java" ]; then \
                			 mkdir -p ../gen/proto/java; \
                			 find . -name '*.proto' -exec protoc --plugin=protoc-gen-grpc-java=protoc-gen-grpc-java-1.51.1-osx-aarch_64.exe \
                			  				          --java_out=../gen/proto/java --grpc-java_out=../gen/proto/java {} +; \
		elif [ $$i == "java" ]; then \
                        			 mkdir -p ../gen/proto/java; \
                        			 find . -name '*.proto' -exec protoc --plugin=protoc-gen-grpc-java=protoc-gen-grpc-java-1.51.1-osx-aarch_64.exe \
                        			  				          --java_out=../gen/proto/java --grpc-java_out=../gen/proto/java {} +; \
		elif [ $$i == "web" ]; then \
                        			 mkdir -p ../gen/proto/web; \
                        			 find . -name '*.proto' -exec protoc --plugin=protoc-gen-grpc-web=protoc-gen-grpc-web-1.4.2-darwin-aarch64 \
                        			  								--grpc-web_out=import_style=typescript,mode=grpcwebtext:../gen/proto/web {} +;\
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
