// //https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.util.ArrayList;

// public class MarkdownParse {

//     public static ArrayList<String> getLinks(String markdown) {
//         ArrayList<String> toReturn = new ArrayList<>();
//         // find the next [, then find the ], then find the (, then read link upto next )
//         int currentIndex = 0;
//         while(currentIndex < markdown.length()) {
//             int openBracket = markdown.indexOf("[", currentIndex);

//             if (openBracket == -1) break;
            
//             int closeBracket = markdown.indexOf("]", openBracket);
//             int openParen = markdown.indexOf("(", closeBracket);
//             int closeParen = markdown.indexOf(")", openParen);

//             System.out.println("test");

//             if (closeParen + 2 <= markdown.length() - 1) {
//                 if (!markdown.substring(closeParen + 1, closeParen + 2).equals(" ") || !markdown.substring(closeParen + 1, closeParen + 2).equals("[")) {
//                     closeParen = markdown.indexOf(")", closeParen + 1);
//                 }
//             }
            
//             toReturn.add(markdown.substring(openParen + 1, closeParen));
//             currentIndex = closeParen + 1;
//         }

//         return toReturn;
//     }


//     public static void main(String[] args) throws IOException {
//         Path fileName = Path.of(args[0]);
//         String content = Files.readString(fileName);
//         ArrayList<String> links = getLinks(content);
// 	    System.out.println(links);
//     }
// }

// Commented out the original code since we were able to fix one test file but it messed up the rest

//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);
            toReturn.add(markdown.substring(openParen + 1, closeParen));
            currentIndex = closeParen + 1;
        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}