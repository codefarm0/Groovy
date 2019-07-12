package com.gl.def1

class DefDemo {
    static void main(String[] args) {
        def int1= 123;
        println "def int1 > $int1"
        def string1 = "i am string"
        println "def string >  $string1"
        def list = [1,2,3]
        println "def list > $list"
        def goodMan = new Man("arvind")
        println goodMan.getName()

        //def var3 = int1 + goodMan

        assert int1 instanceof Integer
        assert string1 instanceof String
        assert list instanceof List
        assert goodMan instanceof Man

        Man man1 = getMeMan()
        println(man1)

    }

    static def getMeMan() {
        return "i am the man"
    }
}
