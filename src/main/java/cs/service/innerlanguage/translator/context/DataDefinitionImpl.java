/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import java.util.List;

/**
 *
 * @author root
 */
public class DataDefinitionImpl extends DataStatement {
    //TODO revert with new Object View
    
    public DataDefinitionImpl(AbstractNodeContext parent, String typeName, String dataName, List<NodeContext> values) {
        super(parent, typeName, dataName, values);
    }
}
