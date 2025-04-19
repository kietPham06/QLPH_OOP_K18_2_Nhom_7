package com.qlph.control;

import com.qlph.database.PHFilterDAO;
import com.qlph.logic.PHFilterLogic;
import com.qlph.ui.PHFilterOutput;
import com.qlph.utils.PHFilter;

public class PHFilterControl {
    
    // Ô 2 - Fields
    private PHFilterDAO phFilterDAO;
    private PHFilter phFilter;
    private PHFilterOutput phFilterOutput;
    private PHFilterLogic phFilterLogic;
    
    // Ô 3 - Methods
    // Default Constructor
    public PHFilterControl() {
        this.phFilterLogic = new PHFilterLogic();
    }

    // Parameterized Constructor
    public PHFilterControl(PHFilterDAO phFilterDAO, PHFilter phFilter, PHFilterOutput phFilterOutput, PHFilterLogic phFilterLogic) {
        super();
        this.phFilterDAO = phFilterDAO;
        this.phFilter = phFilter;
        this.phFilterOutput = phFilterOutput;
        this.phFilterLogic = phFilterLogic;
    }
    
    public void filter() {
        phFilterLogic.processFilter(phFilterDAO, phFilter, phFilterOutput);
    }
}