public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
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
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var allWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес " + allWeight + " кг");
        var differenceWeight = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе " + differenceWeight + " кг");
        differenceWeight = boxer2Weight % boxer1Weight;
        System.out.println("Остаток от деления между весами " + differenceWeight);
        var allWorkTime = 640;
        var oneWorkTime = 8;
        var worker = allWorkTime / oneWorkTime;
        System.out.println("Всего работников в компании - " + worker + " человек");
        var newWorker = worker + 94;
        var newAllWorkTime = newWorker * oneWorkTime;
        System.out.println("Если в компании работает " + newWorker + " человека, то всего " + newAllWorkTime + " часа работы может быть поделено между сотрудниками");

        byte b = 1;
        System.out.println("Значение переменной b с типом byte равно " + b);
        int i = 1;
        System.out.println("Значение переменной i с типом int равно " + i);
        short s = 1;
        System.out.println("Значение переменной s с типом short равно " + s);
        long l = 1L;
        System.out.println("Значение переменной l с типом long равно " + l);
        float f = 1.1f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double d = 1.1;
        System.out.println("Значение переменной d с типом double равно " + d);
        // Задача 2
        float f1 = 27.12f;
        long l1 = 987678965549L;
        float f2 = 2.786f;
        short s1 = 569;
        short s2 = -159;
        short s3 = 27897;
        byte b1 = 67;
        // Задача 3
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int allSheet = 480;
        int student1 = allSheet / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + student1 + " листов бумаги");
        // Задача 4
        byte minute2 = 16;
        int minute1 = minute2 / 2;
        int bottles20minute = minute1 * 20;
        System.out.println("За 20 минут машина произвела " + bottles20minute + " штук бутылок");
        int hour = minute1 * 60;
        System.out.println("За 1 час машина произвела " + hour + " штук бутылок");
        int day = hour * 24;
        int day3 = day * 3;
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        int month = day * 30;
        System.out.println("За 1 месяц машина произвела " + month + " штук бутылок");
        // Задача 5
        byte allJar = 120;
        byte whiteJarFor1Class = 2;
        byte brownJarFor1Class = 4;
        int jarFor1Class = 6;
        int allClass = allJar / jarFor1Class;
        int allWhite = allClass * whiteJarFor1Class;
        int allBrown = allClass * brownJarFor1Class;
        System.out.println("В школе, где " + jarFor1Class + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");
        // Задача 6
        byte weight1Banan = 80;
        int allBanans = 5 * weight1Banan;
        byte weight100Milk = 105;
        int allMilk = 2 * weight100Milk;
        byte weightIceCream = 100;
        int allIceCream = weightIceCream * 2;
        byte egg = 70;
        int allEggs = egg * 4;
        int cocktail = allEggs + allIceCream + allMilk + allBanans;
        int grPerKg = 1000;
        float cocktailInKg = cocktail / (float)grPerKg;
        System.out.println("Вес завтрака " + cocktail + " или " + cocktailInKg + " кг");
        // Задача 7
        int weight1 = 250;
        int weight2 = 500;
        int allweight = 7000;
        int diet1 = allweight / weight1;
        int diet2 = allweight / weight2;
        System.out.println("Если спортсмен будет терять каждый день по " + weight1 + " грамм, на похудение уйдет " + diet1 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по " + weight2 + " грамм, на похудение уйдет " + diet2 + " дней");
        // Задача 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double mashaUp = masha + masha * 0.1;
        double denisUp = denis + denis * 0.1;
        double kristinaUp = kristina + kristina * 0.1;
        double dohodMasha = mashaUp - masha;
        double dohodDenis = denisUp - denis;
        double dohodKristina = kristinaUp - kristina;
        System.out.println("Маша теперь получает " + mashaUp + " рублей. Годовой доход вырос на " + dohodMasha + " рублей");
        System.out.println("Денис теперь получает " + denisUp + " рублей. Годовой доход вырос на " + dohodDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristinaUp + " рублей. Годовой доход вырос на " + dohodKristina + " рублей");


    }
}