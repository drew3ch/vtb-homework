package lesson3.homework;

public class Employee {

        private String name;
        private String email;
        private int age;
        private String position;
        private Group group;

        public Employee(String name, String email, int age, String position, Group group) {
            this.name = name;
            this.email = email;
            this.age = age;
            this.position = position;
            this.group = group;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public int getAge() {
            return age;
        }

        public String getPosition() {
            return position;
        }

        public String getInfo() {
            return "Name: " + name +
                    "; Email: " + email +
                    "; Age: " + age +
                    "; Position: " + position +
                    "; Группа: " + group.getNameGroup();
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public Group getGroup() {
            return group;
        }

        public void setGroup(Group group) {
            this.group = group;
        }

        public static void main(String[] args) {

            Group group1 = new Group("Тестировщики");
            Employee emp1 = new Employee("Имя1", "email1@mail.ru", 25, "Тестировщик", group1);
            System.out.println(emp1.getInfo());

        }

}