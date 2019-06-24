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
public class ConstantDefinitionImpl extends DataStatement{
    public ConstantDefinitionImpl(AbstractNodeContext parent, String typeName, String dataName, List<NodeContext> values) {
        super(parent, typeName, dataName, values);
    }
}
