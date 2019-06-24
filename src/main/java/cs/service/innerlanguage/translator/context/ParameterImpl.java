/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import java.util.List;

/**
 *
 * @author akredd
 */
public class ParameterImpl extends DataStatement{
    
    public ParameterImpl(AbstractNodeContext parent, String typeName, String dataName) {
        super(parent, typeName, dataName, null);
    }
    
}
