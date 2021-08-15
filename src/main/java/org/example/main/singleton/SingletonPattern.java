package org.example.main.singleton;

public final  class SingletonPattern {

    public static SingletonPattern getInstance() {
        return CreateInstance.pattern;
    }
     static class CreateInstance {
        public static final SingletonPattern pattern = new SingletonPattern();


    }

}
