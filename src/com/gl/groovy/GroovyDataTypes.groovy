package com.gl.groovy

class GroovyDataTypes {

     static void main(String[] args) {
        byte a =2 // byte value -128 to 127
        short b =3 //short number -32,768 to 32,767
        int c = 1234 //represents whole number -2,147,483,648 to 2,147,483,647
        long d = 4343 //long number -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
        float e = 34.43//32 bit floating point numbers 1.40129846432481707e-45 to 3.40282346638528860e+38
        double f = 32323.32// 64 bit floating point number 4.94065645841246544e-324d to 1.79769313486231570e+308d
        char g = 'f'
        boolean h = true //true/false

        println "$a, $b, $c, $d, $e, $f, $g, $h"
    }


    // Wrapper types
    /**
     * java.lang.Byte
     * java.lang.Short
     * java.lang.Integer
     * java.lang.Long
     * java.lang.Float
     * java.lang.Double
     */
}
