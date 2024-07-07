package com.druv.scanner;

public class tax_calc {

    public void calculateTax(Person person)
    {
        if (person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")) {
            person.setTax(0);
            System.out.println("Tax not applicable");
        } else {
            if (person.getIncome() <= 150000) {
                person.setTax(0);
                System.out.println("No tax due to less income");
            } else if (person.getIncome() > 150000 && person.getIncome() <= 500000) {
                person.setTax((int) ((person.getIncome() - 150000) * 10 / 100));
                System.out.println("10% tax paid");
            } else if (person.getIncome() >= 500000 && person.getIncome() <= 800000) {
                person.setTax((int) ((person.getIncome() - 500000) * 20 / 100 + 35000));
                System.out.println("20% tax paid");
            } else {
                person.setTax((int) ((person.getIncome() - 800000) * 30 / 100 + 95000));
                System.out.println("30% tax paid");
            }
        }

    }
}