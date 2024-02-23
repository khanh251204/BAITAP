package BT3_MOVIE;

public class Review {
	private String reviewText;
	private String nameText;
	private double reviewS;
	public Review(String reviewText, String nameText, double reviewS) {
		super();
		this.reviewText = reviewText;
		this.nameText = nameText;
		this.reviewS = reviewS;
	}
	public String getReviewText() {
		return reviewText;
	}
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
	public String getNameText() {
		return nameText;
	}
	public void setNameText(String nameText) {
		this.nameText = nameText;
	}
	@Override
	public String toString() {
		return "Review [reviewText=" + reviewText + ", nameText=" + nameText + ", reviewS=" + reviewS + "]";
	}
	public double getReviewS() {
		return reviewS;
	}
	public void setReviewS(double reviewS) {
		this.reviewS = reviewS;
	}
	
}
