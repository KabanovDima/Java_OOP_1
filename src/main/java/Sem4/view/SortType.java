package Sem4.view;

public enum SortType {
    NONE("Сортирока по молчанию"),
    NAME("Сортировка по имени"),
    ID("Сортировка по ID");

    private final String sortName;

    @Override
    public String toString() {
        return sortName;
    }

    SortType(String sortName){
        this.sortName = sortName;
    }

    //    String NONE = "NONE";
//    String NAME = "NAME";
//    String ID = "ID";
}
