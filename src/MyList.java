class MyList<T> {

    private int numberOfItems = 0;
    private int indexOfItem = 0;
    private int size;
    private int capacity = 10;
    private int initialCapacity = 10;
    T[] array = (T[]) new Object[this.capacity];

    public MyList() {
        this(10);
    }

    public MyList(int capacity) {

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    void add(T data) {
        array[indexOfItem] = data;
        indexOfItem++;
        setCapacity(this.capacity - 1);
        numberOfItems = 0;

        if (indexOfItem > capacity) {
            array = increaseSize();
        }
        if (capacity < 0) {
            capacity = initialCapacity * 2;
        }
    }

    T[] increaseSize() {
        T[] newArray = (T[]) new Object[initialCapacity * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    int size() {
        for (T item : array) {
            if (item != null) {
                numberOfItems++;
            }
        }
        return numberOfItems;
    }


}
