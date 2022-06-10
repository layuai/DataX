package com.alibaba.datax.plugin.rdbms.reader;

public final class Constant {
    public static final String PK_TYPE = "pkType";

    public static final String PK_TYPE_GUESS = "pkTypeGuess";

    public static final Object PK_TYPE_STRING = "pkTypeString";

    // custom
    public static final Object PK_TYPE_UUID_STRING = "pkTypeUUIDString";

    public static final Object PK_TYPE_BIG_INTEGER_STRING = "pkTypeBigIntegerString";

    public static final Object PK_TYPE_DECIMAL_ZERO_SCALE = "pkTypeDecimalZeroScale";

    public static final String PK_TYPE_MAX_PK = "maxPK";

    public static final String PK_TYPE_MIN_PK = "minPK";

    public static final Object PK_TYPE_LONG = "pkTypeLong";
    
    public static final Object PK_TYPE_MONTECARLO = "pkTypeMonteCarlo";
    
    public static final String SPLIT_MODE_RANDOMSAMPLE = "randomSampling";

    public static String CONN_MARK = "connection";

    public static String TABLE_NUMBER_MARK = "tableNumber";

    public static String IS_TABLE_MODE = "isTableMode";

    public final static String FETCH_SIZE = "fetchSize";

    public static String QUERY_SQL_TEMPLATE_WITHOUT_WHERE = "select %s from %s ";

    public static String QUERY_SQL_TEMPLATE = "select %s from %s where (%s)";

    public static String TABLE_NAME_PLACEHOLDER = "@table";

    public static Integer SPLIT_FACTOR = 5;

}
