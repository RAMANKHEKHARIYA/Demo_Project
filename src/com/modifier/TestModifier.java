package com.modifier;

import java.sql.SQLOutput;

public class TestModifier {
    public static void main(String[] args) {

        // Final Modifier

//        class P {
//            public void property() {
//                System.out.println("money+gold+land");
//            }
//
//            public final void marry() {
//                System.out.println("Subbha Laxmi");
//            }
//        }                                                       // marry()in C cannot override marry()in 'P'; overridden method is final
//                                                                // CE : overridden method is final
//        class C extends P {
//            public void marry() {
//                System.out.println("Kajal|Bindi");
//            }
//        }

        // Abstract Modifier

        Animal dog = new Dog();
        Animal cow = new Cow();
        System.out.println("Dog Horn : " +dog.getNoOfHorns());
        System.out.println("Cow Horn : " +cow.getNoOfHorns());
    }
}
      abstract class Animal{
          public abstract int getNoOfHorns();
      }
      class Dog extends Animal {
          public int getNoOfHorns() {
              return 0;
          }
      }
          class Cow extends Animal{
              public int getNoOfHorns() {
                  return 2;
              }
          }





