/* 
Чужой код, незнакомый
Исправь наследование в классах: (классы Cat, Dog, Pet, House, Airplane).


Требования:
1. Класс Pet не должен быть унаследован от наших классов.
2. Класс Cat должен быть унаследован от класса Pet.
3. Класс Dog должен быть унаследован от класса Pet.
4. Класс House не должен быть унаследован от наших классов.
5. Класс Airplane не должен быть унаследован от наших классов.


public class Solution {
    public static void main(String[] args) {
    }

    public class Pet extends House {

    }

    public class Cat extends Airplane {

    }

    public class Dog extends Cat {

    }

    public class House extends Dog {

    }

    public class Airplane {

    }

}

 */

public class Solution {
    public static void main(String[] args) {
    }

    public class Pet {

    }

    public class Cat extends Pet {

    }

    public class Dog extends Pet {

    }

    public class House {

    }

    public class Airplane {

    }
}