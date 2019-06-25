FROM golang:1.12-alpine as build
WORKDIR /build
COPY go.mod .
RUN apk add --update --no-cache git \
    && go mod download
COPY . /build
RUN GOOS=linux CGO_ENABLED=0 go build -o app

FROM alpine:3.9
WORKDIR /run
COPY --from=build /build/app /run/app
ENTRYPOINT [ "./app" ]