package dataProvider;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider
    public static Object[][] generateTestData(){
        return new Object[][]{
                {"test", "test", "test"},
                {"test1", "test1", "test1"},
                {},
        };
    }
}
