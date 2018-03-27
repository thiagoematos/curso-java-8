package _03_lambda_mais_detalhes.prints;

import java.util.function.Predicate;

public class GenericIf {

    private static Employee findEmployeeByFirstName(List<Employee> employees, String firstName) {
        for (Employee e : employees) {
            if (e.getFirstName().equals(firstName)) {
                return e;
            }
        }
        return null;
    }

    private static Employee findEmployeeBySalary(List<Employee> employees, double salaryCutoff) {
        for (Employee e : employees) {
            if (e.getSalary() >= salaryCutoff) {
                return e;
            }
        }
        return null;
    }

    private static Employee firstMatchingEmployee(List<Employee> candidates, Predicate<Employee> matchFunction) {
        for (Employee possibleMatch : candidates) {
            if (matchFunction.test(possibleMatch)) {
                return possibleMatch;
            }
        }
        return null;
    }

    private static <T> T firstMatch(List<T> anyList, Predicate<T> matchFunction) {
        for (T possibleMatch : anyList) {
            if (matchFunction.test(possibleMatch)) {
                return possibleMatch;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        firstMatchingEmployee(employees, e -> e.getSalary() > 500_000);
        firstMatchingEmployee(employees, e -> e.getLastName().equals("…"));
        firstMatchingEmployee(employees, e -> e.getId() < 10);

        firstMatch(employees, e -> e.getSalary() > 500_000);
        firstMatch(employees, e -> e.getLastName().equals("…"));
        firstMatch(employees, e -> e.getId() < 10);

        Country firstBigCountry   = firstMatch(countries, c -> c.getPopulation() > 10_000_000);
        Car     firstCheapCar     = firstMatch(cars, c -> c.getPrice() < 15_000);
        Company firstSmallCompany = firstMatch(companies, c -> c.numEmployees() <= 50);
        String  firstShortString  = firstMatch(strings, s -> s.length() < 4);
    }

}