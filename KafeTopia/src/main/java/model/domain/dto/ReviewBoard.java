package model.domain.dto;

public class ReviewBoard {
	
	private int seq;	//seq
	private String author;	//아이디
	private String cafeid;	//카페id
	private String title;	//제목
	private String content;	//내용
	private int count;	//조회수
	private int likecount;	//좋아요수
	private String img;	//이미지
	
	public ReviewBoard(int seq, String author, String cafeid, String title, String content, int count, int likecount,
			String img) {
		super();
		this.seq = seq;
		this.author = author;
		this.cafeid = cafeid;
		this.title = title;
		this.content = content;
		this.count = count;
		this.likecount = likecount;
		this.img = img;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCafeid() {
		return cafeid;
	}

	public void setCafeid(String cafeid) {
		this.cafeid = cafeid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getLikecount() {
		return likecount;
	}

	public void setLikecount(int likecount) {
		this.likecount = likecount;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "ReviewBoard [seq=" + seq + ", author=" + author + ", cafeid=" + cafeid + ", title=" + title
				+ ", content=" + content + ", count=" + count + ", likecount=" + likecount + ", img=" + img + "]";
	}

}
