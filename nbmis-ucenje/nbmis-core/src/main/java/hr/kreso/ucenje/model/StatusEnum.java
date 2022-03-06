package hr.kreso.ucenje.model;

public enum StatusEnum {
    STATUS_AKTIVAN("ACTIVE", "A"),
    STATUS_PASIVAN("PASSIVE", "P");


    StatusEnum(String name, String code){
        this.name = name;
        this.code = code;
    }

    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static final StatusEnum getStatusEnumFromCode(String code){
        StatusEnum[] values = StatusEnum.values();
        for (int i = 0; i < values.length; i++) {
            if(values[i].getCode().equals(code)){
                return values[i];
            }

        }
        throw new IllegalArgumentException("Ne postoji StatusEnum za code =" + code);
    }

    public static final StatusEnum getStatusEnumFromName(String name){
        StatusEnum[] values = StatusEnum.values();
        for (int i = 0; i < values.length; i++) {
            if(values[i].getName().equals(name)){
                return values[i];
            }

        }
        throw new IllegalArgumentException("Ne postoji StatusEnum za name =" + name);
    }





    public static StatusEnum setStatusEnum(String code){
        StatusEnum statusEnum = null;
        if(code != null){
            if(code.equals(STATUS_AKTIVAN.getCode())){
                statusEnum = STATUS_AKTIVAN;
            }else if(code.equals(STATUS_PASIVAN.getCode())){
                statusEnum = STATUS_PASIVAN;
            }
        }
        return statusEnum;
    }
}
