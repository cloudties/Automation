package  com.automation.ui.cuspera.bdd.test.runCukes.reportbuilder;


import com.automation.ui.base.common.bdd.serenity.framework.report.CodeCompiler;
import com.automation.ui.base.common.bdd.serenity.framework.report.MergeReports;
import org.junit.Test;


public class CodeCompilerTest {
    @Test
    public void compilerTest(){
        CodeCompiler codeCompiler = new CodeCompiler();
        try {
            codeCompiler.compilerTest();
        } catch (Exception e) {
            System.out.println("Report builder failed to merge the cucumber reports");
        }
    }
}
