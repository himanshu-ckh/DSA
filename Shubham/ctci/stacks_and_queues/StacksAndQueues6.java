package ctci.stacks_and_queues;

import java.util.LinkedList;

public class StacksAndQueues6 {
    public static class Animal {
        String name;
        int order;
        // type is 1 for dog and 2 for cat
        int type;

        public Animal(String name, int type) {
            this.name = name;
            this.type = type;
        }
    }

    int order = -1;
    LinkedList<Animal> dogs = new LinkedList<>();
    LinkedList<Animal> cats = new LinkedList<>();

    public void enqueue(Animal animal) {
        order++;
        if (animal.type == 1) {
            animal.order = order;
            dogs.addLast(animal);
        } else {
            animal.order = order;
            cats.addLast(animal);
        }
    }

    public Animal dequeueDog() {
        return dogs.poll();
    }

    public Animal dequeueCat() {
        return cats.poll();
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty()) {
            return cats.poll();
        }
        if (cats.isEmpty()) {
            return dogs.poll();
        }

        Animal dog = dogs.peek();
        Animal cat = cats.peek();

        if (dog.order < cat.order) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }
}
