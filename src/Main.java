import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        try {
            // Read script file
            engine.eval(new FileReader("rules_script.js"));
            // Script functions are called using the 'invokeFunction' in Invocable interface
            Invocable invocable = (Invocable)engine;

            String illness = "headache";
            int age = 10;

            Object result = invocable.invokeFunction("findMeds", illness, age);
            System.out.println(illness + " -> " + result);
            // System.out.println(result.getClass());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
