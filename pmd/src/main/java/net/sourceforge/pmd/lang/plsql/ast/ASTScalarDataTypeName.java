/* Generated By:JJTree: Do not edit this line. ASTScalarDataTypeName.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=net.sourceforge.pmd.lang.ast.AbstractNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTScalarDataTypeName extends SimpleNode {
  public ASTScalarDataTypeName(int id) {
    super(id);
  }

  public ASTScalarDataTypeName(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=5c5d6cabe95a072a8f3c84e3c847ffeb (do not edit this line) */