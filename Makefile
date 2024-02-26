.PHONY: all build run clean

all: build run clean

build:
	javac -d build src/*.java src/*/*.java
	ln -s assets build/assets

run:
	java -cp build Main

clean:
	rm -rf build/*
