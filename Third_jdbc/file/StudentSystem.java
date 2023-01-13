package Third_jdbc.file;

public interface StudentSystem {

    void StudentsTable(String sql)throws Exception;

    void ClassesTable(String sql)throws Exception;

    void StudentMessage(String sql)throws Exception;

    void ClassMessage(String sql)throws Exception;

    void UpdateStudentOrClassMessage(String sql)throws Exception;


}
