package top.zgod.sqlupdatecheck.type.impl;

import top.zgod.sqlupdatecheck.bean.JdbcType;
import top.zgod.sqlupdatecheck.type.AbstractTypeConvert;

/**
 * @author ZGOD
 */
public class RealToFloatTypeConvert extends AbstractTypeConvert {


    @Override
    public JdbcType getInitJdbcColumnTypeName() {
        return JdbcType.REAL;
    }

    @Override
    public Class<?> getInitJavaColumnTypeName() {
        return float.class;
    }
}
