package com.xlccc.visitor;

/**
 * @author Linker
 * @date 2020/7/15 10:14
 * @Description:扩展了接口的实体类2-3
 */
public class RightArmOfTheForbiddenOnePart implements ForbiddenOnePart {
    @Override
    public void action(ForbiddenOnePartVisitor forbiddenOneVisitor) {
        forbiddenOneVisitor.visit(this);
    }
}
