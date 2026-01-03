# Mi4j
Mi4j <i>(MathInterpreter4Java)</i> is an interpreter that can interpret arithmetic math problems <i>(5 + 9 - 76 / 2 for example)</i>. It only supports integers, and decimal points
will just be ignored.
# Import and use
Using Mi4j is fairly simple, start by importing the <code>MathInterpreter</code> class with the code <code>import mi4j.MathInterpreter;</code>.
<code>MathInterpreter</code> is a utility class that comes with 2 static methods. <code>interpret(String source)</code> and <code>interpret(File f)</code>. 
<code>interpret(String source)</code> will return the interpreted result of the math inside of the provided String. 
<code>interpret(File f)</code> will just parse the file and return <code>interpret(String source)</code> with the contents of the file as the parameter.
