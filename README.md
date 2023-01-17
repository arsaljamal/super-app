# super-app

Purpose of working on this project is to demonstrate how MicroServices can work together in an ecosystem to build any type of product!

Microservices are a way of designing and building software systems that allow for flexibility, scalability, and maintainability.
In a microservices architecture, a single application is built as a suite of small, independent services that communicate with each other
using well-defined APIs.

## Symlink
If you want to import the generated protobuf files located in **super-app/protobufs/gen/proto/go** into your microservice located in **super-app/services/user-service/service**, you can create a symlink to the protobuf files in the microservice directory.

You can do this by navigating to the **super-app/services/user-service/service** directory in the terminal and using the **ln command with the -s flag to create a symbolic link to the super-app/protobufs/gen/proto/go directory**:

`cd super-app/services/user-service/service
ln -s ../../../protobufs/gen/proto/go protobufs`

This command will create a symlink named **"protobufs"** in the **super-app/services/user-service/service** directory that links to the **super-app/protobufs/gen/proto/go directory**.

Then you can import the generated protobuf files in your microservice code