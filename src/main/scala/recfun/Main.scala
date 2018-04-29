package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || c == r) {
        1
      } else {
        pascal(c-1, r-1) + pascal(c, r-1)
      }
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char], count: Int = 0): Boolean = {
      if (count == 0 && chars.isEmpty) {
        true
      } else if (chars.isEmpty) {
        false
      } else {
        val head = chars.head
        if (head == '(') {
          balance(chars.tail, count + 1)
        } else if (head == ')' && count > 0) {
          balance(chars.tail, count - 1)
        } else if (head == ')') {
          false
        } else {
          balance(chars.tail, count)
        }
      }
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
