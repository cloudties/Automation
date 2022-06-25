package  com.automation.ui.cuspera.bdd.test.runCukes.reportbuilder;


import com.automation.ui.base.common.bdd.serenity.framework.report.MergeReports;
import org.junit.Test;


public class CucumberReportMergerTest {
    @Test
    public void mergeReports(){
        MergeReports mergeReports = new MergeReports();
        try {
            mergeReports.buildMergedReport();
        } catch (Exception e) {
            System.out.println("Report builder failed to merge the cucumber reports");
        }
    }
}
