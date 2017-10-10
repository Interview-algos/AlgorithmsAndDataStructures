package others;


public final class ImmutableClassDemo {

    private final String name;
    private final String mobile;

    public ImmutableClassDemo(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
  
    public String getName(){
        return name;
    }
  
    public String getMobile(){
        return mobile;
    }
}


