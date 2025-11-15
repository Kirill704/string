import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//задача 1
        System.out.println("задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

//задача 2
        System.out.println("задача 2");

        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчёта - " + fullName.toUpperCase());

//задача 3
        System.out.println("задача 3");

        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName2);
    }
}