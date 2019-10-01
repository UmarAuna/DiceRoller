## Important Notes

- According to Agile Software Assessment (http://p3.snf.ch/Project-144126) research,
missing null check is the most frequent pattern of bugs in Java systems. The
biggest source of errors in Java is **NullPointerExceptions**. It's so big, that speaking at
a conference in 2009, **Sir Tony Hoare** apologized for inventing the null reference, calling it 
a **billion-dollar** mistake.

- The elvis operator works as follows: if first operand is not null, then this operand
  will be returned, otherwise second operand will be returned. The elvis operator
  allows us to write very concise code.
  

- **The Kotlin compiler supports several flavors of nullability annotations, including:**

- Android (com.android.annotations and android.support.annotations)
- JetBrains (@Nullable and @NotNull from the org.jetbrains.annotations package)
- JSR-305 (Javax.annotation)

- **Casts**
- casting is a way to convert an object of one particular type into another type. In
  Java, we need to cast an object explicitly before accessing its members or cast it
  and store it in the variable of the casted type. 
  
- **In Kotlin, we can perform a few types of casts:**
- Cast objects to different types explicitly (safe cast operator)
- Cast objects to different types or nullable types to non-nullable types implicitly (smart cast mechanism)

- **Smart casts**
- Smart casting converts variable of one type to another type, but as opposed to safe casting, it is done 
implicitly (we don't need to use the as or as? cast operator). 

- Generally smart casts are available for all immutable references (val) and for local mutable references (var)

## Data Types

 |Type   |Bits Width   |
 |-------|:-----------:|
 |Double |64 	       |
 |Float  |32 	       |
 |Long   |64 	       |
 |Int    |32 	       |
 |Short  |16           |
 |Byte   |8            |
 
 - 
 - Ranges: A range is a way to define a sequence of values. It is denoted by the first and last 
   value in the sequence. We can use ranges to store weights, temperatures, time, and age. 
   
-  A program is basically a sequence of statements and expressions.
 
- An expression is a sequence of one or more operands (data that is manipulated) and zero or more 
  operators (a token that represents a specific operation) that can be evaluated to a single value
 
- Expression produces a value, which can be used as part of another expression, variable assignment, 
  or function parameter. 

- Statements, on the other hand, perform an action and cannot be assigned to a variable, 
 because they simply don't have a value. 
 
- Statements can contain language keywords that are used to define classes (class), interfaces (interface),
  variables (val, var), functions (fun), loop logic (break, continue) and so on.
  
- Expressions can also be treated as a statement when the value returned by the expression is ignored 
  **(do not assign value to variable, do not return it from a function, do not use it as part of other 
  expressions, and so on)**.
  
- Kotlin is an **expression-oriented language**. This means that many constructs that are statements 
  in Java are treated as expressions in Kotlin. The first major difference is the fact that Java and 
  Kotlin have different ways of treating control structures. In Java they are treated as statements 
  while in Kotlin all control structures are treated as expressions, except for loops. This means that 
  in Kotlin we can write very concise syntax using control structures.
  
- Vararg parameter Sometimes, the number of parameters is not known in advance. In such cases we
  can add a vararg modifier to a parameter. It allows the function to accept any number of arguments. 
   
