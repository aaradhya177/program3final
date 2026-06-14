package com.example;
public class App {
 public static void main(String[] args) {
 // Immutable String Demonstration
 String sourceText = "DevOps with Jenkins";
 System.out.println("Original Source Text: " + sourceText);
 String destinationText = sourceText;
 System.out.println("Copied Destination Text: " + destinationText);
 destinationText = destinationText + " Pipeline";
 System.out.println("Modified Destination: " + destinationText);
 System.out.println("Source After Modify: " + sourceText);
 System.out.println("\n--- Concept Summary ---");
 System.out.println("Strings in Java are IMMUTABLE.");
 System.out.println("Modifying destinationText did NOT change sourceText.");
 }
}
