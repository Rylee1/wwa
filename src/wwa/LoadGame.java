package wwa;

public class LoadGame implements Operation {
     
    private Option option;
         
    @Override
    public void execute() {
        option.load();
    }
}
