class Student {
    private int marks;   // private variable

    public void setMarks(int m) {
        marks = m;
    }

    public int getMarks() {
        return marks;
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setMarks(90);
        System.out.println("Marks: " + s.getMarks());
    }
}
