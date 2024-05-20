public class DynamicArray {
    import java.util.Arrays;

public class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;
    private int resizeFactor;

    public DynamicArray(int initialCapacity, int resizeFactor) {
        if (initialCapacity <= 0) throw new IllegalArgumentException("Initial capacity must be greater than 0");
        if (resizeFactor <= 1) throw new IllegalArgumentException("Resize factor must be greater than 1");

        this.capacity = initialCapacity;
        this.resizeFactor = resizeFactor;
        this.arr = new int[initialCapacity];
        this.size = 0;
    }

    // Inserts an element at the specified index
    public void insert(int index, int element) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Index out of bounds");
        if (size == capacity) resize();
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        size++;
    }

    // Deletes the element at the specified index
    public void delete(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index out of bounds");
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    // Returns the size of the dynamic array
    public int size() {
        return size;
    }

    // Returns true if the dynamic array is empty, false otherwise
    public boolean isEmpty() {
        return size == 0;
    }

    // Rotates the dynamic array by k positions to the right
    public void rotate(int k) {
        if (size == 0) return;
        k = k % size;
        reverse(0, size - 1);
        reverse(0, k - 1);
        reverse(k, size - 1);
    }

    // Reverses the dynamic array
    public void reverse() {
        reverse(0, size - 1);
    }

    private void reverse(int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Appends an element to the end of the dynamic array
    public void append(int element) {
        if (size == capacity) resize();
        arr[size++] = element;
    }

    // Prepends an element to the beginning of the dynamic array
    public void prepend(int element) {
        insert(0, element);
    }

    // Merges two dynamic arrays into a single dynamic array
    public void merge(DynamicArray other) {
        while (size + other.size > capacity) resize();
        for (int i = 0; i < other.size; i++) {
            arr[size++] = other.arr[i];
        }
    }

    // Interleaves two dynamic arrays into a single dynamic array
    public static DynamicArray interleave(DynamicArray a, DynamicArray b) {
        DynamicArray result = new DynamicArray(a.size + b.size, Math.max(a.resizeFactor, b.resizeFactor));
        int i = 0, j = 0;
        while (i < a.size || j < b.size) {
            if (i < a.size) result.append(a.arr[i++]);
            if (j < b.size) result.append(b.arr[j++]);
        }
        return result;
    }

    // Returns the middle element of the dynamic array
    public int middle() {
        if (size == 0) throw new IllegalStateException("Array is empty");
        return arr[size / 2];
    }

    // Returns the index of the first occurrence of the specified element in the dynamic array, or -1 if not found
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) return i;
        }
        return -1;
    }

    // Splits the dynamic array into two dynamic arrays at the specified index
    public DynamicArray[] split(int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Index out of bounds");

        DynamicArray first = new DynamicArray(index, resizeFactor);
        DynamicArray second = new DynamicArray(size - index, resizeFactor);

        for (int i = 0; i < index; i++) {
            first.append(arr[i]);
        }
        for (int i = index; i < size; i++) {
            second.append(arr[i]);
        }

        return new DynamicArray[]{first, second};
    }

    // Resizes the dynamic array based on the resize factor
    private void resize() {
        capacity *= resizeFactor;
        arr = Arrays.copyOf(arr, capacity);
    }

    // Displays the array contents
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray(5, 3);
        arr.append(1);
        arr.append(2);
        arr.append(3);
        arr.append(4);
        arr.append(5);
        arr.display();

        arr.prepend(0);
        arr.display();

        arr.insert(3, 10);
        arr.display();

        arr.delete(2);
        arr.display();

        System.out.println("Size: " + arr.size());
        System.out.println("Is empty: " + arr.isEmpty());

        arr.rotate(2);
        arr.display();

        arr.reverse();
        arr.display();

        DynamicArray arr2 = new DynamicArray(3, 2);
        arr2.append(6);
        arr2.append(7);
        arr2.append(8);
        arr.merge(arr2);
        arr.display();

        DynamicArray interleaved = DynamicArray.interleave(arr, arr2);
        interleaved.display();

        System.out.println("Middle element: " + arr.middle());

        System.out.println("Index of 10: " + arr.indexOf(10));

        DynamicArray[] splitArr = arr.split(5);
        splitArr[0].display();
        splitArr[1].display();
    }
}





}
