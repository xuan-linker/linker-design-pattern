package com.xlccc.iterator;

/**
 * @author Linker
 * @date 2020/7/13 17:21
 * @Description:实现了Container接口的实体类，该类有实现了Iterator接口的内部类AnimalIterator
 */
public class AnimalsRepository implements Container {

    //Init Animal数据
    public String animals[] = {"Cat", "Dog", "Cow", "Snake", "Tiger"};

    @Override
    public Iterator getIterator() {
        return new animalsIterator();
    }

    private class animalsIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < animals.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return animals[index++];
            }
            return null;
        }
    }
}
