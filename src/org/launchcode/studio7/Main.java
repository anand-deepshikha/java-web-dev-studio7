package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        DVD readWrite = DVD.DVDRW(10);
        DVD writeOnly = DVD.DVDR(20);

        CD music = new CD("Blue Weekend", "The Last man on Earth\nSmile\nNo Hard Feelings,\nHow can I make it OK?");


        // TODO: Call each CD and DVD method to verify that they work as expected.
        readWrite.spinDisc();
        readWrite.getDiscInfo();
        readWrite.writeDiscData("Home Alone", "0:00 - 1:45 hrs : Kid Alone at Home");
        readWrite.readDiscData();
        readWrite.writeDiscData("Home Alone 2", "0:00 - 2:00 : How kid managed alone at home");
        readWrite.readDiscData();

        System.out.println("\n-----\n");

        writeOnly.spinDisc();
        writeOnly.getDiscInfo();
        writeOnly.writeDiscData("Typescript", "0:00 - 1:00 : Basic Syntax\n1:00 - 2:00 : Classes & Inheritance");
        writeOnly.readDiscData();
        writeOnly.writeDiscData("Jasmine", "lots of new video");
        writeOnly.readDiscData();

        System.out.println("\n-----\n");

        music.spinDisc();
        music.getDiscInfo();
        music.writeDiscData("More Music", "fun songs");
        music.readDiscData();
    }
    }

