package com.qlph.control;

import com.qlph.database.PHUpdateDAO;
import com.qlph.logic.PHUpdateLogic;
import com.qlph.ui.PHUpdateInput;
import com.qlph.ui.PHUpdateOutput;

public class PHUpdateControl {
    
    // Ô 2 - Fields
    private PHUpdateDAO phUpdateDAO;
    private PHUpdateInput phUpdateInput;
    private PHUpdateOutput phUpdateOutput;
    private PHUpdateLogic phUpdateLogic;
    
    // Ô 3 - Methods
    // Default Constructor
    public PHUpdateControl() {
    }

    // Parameterized Constructor
    public PHUpdateControl(PHUpdateDAO phUpdateDAO, PHUpdateInput phUpdateInput, PHUpdateOutput phUpdateOutput, PHUpdateLogic phUpdateLogic) {
        super();
        this.phUpdateDAO = phUpdateDAO;
        this.phUpdateInput = phUpdateInput;
        this.phUpdateOutput = phUpdateOutput;
        this.phUpdateLogic = phUpdateLogic;
    }
    
    public void update() {
        phUpdateLogic.processUpdate(phUpdateDAO, phUpdateInput, phUpdateOutput);
    }
    
    
}