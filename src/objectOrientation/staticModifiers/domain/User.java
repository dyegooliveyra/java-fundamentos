package objectOrientation.staticModifiers.domain;

public class User {

    private String name;
    private  static int totalUsers = 0; // Variável compartilhada entre todas as instâncias

    public User(String name) {
        this.name = name;
        totalUsers++; // Incrementa a cada novo usuário criado

    }

    public static int getTotalUsers() {
        return totalUsers; // Retorna o total de usuários
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setTotalUsers(int totalUsers) {
        User.totalUsers = totalUsers;
    }
}
