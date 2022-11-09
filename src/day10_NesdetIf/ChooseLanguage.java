package day10_NesdetIf;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selectionNum = 17;
        String language = "";

        if (selectionNum >= 1 && selectionNum <= 5) {
            if (selectionNum == 1) {
                language = "Hello, thank for your call";
            } else if (selectionNum == 2) {
                language = "Hola, gracias para llamar";
            } else if (selectionNum == 3) {
                language = "Merhaba, aradiginiz icin tesekkurler";
            } else if (selectionNum == 4) {
                language = "Privet, spasibo za vash zvonok";
            } else if (selectionNum == 5) {
                language = "Merci ,pour votre appel";
            }
        }else {
                language = "Invalid Selection";
            }
            System.out.println("for " + selectionNum + ": " + language);
        }

    }



/*
Create a class called ChooseLanguage, Given an integer variable named
selection that has a number between 1~5, Write a program that can
select the language based on the number that's given in selection and
prints the following message:
for 1: Hello, thank for your call
for 2: Hola, gracias para llamar
for 3: Merhaba, aradiginiz icin tesekkurler
for 4: Privet, spasibo za vash zvonok
for 5: Merci ,pour votre appel
 */