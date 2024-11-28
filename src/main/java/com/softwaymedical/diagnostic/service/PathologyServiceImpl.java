package com.softwaymedical.diagnostic.service;

import org.springframework.stereotype.Service;

@Service
public class PathologyServiceImpl implements PathologyService{

    private final String CARDIOLOGIE = "Cardiologie";
    private final String TRAUMATOLOGIE = "Traumatologie";

    @Override
    public String getPathologies(int index) {

        if (index%3 == 0 && index% 5 == 0){
            return CARDIOLOGIE+", "+TRAUMATOLOGIE;
        }else if(index%3 == 0){
            return CARDIOLOGIE;
        }else if (index%5 == 0){
            return TRAUMATOLOGIE;
        }
        return "Index Non definie";
    }
}
