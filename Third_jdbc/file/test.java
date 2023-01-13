package Third_jdbc.file;

import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception {

        myStudentSystem myStudentSystem = new myStudentSystem();

        Scanner sc = new Scanner(System.in);

        System.out.println("是否要创建学生表格（回答或否）");

        String sc1 = sc.nextLine();

        if(sc1.contentEquals("是")){

            String sql = "create table Students(\n" +
                    "    StudentId INTEGER,\n" +
                    "    StudentName varchar(50),\n" +
                    "    Gender varchar(20),\n" +
                    "    constraint StudentsPkey primary key (StudentId)\n" +
                    ");";

            myStudentSystem.StudentsTable(sql);

        }

        System.out.println("是否要创建班级表格（回答或否）");

        String sc2 = sc.nextLine();

        if (sc2.contentEquals("是")){

            String sql = "create table Classes(\n" +
                    "    ClassId INTEGER,\n" +
                    "    StudentId INTEGER NOT NULL REFERENCES Students (StudentId) ON DELETE CASCADE ON UPDATE CASCADE,\n" +
                    "    EnterTime timestamp not null,\n" +
                    "    constraint ClassesPkey primary key (ClassId,StudentId)\n" +
                    ");";

            myStudentSystem.ClassesTable(sql);

        }

        System.out.println("是否要输入学生数据（回答或否）");

        String sc3 = sc.nextLine();

        if(sc3.contentEquals("是")){

            String sql = sc.nextLine();

            while(!sql.contentEquals("stop")){

                myStudentSystem.StudentMessage(sql);

                System.out.println("是否继续输入数据（输入stop退出）");

                sql = sc.nextLine();

            }
            /**测试数据
             * 要一行一行输入，不然sql语句识别不出来，原因未知（问题未解决）
             insert into Students(StudentId,StudentName,Gender) values (1001,'王小明','男');
             insert into Students(StudentId,StudentName,Gender) values (1002,'张小美','女');
             insert into Students(StudentId,StudentName,Gender) values (1003,'刘壮壮','男');
             insert into Students(StudentId,StudentName,Gender) values (1004,'赵小真','女');
             **/

        }

        System.out.println("是否要输入班级数据（回答或否）");

        String sc4 = sc.nextLine();

        if(sc4.contentEquals("是")){

            String sql = sc.nextLine();

            while(!sql.contentEquals("stop")){

                myStudentSystem.ClassMessage(sql);

                System.out.println("是否继续输入数据（输入stop退出）");

                sql = sc.nextLine();

            }
            /**测试数据
             *要一行一行输入，不然sql语句识别不出来，原因未知（问题未解决）
             insert into Classes(ClassId,StudentId,EnterTime) values (1,1001,'2022-12-31 08:00:00');
             insert into Classes(ClassId,StudentId,EnterTime) values (2,1002,'2022-12-31 08:00:00');
             insert into Classes(ClassId,StudentId,EnterTime) values (3,1003,'2022-12-31 08:00:00');
             insert into Classes(ClassId,StudentId,EnterTime) values (4,1004,'2022-12-31 08:00:00');
             **/

        }

        System.out.println("是否要更改或删除数据（回答或否）");

        String sc5 = sc.nextLine();

        if(sc5.contentEquals("是")){

            String sql = sc.nextLine();

            while(!sql.contentEquals("stop")){

                myStudentSystem.ClassMessage(sql);

                System.out.println("是否继续更改数据（输入stop退出）");

                sql = sc.nextLine();

            }
            /**测试数据
             *要一行一行输入，不然sql语句识别不出来，原因未知（问题未解决）
             DELETE FROM Students WHERE StudentId = 1001;
             UPDATE Classes SET ClassId = 1001 WHERE ClassId = 1;
             **/

        }

    }
}
