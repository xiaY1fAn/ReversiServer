package cc.cxsj.nju.reversi.chess;

/**
 * a square of the chess board
 * 
 * @author coldcode
 *
 */
public class Square {
	public boolean empty = true;
	// 0 id black, 1 is white, -1 is empty, 2 is prohibition
	public int color = -1;
	
	public Square() {}
	
	public Square(int color) {
		this.color = color;
	}
	
	public void reset() {
		this.color = -1;
	}
	
	public String toStringToRecord() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("");

		switch (this.color) {
			case 0:
				sb.append("B");
				break;
			case 1:
				sb.append("W");
				break;
			case 2:
				sb.append("P");
				break;
			default:
				sb.append(" ");
				break;
		}
		return sb.toString();
	}
	
	public String toStringToDisplay() {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder("|");
		switch (this.color) {
			case 0:
				sb.append("B");
				break;
			case 1:
				sb.append("W");
				break;
			case 2:
				sb.append("P");
				break;
			default:
				sb.append(" ");
		}
		sb.append("|");
		return sb.toString();

	}
	
	/**
	 * exist chessman black or white
	 */
	public boolean existChessman(){
		return (color == 0 || color == 1);
	}

}
