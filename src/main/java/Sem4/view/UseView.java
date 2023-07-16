package Sem4.view;

public interface UseView {
    void sendOnConsole();
    void sendOnConsole(SortType sortType);
    void create(String fullName, Integer age, String phoneNumber, String groupTitle);
    void removeUser(String fullName);
}
