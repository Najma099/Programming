public class arraylist {
    public static class ArrayListImpl {
        static int[] arr = new int[6]; 
        static int size = 0; 

        public void add(int ele) { 
            arr[size] = ele;
            size++;
        }
        

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < size; i++) {
                sb.append(arr[i]);
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        ArrayListImpl arr = new ArrayListImpl();
        arr.add(2);
        arr.add(7);
        System.out.println(arr);
    }
}
