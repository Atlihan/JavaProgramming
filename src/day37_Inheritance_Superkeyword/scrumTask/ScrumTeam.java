package day37_Inheritance_Superkeyword.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ProductOwner Po;
    public BusinessAnalyst BA;
    public ScrumMaster SM;

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner po, BusinessAnalyst BA, ScrumMaster SM) {
        Po = po;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTesters(Tester tester){
        testers.add(tester);
    }

    public void addTesters(Tester [] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester (int ID){
        testers.removeIf(p-> p.ID == ID);
    }

    public void addDeveloper (Developer developer){
        developers.add(developer);
    }

    public void addDevelopers(Developer [] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper (int ID){
        developers.removeIf(p-> p.ID == ID);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "Po=" + Po.name +
                ", BA=" + BA.name +
                ", SM=" + SM.name +
                ", number of testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }
}
