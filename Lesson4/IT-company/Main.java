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
                    printEmployee(designer);
                } else if (arg.equals("Developer")) {
                    printEmployee(developer);
                } else if (arg.equals("Manager")) {
                    printEmployee(manager);
                } else if (arg.equals("QualityAssurance")) {
                    printEmployee(qualityAssurance);
                }
            }
        } catch (Exception e) { }
    }

    public static void printEmployee(Employee employee) {
        System.out.println(employee.toString());
    }
}
