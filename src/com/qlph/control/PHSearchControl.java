package com.qlph.control;

import com.qlph.database.PHSearchDAO;
import com.qlph.logic.PHSearchLogic;
import com.qlph.ui.PHSearchInput;
import com.qlph.ui.PHSearchOutput;

public class PHSearchControl {
    private PHSearchDAO phSearchDAO;
    private PHSearchInput phSearchInput;
    private PHSearchOutput phSearchOutput;
    private PHSearchLogic phSearchLogic;
    
    public PHSearchControl() {
    }

    public PHSearchControl(PHSearchDAO phSearchDAO, PHSearchInput phSearchInput, PHSearchOutput phSearchOutput, PHSearchLogic phSearchLogic) {
        super();
        this.phSearchDAO = phSearchDAO;
        this.phSearchInput = phSearchInput;
        this.phSearchOutput = phSearchOutput;
        this.phSearchLogic = phSearchLogic;
    }
    
    public void search() {
        phSearchLogic.processSearch(phSearchDAO, phSearchInput, phSearchOutput);
    }
    
    
}