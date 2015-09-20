Code accompanying the paper "Drawing Non-layered Tidy Trees in Linear Time"


# Compiling and running the Measure app

This worked for me:

```
javac -sourcepath src -d build/classes src/treelayout/measure/Measure.java
java -cp build/classes treelayout.measure.Measure
```

# Porting to JavaScript

* Figure out how Measure works
    * Creates a GenerateTrees object
    * The GenerateTrees object generates random trees
    * I think that Marshall does the wrapping, and calls the layout algorithm.

* Need to create some test cases, with data in a format that can be reused for
  both Java and JavaScript.
    * Generate five random trees, and save them into the repo, along with
      results. These are my test cases, to make sure I don't break anything.





* To do to the Java code:
    * The y coordinate should be computed as part of the layout
    * Change the name of the Paper class to Layout
    * Merge Marshall -> Paper (Layout)
    * Change Marshall's convert method into "wrap", inside Paper (Layout). It should
      be called by the layout() method.




# SWT application

Download Eclipse SWT from 
[here](https://www.eclipse.org/swt/), copy it to the lib subdirectory,
and unzip it.

I wasn't able to get this to compile and run.  I was able to compile it with

```
javac -sourcepath src -cp lib/swt.jar -d build/classes \
  src/treelayout/swt/TestInterface.java 
```

But then, when I tried to run it with

```
java -cp build/classes treelayout.swt.TestInterface
```

I got the error:

```
Error: Could not find or load main class treelayout.swt.TestInterface
```
