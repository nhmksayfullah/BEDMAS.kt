# BEDMAS.kt

Execute math expression as a String and do BEDMAS operation easily in Kotlin.
Just copy the bedmas.kt file, paste to your project. Change the package name. And start calculating. Yahoo!

```
    val simpleExpression = "6/3"
    println(simpleExpression.removeSpace().extractExpression().execute())

    val complexExpression = "12+53*7-21/43"
    println(complexExpression.removeSpace().extractExpression().execute())

    val exponentialExpression = "2+5^4*9/9"
    println(exponentialExpression.removeSpace().extractExpression().execute())

```
