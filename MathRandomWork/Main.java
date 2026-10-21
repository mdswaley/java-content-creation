package MathRandomWork;

class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int res = (int) (Math.random() * 10 - 1 + 1) + 1;
            System.out.println(res);
        }
    }
}
