/**
    * выделяем сущность "Чеолвек": говорим класс Man, для этой сущности определены поля - имя и поведение
    **/
public class Man {
    private String name;
    private String demeanour;
    /**
     * Конструктор отвечает за инициализацию имени и поведения
     * @param name
     * @param demeanour
     */
    public Man(String name, String demeanour) {
        this.name = name;
        this.demeanour = demeanour;
    } 
    /**
     * Метод инициализации голоса человека
     * @param name - имя человека
     * @param cat - объект кошка
     */
    public void voice(String name, Cat cat) {
        System.out.println(name + " зовет кошку: " + cat.getName() + " кс-кс-кс");
    }
    /**
     * Метод, отвечающий за реакцию кошки на голос человека
     * @param demeanour
     * @param cat
     */
    public void call(String demeanour, Cat cat) {
        if (demeanour == "доброжелательный") {
           
            voice(name, cat);
            cat.respond(cat.getName()); // кошка приходит
        } else {
            // если человек злой
            voice(name, cat);
            cat.respondNot(cat.getName()); // кошка не приходит
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDemeanour() {
        return demeanour;
    }
    public void setDemeanour(String demeanour) {
        this.demeanour = demeanour;
    }
}
