package org.example.collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {//Queue - коллекция, хранящая последовательность элементов. Добавляется элемент в конец очереди, используется из начала очереди
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();//Класс LinkedList имплиментирует не только интерфейс List, но и интерфейс Deque
        queue.add("Zaur");
        queue.add("Masha");
        queue.add("Ivan");
        queue.add("Elena");
        System.out.println(queue);//В очереди не ограниченное количество элементов

        queue.offer("Oleg");//Если бы очередь была ограничена, то exception не выбросился,а при использовании add выбросился бы

        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println(queue.poll());//не выбрасывает exception если очередь пуста, а выводит null

        System.out.println(queue.element());//показывает кто в очереди встал на первое место, если в очереди никого нет, то выбросится исключение
        System.out.println(queue.peek());//показывает кто в очереди первый, если в очереди нет никого, то выводит null

    }
}
