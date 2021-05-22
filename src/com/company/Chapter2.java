package com.company;

public class Chapter2 {
    //В этом классе мы будем последовательно вызывать все методы, описанные далее
    public static void main(String[] args) {

        //1) Расчет числа кубических дюймов в кубе объемом в 1 куб. милю
        Inches();

        //2) Определение длины гипотенузы исходя из длины катетов, по теореме Пифагора
        Hypot();

        //3) С символьными переменными можно обращаться как с целочисленными
        CharArithDemo();

        //4) Демонстрация использования логических значений
        BoolDemo();

        //5) Демонстрация управляющих последовательностей в символьных строках
        StrDemo();

        //6) Демонстрация динамической инициализации
        DynInt();

        //7) Демонстрация области действия блока кода
        ScopeDemo();

        //8) Демонстрация времени жизни переменной
        VarInitDemo();

        //9) Демонстрация использования оператора %
        ModDemo();

        //10) Демонстрация использования операторов сравнения и логических операторов
        RelLogOps();

        //11) Демонстрация использования укороченных логических операторов
        SCops();

        //12) Демонстрация роли побочных эффектов
        SideEffects();

        //13) Демонстрация автоматического преобразования типа long в тип double
        LtoD();

        //14) Демонстрация приведения типов
        CastDemo();

        //15) Применение оператора break в качестве цивилизованной формы оператора goto
        Break();

        //16) Применение оператора break для выхода из вложенных циклов
        BreakLoop4();
    }

    private static void Inches() {
        System.out.println("");
        long ci;
        long im;
        im = 5280*12;
        ci = im * im * im;
   System.out.println("В одной кубической миле содержится " + ci + " кубических дюймов.");
    }

    private static void Hypot() {
        System.out.println("");
        double x, y, z;
        x = 3;
        y = 4;
        z = Math.sqrt(x*x + y*y);
        System.out.println("Длинна гипотенузы: " + z);
    }

    private static void CharArithDemo() {
        System.out.println("");
        char ch;
        ch = 'X';
        System.out.println("ch содержит " + ch);

        ch++; //Инкрементировать переменную ch
        System.out.println("теперь ch содержит " + ch);

        ch = 90; //Присвоим переменной ch значение Z
        System.out.println("теперь ch содержит "  + ch);

    }

    private static void BoolDemo() {
        System.out.println("");
        boolean b;
        b = false;
        System.out.println("Значение b: " + b);

        b = true;
        System.out.println("Значение b: " + b);

        //Логическое значение можно использовать для управления условной конструкцией IF
        if (b) System.out.println("Эта инструкция выполняется");

        b = false;
        if (b) System.out.println("Эта инструкция не выполняется");

        //В результате сравнения получается логическое значение
        System.out.println("Результат сравнения 10 > 9: " + (10 > 9));
    }

    private static void StrDemo() {
        System.out.println("");
        System.out.println("Первая строка\nВторая строка");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");
    }

    private static void DynInt() {
        System.out.println("");
        double radius = 4, height = 5;
        double volume = 3.1416 * radius * height;
        System.out.println("Объем: " + volume);
    }

    private static void ScopeDemo() {
        System.out.println("");
        int x; //Эта переменная доступна для всего кода в методе ScopeDemo
        x = 10;
        if (x == 10) { //Начало новой области действия

            int y = 20; //Эта переменная доступна только в данном блоке кода
            //Обе переменные доступны в данном блоке кода
            System.out.println("X и Y: " + x + " " + y);
            x = y * 2;
        }
        //y = 100; //Ошибка, в этом месте переменная у не доступна
        //а переменная х по прежнему доступна
        System.out.println("x - это " + x);

    }

    private static void VarInitDemo() {
        System.out.println("");
        int x;
        for(x=0; x<3; x++){
            int y = -1;
            System.out.println("y: " + y);
            y = 100;
            System.out.println("Измененное значение у: " + y);
        }
    }

    private static void ModDemo() {
        System.out.println("");
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("Результат остатка от деления 10 / 3: " + iresult + " " + irem);
        System.out.println("Результат остатка от деления 10.0 / 3.0: " + dresult + " " + drem);

    }

    private static void RelLogOps() {
        System.out.println("");
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;

        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("Это не будет выполнено!");
        if(i >= j) System.out.println("Это не будет выполнено!");
        if(i > j) System.out.println("Это не будет выполнено!");

        b1 = true;
        b2 = false;

        if(b1 & b2) System.out.println("Это не будет выполнено!");
        if(!(b1 & b2)) System.out.println("!(b1 & b2): true");
        if(b1 | b2) System.out.println("(b1 | b2): true");
        if(b1 ^ b2) System.out.println("(b1 ^ b2): true");

    }

    private static void SCops() {
        int n, d, q;
        n = 10;
        d = 2;
        if(d != 0 && (n % d) == 0) System.out.println(d + " является делитетем " + n);

        d = 0;
        //Второй операнд не вычисляется, поскольку значение переменной d равно нулю
        if(d != 0 && (n % d) == 0) System.out.println(d + " является делитетем " + n);//Укороченная операция предотвращает деление на ноль

        //А теперь те же самые действия выполняются без использования укороченного логического оператора. В результате возникает ошибка деления на ноль
        //if (d != 0 & (n % d) == 0) System.out.println(d + " является делитетем " + n);//Теперь вычисляюся оба выражения, в результате чего будет деление на нуль.
    }

    private static void SideEffects() {
        int i;
        i = 0;

        //Значение переменной i инкрементируется несмотря на то, что проверяемое условие в инструкции if ложно
        if (false & (++i < 100)) System.out.println("Эта строка не будет отображаться!");
        System.out.println("Инструкция if выполняется: " + i);
        //отображается 1

        //В данном случае значение переменной i не инкрементируется, поскольку второй операнд укороченного логического оператора не вычисляется,
        //а следовательно, инкремент пропускается
        if (false && (++i < 100)) System.out.println("Эта строка не будет отображаться");
        System.out.println("Инструкция if выполняется: " + i);
        //по прежнему  отображается 1!
    }

    private static void LtoD() {
        long L;
        double D;

        L = 100123285L;
        D = L;
        System.out.println("L и D: " + L +" " + D);
    }

    private static void CastDemo() {
        System.out.println("");
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); //Привести тип double к типу int, в данном случае теряется дробная часть числа
        System.out.println("Целочисленный результат деления x / y: " + i);

        i = 100;
        b = (byte) i; //а в этом случае информация не теряется, тип byte может содержать значение 100.
        System.out.println("Значение b: " + b);

        i = 257;
        b = (byte) i; //на этот раз информация теряется, тип byte не может содержать значение 257
        System.out.println("Значение b: " + b);

        b = 88; //Представление символа Х в коде ASCII
        ch = (char) b; //Явное приведение несовместимых типов
        System.out.println("ch: " + ch);

    }

    private static void Break() {
        System.out.println("");
        boolean t = true;

        first: {
            second: {
            third: {
                System.out.println("Предшествует оператору break.");
                if (t) break second;
                System.out.println("Этот оператор не будет выполняться.");
            }
                System.out.println("Этот оператор не будет выполняться.");
            }
            System.out.println("Этот оператор следует за блоком Second.");
        }
    }

    private static void BreakLoop4() {
        System.out.println("");
        outer: for( int i=0; i<3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j=0; j<100; j++) {
                if(j == 10) break outer; //Выход из обоих циклов
                System.out.print(j + " ");
            }
            System.out.println("Эта строка не будет выводится!");
        }
        System.out.println("Циклы завершены!");
    }


}

