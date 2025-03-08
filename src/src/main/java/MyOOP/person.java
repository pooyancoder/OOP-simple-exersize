package MyOOP;

public class person {
    private String name;
    private int age;
    private String job;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int Age){
        this.age = Age;
    }
    public int getAge(){
        return age;
    }
    public void setJob(String job){
        this.job = job;
    }
    public String getJob(){
        return job;
    }
    public person(int age , String name){
        this.age = age;
        this.name = name;
    }

    public person(int age , String name , String job){
        this.age = age;
        this.name = name;
        this.job = job;
    }
    public void showInfo(){
        System.out.println("persons name is "+name);
        System.out.println("persons age is "+age);
        if(!job.equals(null)){
            System.out.println("persons job is "+job);
        }
    }
    public boolean isAdoult(){
        return age >= 18;
    }

}
