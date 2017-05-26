package gyum_02.sugang.model;


import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;

public class SugangDAOImple implements SugangDAO {

	private SqlSessionTemplate sqlMap;
	
	public SugangDAOImple(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}

	public List<SugangDTO> sugangList() {
		List<SugangDTO> list = sqlMap.selectList("sugangList");
		return list;
	}

}
