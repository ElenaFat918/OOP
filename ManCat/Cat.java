/**
    * выделяем сущность "Кошка": говорим класс Cat, для этой сущности определено поле - name
*/
public class Cat {
    private String name;
    /**
     * конструктор отвечает за инициализацию имени
     * @param name
     */
    public Cat(String name) {
        this.name = name;
    }
    /**
     * 
     * @param name
     */
    public void respond(String name){
        System.out.println("кошка " + name + " подошла и сказала мяу");
    }
    public void respondNot(String name){
        System.out.println("кошка " + name + " убежала");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
