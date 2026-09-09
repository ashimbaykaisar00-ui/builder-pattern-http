# Assignment 1: Builder Design Pattern (HTTP Request)

## Project Overview
This project implements the **Builder Design Pattern** in Java. It demonstrates how a single construction process managed by a Director can produce two distinct product representations: a domain Java object and a cURL command string.

## Features
- **Immutable Product**: `HttpRequest` fields are final with package-private instantiation.
- **Fluent API**: Every builder method returns `this` for easy chaining.
- **Two Representations**:
  - `HttpRequest` Java object (`HttpRequestObjectBuilder`)
  - Executable `cURL` command string (`CurlCommandBuilder`)
- **Director Presets**: `HttpDirector` encapsulates standard request configurations (`makeGetUsersRequest`, `makeCreateUserRequest`).
- **Validation**: Enforces required field checks in `getResult()` and throws `IllegalStateException`.

## Project Structure
- `HttpRequest`: Immutable product class.
- `HttpRequestBuilder`: Abstract interface defining construction steps.
- `HttpRequestObjectBuilder`: Concrete builder producing `HttpRequest` objects.
- `CurlCommandBuilder`: Concrete builder producing formatted cURL strings.
- `HttpDirector`: Controls step-by-step construction.
- `Main`: Client entry point demonstrating execution and state validation.
