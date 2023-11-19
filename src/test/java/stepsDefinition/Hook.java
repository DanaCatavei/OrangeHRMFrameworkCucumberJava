package stepsDefinition;

import common.base.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ReadingFile;

import java.io.IOException;

public class Hook extends CommonMethods {
    @Before
    public void initPage() throws IOException {
        visit(ReadingFile.file().getProperty("urlApp"));
    }

}
