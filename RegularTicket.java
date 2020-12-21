package com.upgrad;

public class RegularTicket {
    public String specialService;

    public RegularTicket() {

    }

    public RegularTicket(String specialService) {
        this.specialService = specialService;
    }

    public String getSpecialService(){
        return specialService;
    }
    public String updateSpecialService(String _specialService) {
        specialService = _specialService;
        return specialService;
    }
}
