// BDD!

// There are three mappings
// a -> y
// o -> e
// z -> q

// For the inputs below they contain letters from a -> z

// Input!

// Case #1: ejp mysljylc kd kxveddknmc re jsicpdrysi
// Case #2: rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
// Case #3: de kr kd eoya kw aej tysr re ujdr lkgc jv

// This input was used to get the relevant output translation for Kenyanese!

// Output!

// Case #1: our language is impossible to understand
// Case #2: there are twenty six factorial possibilities
// Case #3: so it is okay if you want to just give up

// USING THE IN PUT ABOVE WE MATCH IT TO THE OUTPUT TO GET THE LETTERS SWITCH!

// BELOW ARE HOW THE LETTERS SWITCH!

//        a=y
//        b=h
//        c=e
//        d=s
//        e=o
//        f=c
//        g=v
//        h=x
//        i=d
//        j=u
//        k=i
//        l=g
//        m=l
//        n=b
//        o=k
//        p=r
//        q=z
//        r=t
//        s=n
//        t=w
//        u=j
//        v=p
//        w=f
//        x=m
//        y=a
//        z=q



// CODE SOLUTION!


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kenyanese {

    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        int lines = 0;

        Scanner in = new Scanner(new File("A small attempt.in"));
        lines = in.nextInt();
        in.nextLine();
        for (int line = 0; line < lines; ++line) {
            String curLine = in.nextLine();
            String output = translate(curLine);
            System.out.println("Case #" + (line + 1) + ": " + output);
        }
    }

    private static String translate(String curLine) {
        String output = "";
        for (int i = 0; i < curLine.length(); ++i) {
            output += "" + charMapping(curLine, i);
        }
        return output;
    }

    private static char charMapping(String curLine, int i) {
        char c = curLine.charAt(i);
        switch (c) {
        case 'a':
            c = 'y';
            break;
        case 'b':
            c = 'h';
            break;
        case 'c':
            c = 'e';
            break;
        case 'd':
            c = 's';
            break;
        case 'e':
            c = 'o';
            break;
        case 'f':
            c = 'c';
            break;
        case 'g':
            c = 'v';
            break;
        case 'h':
            c = 'x';
            break;
        case 'i':
            c = 'd';
            break;
        case 'j':
            c = 'u';
            break;
        case 'k':
            c = 'i';
            break;
        case 'l':
            c = 'g';
            break;
        case 'm':
            c = 'l';
            break;
        case 'n':
            c = 'b';
            break;
        case 'o':
            c = 'k';
            break;
        case 'p':
            c = 'r';
            break;
        case 'q':
            c = 'z';
            break;
        case 'r':
            c = 't';
            break;
        case 's':
            c = 'n';
            break;
        case 't':
            c = 'w';
            break;
        case 'u':
            c = 'j';
            break;
        case 'v':
            c = 'p';
            break;
        case 'w':
            c = 'f';
            break;
        case 'x':
            c = 'm';
            break;
        case 'y':
            c = 'a';
            break;
        case 'z':
            c = 'q';
            break;
        default:
            
            break;
        }
        return c;
    }

}