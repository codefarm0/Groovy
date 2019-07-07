#! shebang line comment
package com.gl.groovy
/**
 * class declaration
 */
class GroovyComments {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        /*
        Multi line comments
        this line 1 comments
        this line 2 comments
        this line 3 comments
        this line 4 comments
         */
        println 'Groovy comments  explanation'/*multi line comment
        at end of statement*/
        int a = 1+2 /* comment in mid section */+3

        println "value of a is $a"
        String name = 'buddy'
        //calling method
        callMethod(name)
    }
    /**
     * This is groovy doc comment
     * This can be read when inspecting the below method from another class
     * this is same as java doc comments
     * @param name
     */
    static void callMethod( String name){
        println "hi $name !!"
    }
}