package xx.xl.sample.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FundServiceImpl implements FundService {

    @Autowired
    private FundDao           fundDao;
    @Autowired
    private CopyOfFundService copyOfFundService;

    public FundServiceImpl() {
        System.out.println("FundServceImpl  ");
    }

    @Transactional
    public void recharge(long amount) throws Exception {
        System.out.println("FundServceImpl recharge " + amount);
        fundDao.recharge(amount);
        copyOfFundService.recharge(amount);
//        if (1 == 1) {
//            throw new Exception();
//        }

    }

}
