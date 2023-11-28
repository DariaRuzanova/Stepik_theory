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
на структуру массива. Не синхронизирован. В основе ArrayList лежит массив Object
Способы создания ArrayList:
```
ArrayList<DataType>list = new ArrayList<DataType>();
ArrayList<DataType>list = new ArrayList<DataType>(30); //30 - Initial Capacity
ArrayList<DataType>list = new ArrayList<DataType>(list); // 
```
___Методы ArrayList___
* ***add(DataType element)->boolean***
* ***add(int index, DataType element)->boolean*** 
* ***get(int index)->DataType***
* ***set(int index DataType element)->DataType***
* ***remove(int index)->DataType***
* ***remove(Object element)->boolean***
* ***addAll(ArrayList al)->boolean***
* ***addAll(int index, ArrayList al)->boolean***
* ***indexOf(Object element)->int***
* ***lastIndexOf(Object element)->int***
* ***clear()->void***
* ***size()->int***
* ***isEmpty()->boolean***
* ***contains(Object element)->boolean***
* ***toString()->String***
* ***Arrays.asList(DataType[])-> List<DataType>*** - метод получения List из массива. Длина этого листа 
будет равна длине массива и измениться не может. Если мы попытаемся изменить элемент массива,
то это так же отразится на элементе листа.
* ***removeAll(Collection<?> c)->boolean***
* ***retainAll(Collection<?> c)->boolean*** - оставит в нашем ArrayList те элементы, которые есть в ArrayList из параметра
* ***containsAll(Collection<?> c)->boolean*** - проверяет, содержит ли наш arrayList все элементы, которые есть из ArrayList параметра
* ***subList(int fromIndex, int toIndex)->List<E>*** - создает из нашего листа отрывок и выводит новый List. второй параетр не включен/ он не существует по отдельности от al1, это сущность al1 (view)
* ***toArray()->Object []*** - получени массива из ArrayList
* ***List.of(E...elements)->List<E>*** - добавлять элементны в лист, созданный с помощью List.of нельзя. Не может содержать null
* ***List.copyOf(Collection<E>c)->List<E>*** - этот лист так же нельзя изменять и не содержит null

Если при добавлении элемента, проверка показывает что места в массиве нет. Соответственно создается новый массив и вызывается System.arraycopy().
Если места в массиве не достаточно, новая емкость рассчитывается по формуле (oldCapacity * 3) / 2 + 1. 

При удалении элемента, получении индекса по элементу, проверка содержится ли 
элемент в ArrayList необходимо правильно переопределить метод equals  

— Быстрый доступ к элементам по индексу за время O(1);  
— Доступ к элементам по значению за линейное время O(n);  
— Медленный, когда вставляются и удаляются элементы из «середины» списка;  
— Позволяет хранить любые значения в том числе и null;  
— Не синхронизирован.  

#### Iterator
Iterator – это интерфейс, принадлежащий платформе коллекции. Позволяет просматривать коллекцию, получать доступ к элементу данных и удаляет элементы данных коллекции.
С помощью итератора мы сможем пробежаться по элементам ArrayList и вывести их на экран.
```
Iterator<DataType>iterator = aL.iterator();
while(iterator.hasNext()){
System.out.println(iterator.next());}
```

#### LinkedList
Элементы LinkedList - это звенья одной цепочки. Не синхронизирован
Эти элементы хранят определенные данные, а также ссылки на предыдущий и следующий элементы
Doubly LinkedList и Singly LinkedList (ссылка на последующий элемент)  
Для поиска элемента лучше использовать ArrayList.  
LinkedList обычно используют когда невелико количество получения элементов, а велико количество операций добавления
и удаления элементов. Особенно если речь идет о начале коллекции.

#### ListIterator
```
ListIterator<DataType>listIterator = aL.listIterator();
while(listIterator.hasNext()){
System.out.println(listIterator.next());}

while(listIteratoe.hasPrevious()){
System.out.println(listIterator.previous());}
```
#### Collections/ метод BinarySearch
Работает в отсортированном массиве. При поиске используется деление массива пополам -> идет сравнение со средним элементом
след половина делится пополам
```
Collections.sort(arrayList);
Collections.binarySearch(arrayList,key)

Arrays.binarySearch(arrays,key);
```
О(1) - алгоритм выполняется за постоянное время
О(n) - количество операций линейно завист от количества элементов
O(logn) - быстрее чем O(n), например бинарный поиск

