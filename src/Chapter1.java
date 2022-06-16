public class Chapter1 {

    static public class Person{

        private final String name;
        private boolean isMarried;

        public Person(String name, boolean isMarried) {
            this.name = name;

        }

        public boolean isMarried() {
            return isMarried;
        }

        public void setMarried(boolean married) {
            isMarried = married;
        }


            public String getName() {
                return name;
            }
    }

    public static void main(String[] args) {
        Person person = new Person("bob",false );
    }
}
