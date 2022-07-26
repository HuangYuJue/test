ublic class hello {
    public static void main(String[] args) {
        System.out.println("请输入名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name+"欢迎您de访问~");
    }
}
