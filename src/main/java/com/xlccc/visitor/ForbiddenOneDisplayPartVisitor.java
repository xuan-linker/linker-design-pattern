package com.xlccc.visitor;

/**
 * @author Linker
 * @date 2020/7/15 10:26
 * @Description:访问者接口的实体类4-1
 */
public class ForbiddenOneDisplayPartVisitor implements ForbiddenOnePartVisitor {
    @Override
    public void visit(RightArmOfTheForbiddenOnePart rightArmOfTheForbiddenOne) {
        System.out.println("Displaying RightArmOfTheForbiddenOnePart");
    }

    @Override
    public void visit(LeftArmOfTheForbiddenOnePart leftArmOfTheForbiddenOne) {
        System.out.println("Displaying LeftArmOfTheForbiddenOnePart");

    }

    @Override
    public void visit(RightLegOfTheForbiddenOnePart rightLegOfTheForbiddenOne) {
        System.out.println("Displaying RightLegOfTheForbiddenOnePart");

    }

    @Override
    public void visit(LeftLegOfTheForbiddenOnePart leftLegOfTheForbiddenOne) {
        System.out.println("Displaying LeftLegOfTheForbiddenOnePart");

    }
}
