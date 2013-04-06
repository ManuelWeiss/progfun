package recfun

object countChangeTest {
  def countChange(money: Int, coins: List[Int]): Int = {
//  	println("m: " + money + " c: " + coins)
    if (money <= 0 || coins.isEmpty)
      0
    else if (money == coins.head)
      1 + countChange(money, coins.tail)
    else if (money < coins.head)
      countChange(money, coins.tail)
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }                                               //> countChange: (money: Int, coins: List[Int])Int

  countChange(300, List(5, 10, 20, 50, 100, 200)) //> res0: Int = 1022
  countChange(300, List(5, 50, 100, 20, 200, 10)) //> res1: Int = 1022
}