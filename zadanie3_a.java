import java.util.Scanner;

public class zadanie3_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Длина createHead()");
        int x = sc.nextInt();
        createHead(x);
        System.out.println("Длина createTail()");
        x = sc.nextInt();
        createTail(x);
        System.out.println("Длина AddFirst()");
        x = sc.nextInt();
        AddFirst(x);
        System.out.println("\nДлина AddLast()");
        x = sc.nextInt();
        AddLast(x);
        System.out.println("\nДлина Insert()");
        x = sc.nextInt();
        Insert(x);
        System.out.println("\nДлина RemoveFirst()");
        x = sc.nextInt();
        RemoveFirst(x);
        System.out.println("\nДлина RemoveLast()");
        x = sc.nextInt();
        RemoveLast(x);
        System.out.println("\nДлина Remove()");
        x = sc.nextInt();
        Remove(x);
    }

    public static void createHead(int x) {
        Node head = null;
        for (int i = x - 1; i >= 0; i--) {
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            head = new Node(k, head);
        }
        Node ref = head;
        String nodeStr = new String();
        nodeStr = "[" + ref.value + "]";
        ref = ref.next;
        while (ref != null) {
            nodeStr = nodeStr + " [" + ref.value + "]";
            ref = ref.next;
        }
        toString(nodeStr);
    }

    public static void createTail(int x) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Node head = new Node(k, null);
        Node tail = head;
        for (int i = 0; i < x - 1; i++) {
            k = sc.nextInt();
            tail.next = new Node(k, null);
            tail = tail.next;
        }
        Node ref = head;
        String nodeStr = new String();
        nodeStr = "[" + ref.value + "]";
        ref = ref.next;
        while (ref != null) {
            nodeStr = nodeStr + " [" + ref.value + "]";
            ref = ref.next;
        }
        toString(nodeStr);
    }

    public static void toString(String Str) {
        System.out.println("toString()");
        System.out.println(Str);
    }

    public static void AddFirst(int x) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Node head = new Node(k, null);
        Node tail = head;
        for (int i = 0; i < x - 1; i++) {
            k = sc.nextInt();
            tail.next = new Node(k, null);
            tail = tail.next;
        }
        Node ref = head;
        while (ref != null) {
            System.out.print("[" + ref.value + "]");
            ref = ref.next;
        }
        System.out.println("\nВведите новое начало: ");
        int newHead = sc.nextInt();
        head = new Node(newHead, head);
        System.out.println("Односвязный список с добавленным началом:");
        ref = head;
        while (ref != null) {
            System.out.print("[" + ref.value + "]");
            ref = ref.next;
        }
    }

    public static void AddLast(int x) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Node head = new Node(k, null);
        Node tail = head;
        for (int i = 0; i < x - 1; i++) {
            k = sc.nextInt();
            tail.next = new Node(k, null);
            tail = tail.next;
        }
        Node ref = head;
        while (ref != null) {
            System.out.print("[" + ref.value + "]");
            ref = ref.next;
        }
        System.out.println("\nВведите новое значение конца: ");
        int newTail = sc.nextInt();
        Node newtail = new Node(newTail, null);
        ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newtail;
        ref = head;
        while (ref != null) {
            System.out.print("[" + ref.value + "]");
            ref = ref.next;
        }
    }

    public static void Insert(int x) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Node head = new Node(k, null);
        Node tail = head;
        for (int i = 0; i < x - 1; i++) {
            k = sc.nextInt();
            tail.next = new Node(k, null);
            tail = tail.next;
        }
        Node ref = head;
        while (ref != null) {
            System.out.print("[" + ref.value + "]");
            ref = ref.next;
        }
        System.out.println("\nВведите позицию переменной:");
        int pos = sc.nextInt();
        System.out.println("Введите значение переменной:");
        int value = sc.nextInt();
        Node newNode = new Node(value, null);
        ref = head;
        int i = 1;
        while (ref.next != null && (i < pos)) {
            ref = ref.next;
            i++;
        }
        newNode.next = ref.next.next;
        ref.next = newNode;
        ref = head;
        while (ref != null) {
            System.out.print("[" + ref.value + "]");
            ref = ref.next;
        }

    }

    public static void RemoveFirst(int x) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Node head = new Node(k, null);
        Node tail = head;
        for (int i = 0; i < x - 1; i++) {
            k = sc.nextInt();
            tail.next = new Node(k, null);
            tail = tail.next;
        }
        Node ref = head;
        while (ref != null) {
            System.out.print("[" + ref.value + "]");
            ref = ref.next;
        }
        head = head.next;
        System.out.println(" ");
        ref = head;
        while (ref != null) {
            System.out.print("[" + ref.value + "]");
            ref = ref.next;
        }
    }

    public static void RemoveLast(int x) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Node head = new Node(k, null);
        Node tail = head;
        for (int i = 0; i < x - 1; i++) {
            k = sc.nextInt();
            tail.next = new Node(k, null);
            tail = tail.next;
        }
        Node ref = head;
        while (ref != null) {
            System.out.print("[" + ref.value + "]");
            ref = ref.next;
        }
        ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
        System.out.println(" ");
        ref = head;
        while (ref != null) {
            System.out.print("[" + ref.value + "]");
            ref = ref.next;
        }
    }

    public static void Remove(int x) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Node head = new Node(k, null);
        Node tail = head;
        for (int i = 0; i < x - 1; i++) {
            k = sc.nextInt();
            tail.next = new Node(k, null);
            tail = tail.next;
        }
        Node ref = head;
        while (ref != null) {
            System.out.print("[" + ref.value + "]");
            ref = ref.next;
        }
        ref = head;
        k = 1;
        System.out.println("\nКакую позицию из списка вы хотите удалить: ");
        int pos = sc.nextInt();
        while (ref.next != null && (k < pos)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
        ref = head;
        while (ref != null) {
            System.out.print("[" + ref.value + "]");
            ref = ref.next;
        }
    }
}
