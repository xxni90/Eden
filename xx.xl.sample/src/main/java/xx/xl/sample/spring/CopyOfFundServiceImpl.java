package xx.xl.sample.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CopyOfFundServiceImpl implements CopyOfFundService {

    @Autowired
    private FundDao fundDao;

    public CopyOfFundServiceImpl() {
        System.out.println("CopyOfFundServiceImpl  ");
    }

    @Transactional(propagation = Propagation.NESTED)
    public void recharge(long amount) throws Exception {
        System.out.println("FundServceImpl recharge " + amount);
        fundDao.recharge(amount);
        if (1 == 1) {
            throw new RuntimeException();
        }

    }

}
