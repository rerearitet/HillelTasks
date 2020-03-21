package com.antongorokh.lesson4.ITcompany;


public class Main {
    public static void main(String[] args) {
        Employee designer = new Designer(8, "make new design", "provide new design to manager");
        Employee developer = new Developer(8, "take task from manager", "fix bugs");
        Employee manager = new Manager(8, "test new program part", "report developer about bugs");
        Employee qualityAssurance = new QualityAssurance(8, "check project requirements", "call to customer", "review new design");

        try {
            for (String arg : args) {
                if (arg.equals("Designer")) {
                    System.out.println(designer.toString());
                } else if (arg.equals("Developer")) {
                    System.out.println(developer.toString());
                } else if (arg.equals("Manager")) {
                    System.out.println(manager.toString());
                } else if (arg.equals("QualityAssurance")) {
                    System.out.println(qualityAssurance.toString());
                }
            }
        } catch (Exception e) { }
    }
}
