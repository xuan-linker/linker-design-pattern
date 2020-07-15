package com.xlccc.visitor;

/**
 * @author Linker
 * @date 2020/7/15 10:21
 */
public class ForbiddenOne implements ForbiddenOnePart {
    ForbiddenOnePart[] parts;

    public ForbiddenOne() {
        parts = new ForbiddenOnePart[]{
                new LeftArmOfTheForbiddenOnePart(),
                new LeftLegOfTheForbiddenOnePart(),
                new RightArmOfTheForbiddenOnePart(),
                new RightLegOfTheForbiddenOnePart()};
    }

    @Override
    public void action(ForbiddenOnePartVisitor forbiddenOneVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].action(forbiddenOneVisitor);
        }
//        forbiddenOneVisitor.visit(this);
    }
}
