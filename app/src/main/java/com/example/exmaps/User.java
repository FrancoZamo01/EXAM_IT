package com.example.exmaps;

public class User {
    private Name name;
    private Location location;
    private String email;
    private Picture picture;


    public Name getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public Picture getPicture() {
        return picture;
    }


    public static class Name {
        private String title;
        private String first;
        private String last;

        public String getFullName() {
            return title + " " + first + " " + last;
        }
    }


    public static class Location {
        private String country;

        public String getCountry() {
            return country;
        }
    }


    public static class Picture {
        private String large;

        public String getLarge() {
            return large;
        }
    }
}
