
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EXCALIBUR
 */
public class MyArrayList<T> {
    private static final int INITIAL_CAPACITY = 5;
    private Object[] array;
    private int size;

    public MyArrayList() {
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == array.length) {
            // Dizi boyutunu arttır
            int newCapacity = array.length * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = element;
    }

   



public void addAll(List<T> elements) {
        for (T element : elements) {
            add(element);
        }
    }


public boolean contains(T element) {
    for (int i = 0; i < size; i++) {
        if (array[i].equals(element)) {
            return true;
        }
    }
    return false;
}

}