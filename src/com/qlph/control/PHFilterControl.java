package com.qlph.control;

import java.util.ArrayList;

import com.qlph.database.PHFilterDAO;
import com.qlph.model.PhongHoc;
import com.qlph.ui.PHFilterOutput;
import com.qlph.utils.PHFilter;

public class PHFilterControl {
    
    // Ô 2 - Fields
    private PHFilterDAO phFilterDAO;
    private PHFilter phFilter;
    private PHFilterOutput phFilterOutput;
    
    // Ô 3 - Methods
    // Default Constructor
    public PHFilterControl() {
    }

    // Parameterized Constructor
    public PHFilterControl(PHFilterDAO phFilterDAO, PHFilter phFilter, PHFilterOutput phFilterOutput) {
        super();
        this.phFilterDAO = phFilterDAO;
        this.phFilter = phFilter;
        this.phFilterOutput = phFilterOutput;
    }
    
    public void filter() {
        ArrayList<PhongHoc> dsph;
        ArrayList<PhongHoc> dspkdc;
        
        dsph = phFilterDAO.getDSPH();
        dspkdc = phFilter.filterPH(dsph);
        
        phFilterOutput.printFilter(dspkdc);
    }
}