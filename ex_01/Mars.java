 public class Mars {
        private static int nextId = 0;
        private int id;

        public Mars() {
            this.id = nextId;
            nextId++;
        }

        public int getId() {
            return id;
        }

        public static void main(String[] args) {
            Mars rocks = new Mars();
            Mars lite = new Mars();
            Mars snack = new Mars();
            System.out.println(rocks.getId());
            System.out.println(lite.getId());
            System.out.println(snack.getId());
        }
    }