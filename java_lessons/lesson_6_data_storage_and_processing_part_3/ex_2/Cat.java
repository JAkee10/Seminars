package java_lessons.lesson_6_data_storage_and_processing_part_3.ex_2;


public class Cat {
    String name;
    int age;
    String kind;
    String ownerName;
    

    @Override
    public String toString() {
        return String.format("name: %s, age: %d, kind: %s, ownerName: %s", name, age, kind, ownerName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj; //Приведение типов(cast). Представляем obj как тип класса Cat, вместо типа класса Object
            return name.equals(cat.name) 
                && age == cat.age 
                && kind.equals(cat.kind) 
                && ownerName.equals(cat.ownerName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7*age + 11*kind.hashCode() + 17*ownerName.hashCode();
    }
}
