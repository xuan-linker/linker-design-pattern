package com.xlccc.visitor;

/**
 * @author Linker
 * @date 2020/7/15 10:16
 * @Description:扩展了接口的实体类2-4
 */
public class RightLegOfTheForbiddenOnePart implements ForbiddenOnePart {
    @Override
    public void action(ForbiddenOnePartVisitor forbiddenOneVisitor) {
        forbiddenOneVisitor.visit(this);
    }
}
