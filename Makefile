.PHONY: all build run clean

all: build run clean

build:
	mkdir -p build
	javac -cp vendor/gson.jar -d build src/*.java src/*/*.java
	ln -s assets build/assets
	ln -s data build/data

run:
	java -cp build:vendor/gson.jar Main

clean:
	rm -rf build/* data/*
