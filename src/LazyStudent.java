public class LazyStudent extends Student {
    public LazyStudent() {
    }

    @Override
    public void study() {
        System.out.println("Сегодня не учусь, мне лень.");
    }

    public static void main(String[] args) {
        LazyStudent lazyStudent = new LazyStudent();
        lazyStudent.study();
    }
}