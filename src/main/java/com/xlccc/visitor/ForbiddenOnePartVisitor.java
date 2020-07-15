package com.xlccc.visitor;

/**
 * @author Linker
 * @date 2020/7/15 10:12
 * @Description:表示访问者的接口3-1
 */
public interface ForbiddenOnePartVisitor {
    //被封印的右手的Visitor
    public void visit(RightArmOfTheForbiddenOnePart rightArmOfTheForbiddenOne);

    //被封印的左手的Visitor
    public void visit(LeftArmOfTheForbiddenOnePart leftArmOfTheForbiddenOne);

    //被封印的右脚的Visitor
    public void visit(RightLegOfTheForbiddenOnePart rightLegOfTheForbiddenOne);

    //被封印的左脚的Visitor
    public void visit(LeftLegOfTheForbiddenOnePart leftLegOfTheForbiddenOne);

}
