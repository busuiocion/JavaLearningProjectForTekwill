package com.ionbusuiocqa.methodstask;

public class ExecutionService {

    public static void main(String[] args) {

        // Creează primul obiect Customer și setează proprietățile folosind constructorul
        Customer customer1 = new Customer("Alice", 25, "alice@example.com");

        // Creează al doilea obiect Customer cu valori temporare și modifică-le folosind setteri
        Customer customer2 = new Customer("", 0, "");
        customer2.setName("Bob");
        customer2.setAge(30);
        customer2.setEmail("bob@example.com");

        // Folosește DataGeneratorUtil pentru a genera valori random pentru unele proprietăți
        int randomAge1 = DataGeneratorUtil.getRandomInt(18, 60);
        customer1.setAge(randomAge1);  // setează vârsta random pentru customer1
        System.out.println("Age for customer1 set to random value: " + randomAge1);

        int randomAge2 = DataGeneratorUtil.getRandomInt(18, 60);
        customer2.setAge(randomAge2);  // setează vârsta random pentru customer2
        System.out.println("Age for customer2 set to random value: " + randomAge2);

        String randomEmail1 = DataGeneratorUtil.getRandomEmail();
        customer1.setEmail(randomEmail1);  // setează un email random pentru customer1
        System.out.println("Email for customer1 set to random value: " + randomEmail1);

        String randomEmail2 = DataGeneratorUtil.getRandomEmail();
        customer2.setEmail(randomEmail2);  // setează un email random pentru customer2
        System.out.println("Email for customer2 set to random value: " + randomEmail2);

        // Afișează detaliile pentru fiecare obiect pentru a verifica atribuirea corectă
        System.out.println("Customer 1: Name = " + customer1.getName() + ", Age = " + customer1.getAge() + ", Email = " + customer1.getEmail());
        System.out.println("Customer 2: Name = " + customer2.getName() + ", Age = " + customer2.getAge() + ", Email = " + customer2.getEmail());
    }
}


