package com.company;

public class ReportsGeneratorFacade {
    public static String generateReport(String report){
        Reports orderReport=new OrderReport();
        orderReport.generateReport();
        return report+" generated successfully!";
        }
    }

