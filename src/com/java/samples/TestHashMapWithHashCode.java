package com.java.samples;

import java.util.HashMap;
import java.util.Map;

public class TestHashMapWithHashCode {
    static Map<TestObject, String> testMap = new HashMap<TestObject, String>();

    public static void main(String[] args) {
        TestObject testObject11 = new TestObject(11, "testObject11");
        TestObject testObject12 = new TestObject(12, "testObject12");
        TestObject testObject21 = new TestObject(21, "testObject21");
        TestObject testObject31 = new TestObject(31, "testObject31");
        TestObject testObject41 = new TestObject(41, "testObject41");
        testMap.put(testObject11, "name11");
        testMap.put(testObject12, "name12");
        testMap.put(testObject21, "name21");
        testMap.put(testObject31, "name31");
        testMap.put(testObject41, "name41");

        System.out.println(testMap.size());


        System.out.println(testMap.get(new TestObject(11, "testObject11")));
        System.out.println(testMap.get(new TestObject(12, "testObject12")));
        System.out.println(testMap.get(new TestObject(21, "testObject21")));
        System.out.println(testMap.get(new TestObject(31, "testObject31")));
        System.out.println(testMap.get(new TestObject(41, "testObject41")));


    }

}

class TestObject {
    int id;
    String name;

    public TestObject(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    @Override
    public int hashCode() {
        if(name.contains("testObject1"))
        {
            return 1;
        }
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TestObject other = (TestObject) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}

