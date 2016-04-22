package xx.xl.sample.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class FundDaoImpl implements FundDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void recharge(long amounts) {
        System.out.println("FundDaoImpl recharge" + amounts);
        jdbcTemplate.execute("insert into fund values(1,1)");
    }

}
