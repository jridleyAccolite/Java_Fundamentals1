package part5;

public class jvmArchitecture {
    /* The JVM (Java Virtual Machine) is an abstract virtual machine within the lifecycle of a
    Java Application.

    The JVM doesn't physically exist (hence, virtual), but is used to refer to the processes by
    which a .class file is read. Therefore, the JVM is concerned with the Java App lifecycle after
    the .java code has been compiled into a .class file.

    The JVM architecture consists of:

    The Class Loader
    - This is the first stage, which handles loading the code into memory, running the Linking process
    (verification) for all dependencies, and initialising the classes.

    The Runtime Memory/Data Environment
    - Method Area (stores class level data)
    - Heap Area (stores object level data and their instances)
    - Stack Area (stores all local variable, method calls, and partial results. New Stack Area is created
    each time a new thread is created)
    - Program Counter Register (contains memory addresses of currently executing program instructions)
    - Native Method Stack (used to support native methods. One per thread)

    The Execution Engine
    - Interpreter (converts the bytecode into Machine code line by line)
    - JIT Compiler (also converts bytecode into Machine code, used in tandem with Interpreter. The
    Interpreter compiles code line by line, and then the JIT Compiler is used to compile faster whenever
    repeated code is encountered)
    - Garbage Collector (collects and removes unreferenced objects from the Heap, automatically deletes
    them to reclaim runtime memory)

    Parallel to these there is sometimes a JNI:
    Java Native Interface
    - this allows the use of native (non-Java) code alongside Java
    - This is also used to load Native Method Libraries that may be necessary for the native code within
    the program.
    */
}
