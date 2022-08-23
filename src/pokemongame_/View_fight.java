package pokemongame_;

public class View_fight 
{
	public static void fightmain(Pokemon mypok, Pokemon pok)
	{
		System.out.println("    \t\t\t"+pok.name_pok);
		System.out.println("\t\t\t"+pok.hp+"  /  "+pok.hp_max);
		System.out.println(" 　　　　　　\t　　　　　　　　 ∧＿∧\r\n" + 
				"　　　　　　 　　　　　　　　　　 　　（＾ω＾）\r\n" + 
				"　　　　　　 　　　　　　　　　　　 　/ つ¶つ¶\r\n" + 
				"　　　　　　　　　　　　　 　 　 　 ／￣￣￣￣＼\r\n" + 
				"　　　　　 　　　　　　 　 　 　 　 |) ○　○　○ 　(|\r\n" + 
				"　　　　　　　　　　　　 　　　 ／″ 　　　ν.　 　 ＼\r\n" + 
				"　　　　　　　　　（(　((　(( 　／＿＿＿＿＿＿＿＿＿＿＼\r\n" + 
				"\t\t\t￣ ＼＿＼＿＿／＿／ ￣\r\n" +
				mypok.name_pok+"\n"+
				mypok.hp+"  /  "+mypok.hp_max+"\n"+
				"　　　       ^⌒^\r\n" + 
				"--=≡ 　(´.ω.)\r\n" + 
				"-=≡　　/　 つ_つ\r\n" + 
				"-=≡　　 人　 Y\r\n" + 
				"　　　 レ＼フ\r\n");
		
	}
}
