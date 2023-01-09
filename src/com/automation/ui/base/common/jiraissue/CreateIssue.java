package com.automation.ui.base.common.jiraissue;

import java.util.ArrayList;
import java.util.List;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.CustomFieldOption;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;
import com.sun.org.apache.xml.internal.security.utils.Base64;

import java.io.*;
import java.net.*;
import javax.json.*;


import java.net.URI;

public class CreateIssue {
    private static final String JIRA_URL = "http://localhost:2990/jira";
    private static final String JIRA_ADMIN_USERNAME = "admin";
    private static final String JIRA_ADMIN_PASSWORD = "admin";

    public static void main(String[] args) {
        try {
            URL jiraREST_URL = new URL("http://172.27.211.65:8080/rest/api/2/issue/JUEX-16253");
            URLConnection urlConnection = jiraREST_URL.openConnection();
            urlConnection.setDoInput(true);

            HttpURLConnection conn = (HttpURLConnection) jiraREST_URL.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);

            String encodedData = URLEncoder.encode(getJSON_Body(),"UTF-8");

            System.out.println(getJSON_Body() + "/" + encodedData);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Authorization", "Basic " + Base64.encode("e521621:e521621".getBytes(), 0));
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Content-Length", String.valueOf(encodedData.length()));
            conn.getOutputStream().write(encodedData.getBytes());

            try {
                InputStream inputStream = conn.getInputStream();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getJSON_Body(){
        JsonObject createIssue = Json.createObjectBuilder()
                .add("fields",
                        Json.createObjectBuilder().add("HPS Project Engineering Digitization",
                                Json.createObjectBuilder().add("key","TEST"))
                                .add("summary", "sum")
                                .add("description", "descr")
                                .add("reporter","manjusha.saju@wescodist.com")
                                .add("assignee","manjusha.saju@wescodist.com")
                                .add("issuetype",
                                        Json.createObjectBuilder().add("id", "10105"))
                ).build();

        return createIssue.toString();

    }
   /* BasicCredentials creds  ;
    JiraClient jira ;

    public static void main(String ar[])
    {
        new CreateIssue().createIssue(
                "HPS Project Engineering Digitization"
                ,"test"
                ,"testing"
                ,"manjusha.saju@wescodist.com"
                ,"manjusha.saju@wescodist.com");
    }

    public CreateIssue(){
        try {

            creds = new BasicCredentials("h265456", "welcome@8");
            jira = new JiraClient("https://acsjira.wescodist.com", creds);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public  void createIssue(String projectName, String jiraComment,String desc,String reporter,String assigne) {
        try{

            Issue newIssue = jira.createIssue(projectName, "Bug")
                    .field(Field.SUMMARY, jiraComment)
                    .field(Field.DESCRIPTION, desc)
                    .field(Field.REPORTER, reporter)
                    .field(Field.ISSUE_TYPE,"Bug")
                    .field(Field.ASSIGNEE, assigne)
                    .execute();
        }catch (Exception e)
        {
            System.out.println("Raise JIRA ISSUE");
            e.printStackTrace();
        }

    }*/

}