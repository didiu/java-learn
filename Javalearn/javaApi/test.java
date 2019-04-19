package javaApi;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class test {

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine scriptEngine = manager.getEngineByName("js");
        String string = "1.3+2.5+-2.1";

        try {
            Object result = scriptEngine.eval(string);
            System.out.println("结果类型:" + result.getClass().getName() + ",计算结果:" + result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }


    }
}