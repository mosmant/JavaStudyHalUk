package JavaCybertekSchool_2020.warm_up_tasks.dinner;

public class AppleInc {

    public static void main(String[] args) {

        Testers[] testers = {new Testers(),new Testers(),new Testers()};
        testers[0].setEmployeeInfo("Ramazan",18,'M',"QA",1234567,140000);
        testers[1].setEmployeeInfo("Ziladin",19,'M',"SDET",78993658,130000);
        testers[2].setEmployeeInfo("Lillia",19,'F',"SDET",98032069,157000);

        Developer[] developers = {new Developer(),new Developer(), new Developer()};
        developers[0].setEmployeeInfo("Roman",27,'M',"Front-End Dev",134598713,170000);
        developers[1].setEmployeeInfo("Cristina",18,'F',"Back-End Dev",520918523, 250000);
        developers[2].setEmployeeInfo("Zeliha", 19, 'F', "Full-Stack Dev", 521872134, 300000);

        ScrumTeam team = new ScrumTeam();
        team.addDevelopers(developers);
        team.addTesters(testers);
        System.out.println(team);



    }



}
