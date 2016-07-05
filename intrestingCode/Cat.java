package com.javarush.intrestingCode;

/**
 * Created by kde on 04.07.16.
 */
public class Cat {
    public static void main(String[] args) {
        Cat_ cat = new Cat_("Pyx");
        Cat_ catWrap = new CatWrap(cat);
        printName(catWrap);
    }

    private static void printName(Cat_ named) {
        System.out.println(named.getName());
    }

    public static class Cat_ {
        private String name;

        public Cat_ (String name_) {
            this.name = name_;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name_) {
            this.name = name_;
        }
    }

    public static class CatWrap extends Cat_ {
        private Cat_ original;

        public CatWrap(Cat_ cat) {
            super(cat.getName());
            this.original = cat;
        }

        public String getName() {
            return "The cat name is " + original.getName();
        }

        public void setName(String name_) {
            original.setName(name_);
        }
    }
}
