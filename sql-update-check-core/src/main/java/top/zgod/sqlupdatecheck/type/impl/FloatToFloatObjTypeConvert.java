package top.zgod.sqlupdatecheck.type.impl;

import top.zgod.sqlupdatecheck.bean.JdbcType;
import top.zgod.sqlupdatecheck.type.AbstractTypeConvert;

/**
 * @author ZGOD
 */
public class FloatToFloatObjTypeConvert extends AbstractTypeConvert {


    @Override
    public JdbcType getInitJdbcColumnTypeName() {
        return JdbcType.FLOAT;
    }

    @Override
    public Class<?> getInitJavaColumnTypeName() {
        return Float.class;
    }
}
