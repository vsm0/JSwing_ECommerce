.PHONY: all build run clean

all: build run clean

build:
	javac *.java */*.java

run:
	java Main

clean:
	rm *.class */*.class
