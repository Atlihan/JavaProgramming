package day31_Constructors.ScrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {
        /*
        1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
         */

        // 4 Testers objects
        Tester tester1 = new Tester("Lyan", 11, "QA", 110000);
        Tester tester2 = new Tester("Ali", 12, "SDET", 112000);
        Tester tester3 = new Tester("John", 13, "SE", 142000);
        Tester tester4 = new Tester("Aylin", 14, "SDET", 115000);

        Tester [] testers = {tester2, tester3, tester4};

        // 4 Devops objects
        Developer developer1 = new Developer("Olga", 14, "Java Dev", 125000);
        Developer developer2 = new Developer("Jane", 15, "Java Mast", 135000);
        Developer developer3 = new Developer("Jack", 16, "Soft Dev", 155000);
        Developer developer4 = new Developer("Sally", 17, "Sen Dev", 105000);

        Developer [] developers = { developer2, developer3, developer4};
        // 1 scrum team object

        ScrumTeam scrum = new ScrumTeam("Niagara", "Hanry", "George", 14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);//ScrumTeam{PO='Niagara', BA='Hanry', SM='George', total number of testers=4, total number of developers=4, daysOfSprint=14}

        System.out.println("-----------------------------");

        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name+" : "+ eachTester.salary);
        }
        System.out.println("--------------------------------");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);

        }
        scrum.removeTester(12);
        scrum.removeDeveloper(17);



    }
}
