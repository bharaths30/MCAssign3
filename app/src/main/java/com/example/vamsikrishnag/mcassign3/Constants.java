package com.example.vamsikrishnag.mcassign3;

/**
 * Created by sdj on 4/3/17.
 */

public class Constants {
    public static int INPUT_DIMENSION_SIZE = 150;
    public static String TRAINING_TABLE = "Training";
    public static String TEST_TABLE = "Test";
    public static String TRAIN_FIRST_STRING = "Please train before testing!";
    public static String SQL_TRAINING_SELECT = "SELECT * FROM " + Constants.TRAINING_TABLE + " LIMIT 60";
    public static String SQL_TEST_SELECT = "SELECT * FROM " + Constants.TEST_TABLE + " LIMIT 60";
    public static int INPUT_ROWS_TRAINING = 60;
    public static int TEST_ROWS_LIMIT = 20;
    public static String EXCEPTION_SVM_SERVICE = "Exception occured in SVM Service class! Please take a look at logs";
    public static String dbName="Assignment3_Group10.db";
}
