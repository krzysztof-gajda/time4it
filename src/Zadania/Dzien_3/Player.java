package Zadania.Dzien_3;

public class Player {
    private String name;
    private String username;

    public String getName() {
        return name;
    }

    public Player(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
