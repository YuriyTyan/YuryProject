package reviewclass10.abstractclasses;

public abstract class DataBase {

    public abstract void readFromDataBase(String databaseName);
    public abstract void writeToDataBase(String databaseName);
    public abstract void modifyDataBase(String databaseName);
}

class OracleDatabase extends DataBase{

    @Override
    public void readFromDataBase(String databaseName) {
        System.out.println("We are Oracle, we provided implementation of Reading data from Oracle dbf");
    }

    @Override
    public void writeToDataBase(String databaseName) {
        System.out.println("We are Oracle, we provided implementation of Writing data from Oracle dbf");
    }

    @Override
    public void modifyDataBase(String databaseName) {
        System.out.println("We are Oracle, we provided implementation of Modify data in Oracle dbf");
    }
}

class MicrosoftDatabase extends DataBase{

    @Override
    public void readFromDataBase(String databaseName) {
        System.out.println("We are Microsoft, we provided implementation of Reading data from MS dbf");
    }

    @Override
    public void writeToDataBase(String databaseName) {
        System.out.println("We are Microsoft, we provided implementation of writing data to MS dbf");
    }

    @Override
    public void modifyDataBase(String databaseName) {
        System.out.println("We are Microsoft, we provided implementation of modifying data in MS dbf");
    }
}

abstract class IBMDatabase extends DataBase{
    @Override
    public void readFromDataBase(String databaseName) {
        System.out.println("we are the IBM experts we have provided the implementation" +
                " Reading data from OracleDatabase");
    }
}