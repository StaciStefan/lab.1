class Test{
    public static void main(String args[]) {

        Televizor LG = new Televizor("LG", "4K", 100, true);
        System.out.println(LG);

        Person morarul = new Person();
        morarul.setName("Vasile");
        morarul.setAge(56);
        morarul.setProfession("profesor");
        morarul.setHeight(175);//cm

        System.out.println(morarul.getName()+", "+ morarul.getProfession()+", Age: "+morarul.getAge()+" ani");

    }
}
