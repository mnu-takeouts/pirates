package Parates;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Danila on 18.02.2017.
 */
public class PiratesList implements List<Pirate> {
    Pirate[] pirates = new Pirate[100];
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Pirate> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Pirate pirate) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Pirate> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Pirate> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        System.out.println("cleared1");
    }

    @Override
    public Pirate get(int index) {
        return null;
    }

    @Override
    public Pirate set(int index, Pirate element) {
        return null;
    }

    @Override
    public void add(int index, Pirate element) {

    }

    @Override
    public Pirate remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Pirate> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Pirate> listIterator(int index) {
        return null;
    }

    @Override
    public List<Pirate> subList(int fromIndex, int toIndex) {
        return null;
    }
}
