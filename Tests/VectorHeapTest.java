import org.junit.Assert;

import static org.junit.Assert.*;

public class VectorHeapTest {

    @org.junit.Test
    public void add() {
        VectorHeap<Integer> example = new VectorHeap<>();
        example.add(12);
        Assert.assertEquals((Integer) 12, example.getFirst());
    }

    @org.junit.Test
    public void remove(){
        VectorHeap<Integer> example = new VectorHeap<>();
        example.add(12);
        example.remove();
        Assert.assertEquals(true, example.isEmpty());

    }
}