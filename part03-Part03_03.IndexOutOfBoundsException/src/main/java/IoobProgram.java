/*
A list is extremely useful for storing the values of variables for later use. 
That said, making mistakes is also relatively easy with a list.

There is a program that uses a list in the exercise template. 
Modify it so that its execution always produces the error IndexOutOfBounds. 
The user should not have to give any inputs to the program (e.g. write something on the keyboard)

You can also see a means for going through the values of a list — we will return to this topic a bit later.
*/


import java.util.ArrayList;

public class IoobProgram {

    public static void main(String[] args) {
        // Modify this program to cause an indexOutOfBoundsException 

        ArrayList<String> lines = new ArrayList<>();
        lines.add("Never has a man influenced physics so profoundly as Niels Bohr in the early 1900's");
        lines.add("Going back to this time period, little was known about atomic structure; Bohr set out");
        lines.add("to end the obscurity of physics. However, things didn't come easy for Bohr. He had to");
        lines.add("give up most of his life for physics and research of many hypothesis. But, this is why");
        lines.add("you and I have even heard of the quantum theory and atomic structures. Bohr came");
        lines.add("up with his quantum theory while studying...");

        for (String line : lines) {
            System.out.println(lines.get(7));
        }

    }
}
