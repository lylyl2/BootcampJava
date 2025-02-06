package quize21;

class Data {
	
    private String name;
    private String age;
    private String email;
    private String address;

    // Getter & Setter
    public String getColumn1() {
        return name;
    }

    public void setColumn1(String column1) {
        this.name = column1;
    }

    public String getColumn2() {
        return age;
    }

    public void setColumn2(String column2) {
        this.age = column2;
    }

    public String getColumn3() {
        return email;
    }

    public void setColumn3(String column3) {
        this.email = column3;
    }

    @Override
    public String toString() {
        return "Data{" +
                "column1='" + name + '\'' +
                ", column2='" + age + '\'' +
                ", column3='" + email + '\'' +
                '}';
    }
}
