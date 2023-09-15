# Шпаргалка

## Interface Comparable & Comparator 
**_Comparable_**
```java
class Employee implements java.lang.Comparable<Employee>{}
```  
у данного класса должен быть переопределен метод compareTo:
```
public int compareTo(Employee anotherEmp) {
      return this.id-anotherEmp.id;  //или
      return this.name.compareTo(anotherEmp.name);}
```
```java
Collections.sort(list); //сортировка с использованием интерфейса Comparable
```
**_Comparator_**  
Создает класс Comparator который имплиментирует Comparator и override метод compare()
интерфейс Comparator использует для сравнения НЕ естественный порядок.
```
class ComparatorId implements java.util.Comparator<Employee2> {
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        if (o1.id == o2.id) {
            return 0;
        } else if (o1.id < o2.id) {
            return -1;
        }
        return 1;
    }
}
class NameComparator implements java.util.Comparator<Employee2> {
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.name.compareTo(o2.name);
    }
}
```
```java
Collections.sort(list,new NameComparator()); //сортировка с использованием интерфейса Comparator
```
Можно(нужно) совместить Comparator и Comparable
```
class Employee implements java.lang.Comparable<Employee>{
...
        @Override
        public int compareTo(Employee2 anotherEmp) {
        return this.id-anotherEmp.id; //естественная сортировка по id
}
class SalaryComparator implements java.util.Comparator<Employee2> {
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.salary-o2.salary;
    }
}
...
Collections.sort(list);//естественная сортровка (в нашем случае по id)
Collections.sort(list,new SalaryComparator()); // сортировка будет происходить по salary
```
## Generics  
При использовании generics ошибки, связанные с некорректным использованием типов, теперь обнаруживаются на этапе компиляции.
Основные причины существования generics:
* Type Safe - это позволяет создавать коллекции только определенных типов и на уровне
компиляции позволяют нам находить ошибки
* Reusable Code - generics позволяют нам не создавать похожие классы, похожие методы (похожий код)

## Parameterized Class & Parameterized method
```
class Info<T>{ //T -Type place holder
    private T value; //переменная не может быть статична(Статичная переменная - это переменная для всех объектов одного и того же класса)
}
```
```
Info<String>info1 = new Info<>("privet"); // прописываем тип данных, который заменит T
```
```
class Pair<V1,V2>{}
...
Pair<Double,Character> pair2 = new Pair<>(15.5,'a');
Pair<String,Integer> pair1 = new Pair<>("asd",15);
```
Parameterized method - это методы у которых в параметрах есть generics
```
class GetMethod{
    public static <T> T getSecondElement(ArrayList<T>a1){
        return a1.get(1);
    }
}

class GetMethod{
    public static <T extends Number> T getSecondElement(ArrayList<T>a1){
        return a1.get(1);
    }
}
```
Информацию о generics знает только компилятор для необходимых ему проверок. 
JVM не видит типы.

### WildCard
```
List<?> list = new ArrayList<Integer>();//List wildCard явзяется супертипом для любого листа/ Вместо ? может применяться любой тип
```
Кодга используем WildCard не можем применять методы, которые могут изменить наш лист
Мы можем ставить границы wildCard
```
List<?extends Number> list30 = new ArrayList<Integer>();
 List<?super Number> list31 = new ArrayList<>();//bounded wildcard
```

## Коллекции
иерархия коллекций:
interface Iterable -> interface Collection (совокупность объектов, которые мы храним вместе)  
interface Collection
* Interface List
* Interface Queue
* Interface Set
Interface Map (не происходит от Interface Collection)  
Все коллекции работают с generics.  

### List
List - упорядоченная последовательность элементов, позволяющая хранить дубликаты и null. Каждый элемент имеет индекс.
#### ArrayList 
ArrayList - массив, который может изменять свой размер. Использовать ArrayList тогда, когда не известна длина должна быть у структуры, похожей
на структуру массива. В основе ArrayList лежит массив Object
Способы создания ArrayList:
```
ArrayList<DataType>list = new ArrayList<DataType>();
ArrayList<DataType>list = new ArrayList<DataType>(30); //30 - Initial Capacity
ArrayList<DataType>list = new ArrayList<DataType>(list); // 
```
___Методы ArrayList___
* ***add(DataType element)->boolean***
* 
Если при добавлении элемента, проверка показывает что места в массиве нет. Соответственно создается новый массив и вызывается System.arraycopy().
Если места в массиве не достаточно, новая емкость рассчитывается по формуле (oldCapacity * 3) / 2 + 1. 

— Быстрый доступ к элементам по индексу за время O(1);  
— Доступ к элементам по значению за линейное время O(n);  
— Медленный, когда вставляются и удаляются элементы из «середины» списка;  
— Позволяет хранить любые значения в том числе и null;  
— Не синхронизирован.  

