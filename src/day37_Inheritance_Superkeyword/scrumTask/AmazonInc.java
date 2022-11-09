package day37_Inheritance_Superkeyword.scrumTask;

import day01_JavaIntro.Test;

public class AmazonInc {

    public static void main(String[] args) {

        String company = " Amazon Inc";

        ProductOwner po = new ProductOwner("Suhaib", 'M', 25, 1, 1000, company);

        BusinessAnalyst ba = new BusinessAnalyst(" Sally", 'F', 25, 2, 1500, company);

        ScrumMaster sm = new ScrumMaster("Tom", 'M', 30, 3, 1700, company);

        Tester tester1 = new Tester("Chinara", 'F', 30, "QA", 4, 1550, company);

        Tester tester2 = new Tester("Yasaman", 'F', 28, " QE", 5, 1550, company);

        Tester tester3 = new Tester("Irena", 'F', 22, "SDET", 6, 1200, company);

        Tester tester4 = new Tester("Cihad", 'M', 26, " QA", 7, 1350, company);
        Tester [] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Pamela", 'F', 28, "JDev", 8, 16000, company);

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);//ScrumTeam{Po=Suhaib, BA= Sally, SM=Tom, number of testers=4, developers=1}

        System.out.println("------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name+ " : "+ tester.salary);
        }

        System.out.println("-------------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name + " : " +developer.salary);
        }

    }
}
