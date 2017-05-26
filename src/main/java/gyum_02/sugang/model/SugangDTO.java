package gyum_02.sugang.model;

import java.sql.Date;

public class SugangDTO {

	private int stu_idx;//학생인덱스
	private String stu_id;//아이디
	private String stu_pwd;//비밀번호
	private int pwd_q_idx;//질문인덱스
	private String pwd_q_a;//비밀번호답
	private int stu_birth;//생년월일
	private String stu_name;//이름
	private String stu_tel;//전화번호
	private String stu_email;//이메일
	private Date stu_in_date;//가입날짜
	private Date stu_out_date;//탈퇴날짜
	private String stu_school;//학교
	private int stu_grade;//학년
	private int file_idx;//파일인덱스
	private int par_idx;//학부모 인덱스
	
	public SugangDTO() {
		super();
	}

	public SugangDTO(int stu_idx, String stu_id, String stu_pwd, int pwd_q_idx, String pwd_q_a, int stu_birth,
			String stu_name, String stu_tel, String stu_email, Date stu_in_date, Date stu_out_date, String stu_school,
			int stu_grade, int file_idx, int par_idx) {
		super();
		this.stu_idx = stu_idx;
		this.stu_id = stu_id;
		this.stu_pwd = stu_pwd;
		this.pwd_q_idx = pwd_q_idx;
		this.pwd_q_a = pwd_q_a;
		this.stu_birth = stu_birth;
		this.stu_name = stu_name;
		this.stu_tel = stu_tel;
		this.stu_email = stu_email;
		this.stu_in_date = stu_in_date;
		this.stu_out_date = stu_out_date;
		this.stu_school = stu_school;
		this.stu_grade = stu_grade;
		this.file_idx = file_idx;
		this.par_idx = par_idx;
	}

	public int getStu_idx() {
		return stu_idx;
	}

	public void setStu_idx(int stu_idx) {
		this.stu_idx = stu_idx;
	}

	public String getStu_id() {
		return stu_id;
	}

	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}

	public String getStu_pwd() {
		return stu_pwd;
	}

	public void setStu_pwd(String stu_pwd) {
		this.stu_pwd = stu_pwd;
	}

	public int getPwd_q_idx() {
		return pwd_q_idx;
	}

	public void setPwd_q_idx(int pwd_q_idx) {
		this.pwd_q_idx = pwd_q_idx;
	}

	public String getPwd_q_a() {
		return pwd_q_a;
	}

	public void setPwd_q_a(String pwd_q_a) {
		this.pwd_q_a = pwd_q_a;
	}

	public int getStu_birth() {
		return stu_birth;
	}

	public void setStu_birth(int stu_birth) {
		this.stu_birth = stu_birth;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public String getStu_tel() {
		return stu_tel;
	}

	public void setStu_tel(String stu_tel) {
		this.stu_tel = stu_tel;
	}

	public String getStu_email() {
		return stu_email;
	}

	public void setStu_email(String stu_email) {
		this.stu_email = stu_email;
	}

	public Date getStu_in_date() {
		return stu_in_date;
	}

	public void setStu_in_date(Date stu_in_date) {
		this.stu_in_date = stu_in_date;
	}

	public Date getStu_out_date() {
		return stu_out_date;
	}

	public void setStu_out_date(Date stu_out_date) {
		this.stu_out_date = stu_out_date;
	}

	public String getStu_school() {
		return stu_school;
	}

	public void setStu_school(String stu_school) {
		this.stu_school = stu_school;
	}

	public int getStu_grade() {
		return stu_grade;
	}

	public void setStu_grade(int stu_grade) {
		this.stu_grade = stu_grade;
	}

	public int getFile_idx() {
		return file_idx;
	}

	public void setFile_idx(int file_idx) {
		this.file_idx = file_idx;
	}

	public int getPar_idx() {
		return par_idx;
	}

	public void setPar_idx(int par_idx) {
		this.par_idx = par_idx;
	}
	
	
}
