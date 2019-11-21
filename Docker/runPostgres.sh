#!/bin/sh

docker run --name postgres -p 5432:5432 -e POSTGRES_PASSWORD=P@ssw0rd -d postgres:11.5
