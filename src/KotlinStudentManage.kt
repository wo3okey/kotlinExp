class Student(var id: Int, var name: String)

object StudentManage {
    var studentList = ArrayList<Student>()

    fun printStudent() {
        for (student in studentList) {
            println("id : ${student.id} | name : ${student.name}")
        }
    }

    fun sortedStudent() {
        studentList.sortBy { student -> student.id }
    }

    fun printNameList() {
        var nameList = studentList
                                .map { student -> student.name }
                                .toList()

        println(nameList.toString())
    }

    fun addStudent(id: Int, name: String) {
        studentList.add(Student(id, name))
    }

    fun updateStudent(id: Int, name: String) {
        for (student in studentList) {
            if (id == student.id) {
                student.name = name
            }
        }
    }

    fun deleteStudent(id: Int) {
        for (student in studentList) {
            if (student.id == id) {
                studentList.remove(student)
            }
        }
    }
}

fun main(args: Array<String>) {
    var stm = StudentManage

    stm.addStudent(5, "형욱")
    stm.addStudent(3, "영연")
    stm.addStudent(4, "돌팔")
    stm.printStudent()

    println()

    stm.updateStudent(2, "형순")
//    stm.deleteStudent(2)
    stm.sortedStudent()
    stm.printStudent()
    stm.printNameList()


}
