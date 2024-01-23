public class LazyStudentt {
        public static void main(String[] args) {
            Student student = new Student();
            LazyStudent lazyStudent = new LazyStudent();

            student.study();
            lazyStudent.study();
        }
    }

    class Student {
        protected final String studying;

        protected Student(String work) {
            this.studying = work;
        }

        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }

        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }

    class LazyStudent extends Student {
        public LazyStudent() {
            super("Сегодня не учусь, мне лень.");
        }

        @Override
        public void study() {
            System.out.println("Сегодня не учусь, мне лень.");
        }
    }
