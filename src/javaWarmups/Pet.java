package javaWarmups;

class Pet {
    // F
    String name;
    String type;
    // CON
    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }
    // GETS
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }

    // SETS
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
}