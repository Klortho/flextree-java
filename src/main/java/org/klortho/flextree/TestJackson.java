package org.klortho.flextree;

import java.io.File;
import java.io.PrintStream;

/**
 * Simple program illustrating how to use the library - reads a tree from a JSON file
 * named "tree.json" in the run directory, lays it out, and then prints it out as
 * JSON to "tree-after.json".
 */
public class TestJackson {
    public static void main(String[] argv) {
        try {
            // Read it in from JSON
            File tree_json = new File("tree.json");
            TreeNode tree = TreeNode.fromJson(tree_json);

            Marshall m = new Marshall();
            Object converted = m.convert(tree);
            m.runOnConverted(converted);
            m.convertBack(converted, tree);

            PrintStream after = new PrintStream("tree-after.json");
            after.print(tree.toJson());
            after.close();
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
