package com.boda.xy;

public class PickCards {
	public static void main(String[] args){
		   int card =(int) (Math.random()*52);
		   String suit="",rank="";
		   suit = switch(card / 13){     // 确定牌的花色
		      case 0 -> "♠";
		      case 1 -> "♥";
		      case 2 -> "♦";
		      case 3 -> "♣";
	default -> "";
		   };
		   rank = switch(card % 13){     // 确定是第几张牌
		      case 0 -> "A";
		      case 10 -> "J";
		      case 11 -> "Q";
		      case 12 -> "K";
		      default -> ""+(card %13 +1);
		   };
		   System.out.println("你抽取的牌是：" + suit + rank);
	   }

}
