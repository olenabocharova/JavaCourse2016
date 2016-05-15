# JavaEPAMSpring2016
<pre>Java EPAM Spring 2016

Задание 

Part1
Написать класс, который реализует функциональность вывода в консоль строки "Hello, World". 
Написать командный файл (bat файл Windows или shell скрипт Linux), 
который компилирует и запускает данное приложение из консоли. Командный файл сохранить в каталоге src Eclipse-проекта.

Part2
Написать класс, который реализует функциональность сложения двух чисел, 
переданных в приложение как параметры командной строки.

Part3
Написать класс, который реализует функциональность определения наибольшего 
общего делителя двух целых положительных чисел, переданных в приложение как параметры командной строки.

Part4
Написать класс, который реализует функциональность определения суммы цифры 
целого положительного числа, переданного в приложение как параметр командной строки.

Part5
Как правило колонки электронных таблиц (например, Excel) имеют буквенную нумерацию в виде больших букв латинского алфавита
(последовательно, слева направо): A, B, ..., Y, Z, AA, AB, ..., AY, AZ, BA, BB, ... и т.д. 
В то же время каждая колонка имеет порядковый номер: A - 1; B - 2; ... ; Y - 25; Z - 26; AA - 27; AB - 28; ... и т.д. 
Написать класс, который содержит следующие три метода
(названия не обязательно должны быть такими, какими они приведены ниже):

    метод определения порядкового номера колонки по ее буквенному номеру
    [ public static int chars2digits(String number): A => 1; B => 2; ...; Z => 26; AA => 27; AB => 28; ... ];
    метод определения буквенного номера колонки по ее порядковому номеру
     [ public static String digits2chars(int number): 1 => A; 2 => B; ...; 26 => Z; 27 ==> AA; 28 ==> AB; ... ];
    метод определения по буквенному номеру колонки номер колонки, которая находится справа от данной
     [ public static String rightColumn(String number): A => B; B => C; ...; Y => Z; Z => AA; AA => AB; ...].
     
Работу методов проверить на следующих данных
A ==> 1 ==> A
B ==> 2 ==> B
Z ==> 26 ==> Z
AA ==> 27 ==> AA
AZ ==> 52 ==> AZ
BA ==> 53 ==> BA
ZZ ==> 702 ==> ZZ
AAA ==> 703 ==> AAA

Замечания
    Результат должен быть представлен в виде проекта с именем Practice1.
    Корневой пакет для всех классов и прочих пакетов (если они потребуются): ua.nure.your_last_name.Practice1, где
    your_last_name - ваш логин без кода проекта. Если логин=ivanovjti, то your_last_name=ivanov.
    Дополнительно в корневой пакет положить класс Demo, который демонстриует работу всех 5 подзадач.
    Проект загрузить в репозиторий, проверить, что собрался в Jenkins, оптимизировать метрики в Sonar.

Пример
Пример класса Demo
package ua.nure.your_last_name.Practice1;
 
public class Demo {
    public static void main(String[] args) {
        Hello.main(new String[] {});
        Sum.main(new String[] {"2", "3"});
        // ...
        Spreadsheet.main(new String[] {});
    }
}
</pre>

