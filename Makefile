test: MarkdownParse.class MarkdownParseTest.class
	echo "All done!"

MarkdownParse.class: MarkdownParse.java
	/software/CSE/oracle-java-17/jdk-17.0.1/bin/javac MarkdownParse.java

MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	/software/CSE/oracle-java-17/jdk-17.0.1/bin/javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
