public class LazyStudent {
    public static void main(String[] args) {
        LazyStudent lazyStudent = new LazyStudent();
        lazyStudent.study();
    }
    private String name;
    private String description;

    public LazyStudent() {
        this.name = "LazyStudent";
        this.description = "Сегодня не учусь, мне лень.";
    }

    public void study() {
        System.out.println("Сегодня не учусь, мне лень.");
    }
}