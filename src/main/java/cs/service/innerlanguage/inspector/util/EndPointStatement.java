/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.inspector.util;

import cs.service.innerlanguage.translator.statements.StatementContext;

/**
 *
 * @author anisimov_a_v
 */
public class EndPointStatement extends ITreeTraversal {
	public EndPointStatement(ITreeTraversal parent, StatementContext endPoint) {
		super(parent, endPoint);
	}
}
