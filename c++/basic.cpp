struct myBag {
    int sum;

    // Constructor to initialize sum
    myBag() {
        sum = 0;
    }

    // Method to insert an integer into the bag
    void insert(int x) {
        sum += x;
    }

    // Method to return the current sum
    int maxx() {
        return sum;
    }
};


int main () {
    return 0;
}