package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person p) {
        return p.getCity().equals(Person.MCR);
    }

    public boolean canWatchFilm(Person p1, int ageLimit) {
        return p1.getAge() >= ageLimit;
    }


    static class Person { //in order to be able to instantiate the nested class without having to reference to the outer one Exercise002.
        private static final String MCR = "Manchester";
        private String name;
        private String forename;
        private String city;
        private int age;


        public Person(String name, String forename, String city, int age) {
            this.name = name;
            this.forename = forename;
            this.city = city;
            this.age = age;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getForename() {
            return forename;
        }

        public void setForename(String forename) {
            this.forename = forename;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}