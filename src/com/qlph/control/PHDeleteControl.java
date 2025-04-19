package com.qlph.control;

import com.qlph.database.PHDeleteDAO;
import com.qlph.logic.PHDeleteLogic;
import com.qlph.ui.PHDeleteInput;
import com.qlph.ui.PHDeleteOutput;

public class PHDeleteControl {
    
    // Ô 2 - Fields
    private PHDeleteDAO phDeleteDAO;
    private PHDeleteInput phDeleteInput;
    private PHDeleteOutput phDeleteOutput;
    private PHDeleteLogic phDeleteLogic;
    
    // Ô 3 - Methods
    // Default Constructor
    public PHDeleteControl() {
        this.phDeleteLogic = new PHDeleteLogic();
    }
    
    // Parameterized Constructor
    public PHDeleteControl(PHDeleteDAO phDeleteDAO, PHDeleteInput phDeleteInput, PHDeleteOutput phDeleteOutput) {
        super();
        this.phDeleteDAO = phDeleteDAO;
        this.phDeleteInput = phDeleteInput;
        this.phDeleteOutput = phDeleteOutput;
        this.phDeleteLogic = new PHDeleteLogic();
    }
    
    public void delete() {
        phDeleteLogic.processDelete(phDeleteDAO, phDeleteInput, phDeleteOutput);
    }
}