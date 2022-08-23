package pokemongame_;

import java.io.*;
public class Save {

	public void save(Pokemon mypok) {
		File f1 = new File("src/pokemongame_/saveFile");
		f1.mkdirs();
		OutputStream out = null;
		BufferedOutputStream bout = null;
		ObjectOutputStream oout = null;
		try {
			out = new FileOutputStream("src/pokemongame_/saveFile/save1.txt");
			bout = new BufferedOutputStream(out);
			oout = new ObjectOutputStream(bout);
			
			oout.writeObject(mypok);
			System.out.println("저장 성공!!");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void save_badge(int badge) {
		OutputStream out = null;
		try {
			out = new FileOutputStream("src/pokemongame_/saveFile/save2.txt");
			out.write(badge);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
