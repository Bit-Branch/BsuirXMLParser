package by.bsuir.xmlparser.parser.sax;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BankSAXParserTest {
    
    private BankSAXParser builder;

    @BeforeClass
    public void initBuilder() {
        builder = new BankSAXParser();
        builder.buildBanksSet("src/main/resources/banks.xml");
    }

    @Test
    public void buildBanksSetTestSize() {
        Assert.assertEquals(builder.getBanks().size(), 16);
    }

}
