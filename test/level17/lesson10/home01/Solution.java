package com.javarush.test.level17.lesson10.home01;

/* Общий список
1. Изменить класс Solution так, чтобы он стал списком. (Необходимо реализовать интерфейс java.util.List).
2. Список Solution должен работать только с целыми числами Long.
3. Воспользуйтесь полем original.
4. Список будет использоваться нитями, поэтому позаботьтесь, чтобы все методы были синхронизированы.
*/

//public class Solution<Long> implements List<Long>{
//    private ArrayList<Long> original = new ArrayList<Long>();
//
//    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.isEmpty();
//    }
//
//
//    @Override
//    public synchronized int size() {
//        return original.size();
//    }
//
//    @Override
//    public synchronized boolean isEmpty() {
//        return original.isEmpty();
//    }
//
//    @Override
//    public boolean contains(Object o) {
//        return original.contains(o);
//    }
//
//    @Override
//    public synchronized Iterator<Long> iterator() {
//        return original.iterator();
//    }
//
//    @Override
//    public Object[] toArray()
//    {
//        return new Object[0];
//    }
//
//    @Override
//    public <T> T[] toArray(T[] a)
//    {
//        return null;
//    }
//
//    @Override
//    public boolean remove(Object o)
//    {
//        return false;
//    }
//
//    @Override
//    public boolean containsAll(Collection<?> c)
//    {
//        return false;
//    }
//
//    @Override
//    public boolean removeAll(Collection<?> c)
//    {
//        return false;
//    }
//
//    @Override
//    public boolean retainAll(Collection<?> c)
//    {
//        return false;
//    }
//
//    @Override
//    public void clear()
//    {
//
//    }
//
//    @Override
//    public java.lang.Long get(int index)
//    {
//        return null;
//    }
//
//    @Override
//    public java.lang.Long remove(int index)
//    {
//        return null;
//    }
//
//    @Override
//    public int indexOf(Object o)
//    {
//        return 0;
//    }
//
//    @Override
//    public int lastIndexOf(Object o)
//    {
//        return 0;
//    }
//
//    @Override
//    public ListIterator<java.lang.Long> listIterator()
//    {
//        return null;
//    }
//
//    @Override
//    public ListIterator<java.lang.Long> listIterator(int index)
//    {
//        return null;
//    }
//
//    @Override
//    public List<java.lang.Long> subList(int fromIndex, int toIndex)
//    {
//        return null;
//    }
//
//    @Override
//    public void add(int index, java.lang.Long element)
//    {
//
//    }
//
//    @Override
//    public java.lang.Long set(int index, java.lang.Long element)
//    {
//        return null;
//    }
//
//    @Override
//    public boolean addAll(int index, Collection<? extends java.lang.Long> c)
//    {
//        return false;
//    }
//
//    @Override
//    public boolean addAll(Collection<? extends java.lang.Long> c)
//    {
//        return false;
//    }
//
//    @Override
//    public synchronized boolean add(Long a) {
//        return original.add(a);
//    }
//}
