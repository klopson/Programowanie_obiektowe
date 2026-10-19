public class Counter {
    int value;


    public Counter(int value)
    {
        this.value = value;
    }

    public void increaseOther(Counter other) {
        if (other != null){
            other.value++;
        }

    }
}
