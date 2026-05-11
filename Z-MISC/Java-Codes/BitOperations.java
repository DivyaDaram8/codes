class BitOperations {
    public static void main(String[] args) {
        System.out.println(getIthBit(4, 1));
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        return (n & bitMask) >> i;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        int bitMask = ~(1 << i);
        n = n & bitMask;
        int bit = newBit << i;
        return n | bit;
    }

    public static int clearLastIBits(int n, int i) {
        int bitMask = (-1 << i);
        return n & bitMask;
    }

    public static int clearRangeItoJ(int n, int i, int j) {
        int a = ~0 << (j + 1);
        int b = (1 << i) - 1;
        int mask = a | b;
        return n & mask;
    }
}