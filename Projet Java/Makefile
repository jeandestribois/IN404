CC = javac
exec = main

all: build run

build:
	$(CC) -d bin -sourcepath src src/*.java

run:
	java -cp bin $(exec)

clean:
	rm bin/*.class

edit:
	subl src/*.java
