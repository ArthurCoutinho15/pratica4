package br.newtonpaiva;

public class Atributos {
    public String Name;
    public Integer telefone;

    public String email;

    public Atributos(){

    }

    public Atributos(String name, Integer telefone, String email) {
        Name = name;
        this.telefone = telefone;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
               "[" +  "Name: " + Name + " telefone: " + telefone + " email: " + email + "]";
    }
}
