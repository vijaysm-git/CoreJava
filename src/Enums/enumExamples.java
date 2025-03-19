package Enums;

public class enumExamples {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        //  MONDAY-SUNDAY THEY ARE CONSTANTS
        //PUBLIC,STATIC AND FINAL CANT CREATE CHILD CLASSES SINCE IT IS FINAL
        //type is week
        Week() {
            System.out.println("Constructor called for " + this);
        }
        }

    public static void main(String[] args) {
        Week week;
        week = Week.Wednesday;

//        for(Week day : Week.values()){
//            System.out.println(week.ordinal());
//        }
    }

}