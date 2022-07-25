ublic class hello {
    public static void main(String[] args) {
        System.out.println("请输入名字：");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line+"欢迎您de访问~");
    }
}
