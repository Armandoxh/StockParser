package JsonParsing;

import CompanyPOJOs.CompanyProfile;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;
import java.net.URL;

public class CompanyDeSerializer extends StdDeserializer<CompanyProfile> {
    ObjectMapper om = new ObjectMapper();
    CompanyProfile value;
    String symbol;

    public CompanyDeSerializer(){
        this(null);
    }
    public CompanyDeSerializer(Class<?> vc) {
        super(vc);
    }





    public CompanyProfile create(String symbol) throws IOException {
    this.symbol = symbol;
    SimpleModule module =
            new SimpleModule("CompanyDeserializer", new Version(1, 0, 0, null, null, null));

    module.addDeserializer(CompanyProfile.class, new CompanyDeSerializer());
    om.registerModule(module);
        return om.readValue(new URL("https://financialmodelingprep.com/api/v3/company/profile/" + symbol), CompanyProfile.class);
    }




    @Override
    public CompanyProfile deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        CompanyProfile companyProfile = new CompanyProfile(symbol);
        ObjectCodec codec = p.getCodec();
        JsonNode node = codec.readTree(p);
        // try catch block
        JsonNode websiteNode = node.get("profile");

       companyProfile.setUrl(websiteNode.get("website").asText());
       companyProfile.setCompanyName(websiteNode.get("companyName").asText());
       companyProfile.setCEO(websiteNode.get("ceo").asText());
       companyProfile.setDescription(websiteNode.get("description").asText());

        return companyProfile;
    }
}
