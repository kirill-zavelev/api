package model;

import java.util.HashMap;
import java.util.Map;

public class User {

    private Integer id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private String company;
    private Map<String, Object> additionalParameters = new HashMap<String, Object>();
}
