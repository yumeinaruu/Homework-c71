package Homework10.Task2;

public class User extends Person implements Cloneable{
    public int id = 1;
    public Person person = new Person();

    public void setId(int id) {
        this.id = id;
    }

    protected Object clone(int choice) throws CloneNotSupportedException {
        if(choice == 1){
            User user = (User) super.clone();
            user.person = (Person) this.person.clone();
            return user;
        } else if (choice == 2){
            return super.clone();
        }
        System.out.println("1 or 2");
        System.exit(0);
        return null;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", person=" + person +
                '}';
    }
}
