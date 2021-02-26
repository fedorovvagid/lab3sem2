import java.util.Scanner;

public class zadanie3_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите необходимую длину для создания списка c головы: ");
        int x = sc.nextInt();
        Node head = null;
        String NodeStr = new String();
        createHeadRec(x, head, NodeStr);
        System.out.println("Введите необходимую длину для создания списка c головы: ");
        x = sc.nextInt();
        System.out.println("Введите значение переменной");
        int data = sc.nextInt();
        head = new Node(data, null);
        Node tail = head;
        createTailRec(x, 1, tail, head.value + "");
    }

    public static void createHeadRec(int x, Node head, String nodeStr) {
        if (x > 0) {
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            head = new Node(k, head);
            createHeadRec(x - 1, head, nodeStr = nodeStr + head.value);
        } else {
            toStringRec(nodeStr);
        }
    }

    public static void createTailRec(int x, int i, Node tail, String nodeStr) {
        if (i < x) {
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            tail.next = new Node(k, null);
            createTailRec(x, i + 1, tail.next, nodeStr = nodeStr + tail.next.value);
        } else {
            toStringRec(nodeStr);
        }
    }

    public static void toStringRec(String str) {
        System.out.println(str);
    }
}