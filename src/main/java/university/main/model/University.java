package university.main.model;

import java.util.List;

public class University {
    private String stateProvince;
    private List<String> domains;
    private String name;
    private String country;
    private List<String> webPages;
    private List<String> alphaTwoCode;

    public String getStateProvince() {
        return this.stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public List<String> getDomains() {
        return this.domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void seCountry(String country) {
        this.country = country;
    }

    public List<String> getWebPages() {
        return this.webPages;
    }

    public void setWebPages(List<String> webPages) {
        this.webPages = webPages;
    }

    public List<String> getAlphaTwoCode() {
        return this.alphaTwoCode;
    }

    public void setAlphaTwoCode(List<String> alphaTwoCode) {
        this.alphaTwoCode = alphaTwoCode;
    }
}