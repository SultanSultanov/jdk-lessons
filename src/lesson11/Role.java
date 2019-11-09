package lesson11;

// перечисления
public enum Role {
    USER, ADMIN;
}

enum Operation {
    SUM {
        public int action(int a, int b) {
            return a + b;
        }
    },
    MULTI {
        public int action(int a, int b) {
            return a * b;
        }
    };

    public abstract int action(int a, int b);
}

enum Prioryty {
    HIGH(10), MIDDLE(5), LOW(1);
    private int code;

    Prioryty(int code) {
        this.code = code;

    }

    public int getCode() {
        return this.code;
    }
}