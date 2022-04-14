package sample;

public class Patient implements Comparable {
    String name=new String();
    String lastname=new String();
    String age=new String();

    Patient(String name, String lastname, String age){
    this.name=name;
    this.lastname=lastname;
    this.age=age;
    }

    @Override
    public String toString() {
        return
                "{"+"name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age='" + age+ "}\n";

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

