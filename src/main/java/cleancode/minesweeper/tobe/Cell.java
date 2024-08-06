package cleancode.minesweeper.tobe;

public class Cell {

	private static final String FLAG_SIGN = "⚑";
	private static final String LAND_MINE_SIGN = "☼";
	private static final String UNCHECKED_SIGN = "□";
	private static final String EMPTY_SIGN = "■";


	private final String sign;
	private int nearbyLandMineCount;
	private boolean isLandMine;

	private Cell(String sign, int nearbyLandMineCount, boolean isLandMine) {
		this.sign = sign;
		this.nearbyLandMineCount = nearbyLandMineCount;
		this.isLandMine = isLandMine;
	}

	// Cell이 가진 속성: 근처 지뢰 숫자, 지뢰 여부
	// Cell의 상태 : 깃발 유무, 열렸다/닫혔다, 사용자가 확인함

	public static Cell of(String sign, int nearbyLandMineCount, boolean isLandMine) {
		return new Cell(sign, nearbyLandMineCount, isLandMine);
	}

	public static Cell create() {
		return of("", 0, false);
	}

	public static Cell ofFlag() {
		return of(FLAG_SIGN);
	}

	public static Cell ofLandMine() {
		return of(LAND_MINE_SIGN);
	}

	public static Cell ofClosed() {
		return of(UNCHECKED_SIGN);
	}

	public static Cell ofOpend() {
		return of(EMPTY_SIGN);
	}

	public static Cell ofNearByLandMineCount(int count) {
		return of(String.valueOf(count));
	}

	public String getSign() {
		return sign;
	}

	public boolean isClosed() {
		return UNCHECKED_SIGN.equals(this.sign);
	}

	public boolean doesNotClosed() {
		return !isClosed();
	}
}
