package StudyProject.test;

import java.util.*;

public class lambdaDemo {
    public static void main(String[] args) {




        Comparator com = (Object o1,Object o2) ->{
            return 1;
        };
        com.compare(1,2);
        //快捷键：Ctrl+d 复制一行代码
        //      Ctrl+X 删除一行代码
        //      Ctrl+shift+空格  智能补全
        //      Ctrl+Alt+I 格式化代码
        //      Alt+上下箭头 行上下移动
        List<Object> list = new List<Object>() {
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
            public Iterator<Object> iterator() {
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
            public boolean add(Object o) {
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
            public boolean addAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<?> c) {
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

            }

            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public Object set(int index, Object element) {
                return null;
            }

            @Override
            public void add(int index, Object element) {

            }

            @Override
            public Object remove(int index) {
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
            public ListIterator<Object> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Object> listIterator(int index) {
                return null;
            }

            @Override
            public List<Object> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        list.forEach(System.out::println);//传入一个方法，forEach中遍历每一个元素都传入该方法，然后调用。

        Set<Integer> set = new HashSet<Integer>();

    }
}


