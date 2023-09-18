public class Symbol {
    private String type;
    private String val;

    //For var, holds var type and var value (eg. "int", 1)
    //For func, holds arg types and arg names (eg. "int, float, float", "a, b, x")
    public Symbol(String type, String val) {
        this.type = type;
        this.val = val;
    }

    public String getType(){
        return type;
    }

    public String getVal(){
        return val;
    }
}
