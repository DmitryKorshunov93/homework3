// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var bokserA = 78.2;
        var bokserB = 82.7;

        var weight = bokserA + bokserB;
        System.out.println(weight);
        var massDifference =   bokserA - bokserB;
        System.out.println(massDifference);

        var massDifference2 = bokserB - bokserA;
        System.out.println(massDifference2);
        var massDifference3 = bokserB % bokserA;
        System.out.println(massDifference3);

        var openingHours = 640;
        var employeeHours = 8;
        var employees = openingHours / employeeHours;
        System.out.println("Всего рабоников в компании - " + employees + " человек");
        employees = employees + 94;
        openingHours = openingHours + employees * employeeHours;
        System.out.println("Если в компании работает " + employees + " человека, то всего " + openingHours + " часов работы может быть поделено между сотрудниками");
















    }
}