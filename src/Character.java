class Character {
    private String name;
    private int attack;
    private int blood;
    public Character(String name){
        this.setName(name);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getAttack() {
        return attack;
    }

    public int getBlood() {
        return blood;
    }

    public String getName() {
        return name;
    }
}
