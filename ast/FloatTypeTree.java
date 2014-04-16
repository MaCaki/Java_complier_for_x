package ast;

import visitor.*;
/**
 *
 * @author Raskolnikov
 */
public class FloatTypeTree extends AST{
    public FloatTypeTree() {
    }

    public Object accept(ASTVisitor v) {
        return v.visitFloatTypeTree(this);
    }
}
