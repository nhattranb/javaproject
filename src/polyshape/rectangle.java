package polyshape;

public class rectangle {
    private int length;
    private int width;

    @Override
    public String toString() {
        return "rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
