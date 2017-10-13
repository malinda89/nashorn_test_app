import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        try {
            // Read script file
            engine.eval(new FileReader("test_script.js"));
            // Script functions are called using the 'invokeFunction' in Invocable interface
            Invocable invocable = (Invocable)engine;

            // ["headache", "stomachache", "allergy", "cold"]
            String illness = "headache";
            int age = 5;

            Object result = invocable.invokeFunction("findMeds", illness, age);
            System.out.println(illness + " -> " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
