package ru.stqa.pft.rest.tests;

import org.testng.annotations.Test;

import java.io.IOException;

public class BugifyTests extends TestBase {

  @Test
  public void testGetIssue() throws IOException {
    int id = 2199;
    skipIfNotFixed(id);
    getIssueById(id);
  }
}

