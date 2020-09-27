package test;

import main.SplayTree.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** Class SplayTreeTest **/
public class TestSplayTree
{
    public static SplayTree tree;
    public static List<String> list;

    @BeforeEach
    public void prepare() {
        tree = new SplayTree();
        list = new LinkedList<>();
    }

    @Test
    public void insertCorrect() {
        tree.insert(1);
        tree.insert(15);
        tree.insert(235);
        list.add("makeNode");//1
        list.add("moveRight");
        list.add("makeNode");
        list.add("rotateRight");//15
        list.add("moveRight");
        list.add("makeNode");
        list.add("rotateRight");//235
        assertEquals(list,tree.actLog);
    }

    @Test
    public void searchCorrect() {
        tree.insert(4);
        assertEquals(true,tree.search(4));
        assertEquals(false, tree.search(3));

    }

    @Test
    public void removeCorrect() {
        tree.insert(4);
        tree.insert(6);
        tree.insert(10);
        tree.remove(10);
        assertEquals(false, tree.search(10));

    }

    @Test
    public void countNodesCorrect() {
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        assertEquals(3,tree.countNodes());
    }

    @Test
    public void emptyCheckCorrect() {
        assertEquals(true, tree.isEmpty());
        tree.insert(1);
        assertEquals(false, tree.isEmpty());
    }

    @Test
    public void clearCorrect() {
        tree.insert(4);
        tree.clear();
        assertEquals(true, tree.isEmpty());
    }
}