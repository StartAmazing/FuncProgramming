package com.ll.chapter2

object TheCompanyProcess_Functional_Scala {
  def main(args: Array[String]): Unit = {
    val employees = List("neal", "s", "stu", "j", "rich", "bob", "aiden",
      "j", "ethan", "liam", "mason", "noah", "lucas", "jacob", "jayden", "jack")

    val reslut = employees
      .par
      .filter(_.length > 1)
      .map(_.capitalize)
      .reduce(_+ "," +_)

    println(reslut)
  }
}