### MAP
Элементами Map являются пара: ключ, значения.
#### HashMap
В основе HashMap лежит массив. Элементами данного массива является структуры
LinkedKist. Данные структуры и заполняются элементами, которые мы добавляем в HashMap/
Элементами являются пары ключ/значение. HashMap не запоминает порядок добавления элементов. Его методы работают очень быстро.
Используют когда нужно очень быстро получаь значения по ключу. Ключи элементов
должны быть уникальными. Ключи и значения могут быть null.
```
Map<Integer,String> map1 = new HashMap<>();
```
___Методы HashMap___
* ***put***
* ***putIfAbsent***
* ***get*** - получить значение по ключу
* ***remove***
* ***containsValue*** - будет возвращать true если в hashMap содержится значение
* ***containsKey***
* ***keySet*** - возвращает множество всех ключей, которые есть в hashMap
* ***values*** - возвращает множество значений
* ***entrySet***  

При сравнении объектов в HashMap необходимо правильно переопределять методы ***equals()***
и ***hashCode()***. Хэширование - преобразование любого объекта к int. Сравнение в HashMap
сначала идет по ***hashCode()*** а потом по ***equals()***. При переопределении HashCode()
необходимо добиваться минимизации коллизии. Результат нескольких выполнений метода hashcode для одного
 и того же объекта должен быть одинаковым.  
Если согласно методу equals() два объекта равны, то и hahsCode данных объектов обязательно должен быть одинаков.
Если соглавно методу equals() два объекта не равны,то hahsCode данных объектов ***НЕ*** обязательно должен быть одинаков.
entrySet возвращает множество entry. Entry - это интерфейс,внутренний для map, который имплементируется
классом Node, внутрееним для map. Класс Node содержит ключ, значение, hash ключа и ссылку на след ующий
элемент. Поэтому с помощью entry мы можем добраться и до ключа и до значения.
```
for(Map.Entry<Student2,Double> entry: map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
```
При создании HashMap мы модем задать 2 параметра, которые влияют на производительность:
* Initial capacity - начальный размер массива
* Load factor - коэффициет того, на сколько массив должен быть заполне, после чего, его
размер будет увеличен вдвое.  
Объект, стоящий на месте ключа должен быть неизменяемым.
HashMap - это коллекция которая non-synchronized, для работы с многопоточностью используется 
ConcurrentHashMap.
#### TreeMap
Элементами TreeMap являются пары ключ/значение. В TreeMap элементы хранятся в отсортированном по
возрастанию порядке.
В основе TreeMap лежит красно-черное дерево. Это позволяет методам работать быстро, но не быстрее
чем HashMap.
Основная цель использования TreeMap - это нахождение отрезков.
```
TreeMap<Double, Student2> treeMap = new TreeMap<>();
```
___Методы TreeMap___
* ***put***
* ***get***
* ***remove***
* ***descendingMap()*** - с помощью этого метода можем развернуть treeMap в обратную сторону
* ***tailMap(key)*** - найти значения, у которых ключи выше заданного значения
* ***headMap(key)*** - найти значения, у которых ключи ниже заданного значения
* ***lastEntry()*** - выводит элемент treeMap, который нвходится в самом конце
* ***firstEntry()*** - выводит элемент treeMap, который нвходится в самом начале  

```
TreeMap<Student2, Double> treeMap3 = new TreeMap<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.compareTo(o2);
            }
        });
```
Красно-черное дерево - дерево, у каждого элемента которого не более 2-х потомков, правый элемент которого больше 
больше левого. Красно-черное дерево самобалансирующееся(оно будет перегруппировываться чтобы быть равномерным)
с помощью таких деревьев методы containsKey, put... обрабатываются за О(logn) здесь идет бинарный поиск  

#### LinkedHashMap
Является наследником HashMap.Хранит информацию о порядке добавления элементов или порядке
их использования.Производительность методов немного ниже, чем у HashMap.
```
LinkedHashMap<Double, Student2> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
```
capacity = 16
loadFactor = 0.75f
accessOrder: true - порядок будет меняться в зависимости от того, какие элементы были использованы

### Set
Это коллекция уникальных элементов. Методы данной коллекции очень быстрые. В основе любого Set 
лежит Map, в качестве значений которого лежит заглушка-константа.
#### HashSet
Не запоминает порядок добавления элементов. В основе HashSet лежит HashMap. Модет соделжать значения null.  
```
HashSet<Integer>set=new HashSet<>();
```
___Методы HashSet___
* ***add***
* ***remove***
* ***size***
* ***isEmpty***
* ***contains***
* ***addAll*** - объединение множеств
* ***retainAll*** - оставляет только пересечение множеств
* ***removeAll*** - удаляет из первого hashSet все элементы второго hashSet
#### TreeSet
Хранит элементы в отсортированном по возрастанию порядке. В основе TreeSet лежит TreeMap.
У элементов данного TreeMap ключи - это элементы TreeSet, значения - это константы-заглушки.
В основе лежит красно-черное дерево. Не можем хранить null.  
```
Set<Student> studentSet = new TreeSet<>();
```
___Методы TreeSet___
* ***first***
* ***last***
* ***headSet***
