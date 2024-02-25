.PHONY: all build run clean

all: build run clean

build:
	javac *.java

run:
	java Main

clean:
	rm *.class
