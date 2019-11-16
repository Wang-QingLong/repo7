package ssm.mapper;



import ssm.pojo.Account;

import java.util.List;

/**
 * @version V1.0
 * @author: WangQingLong
 * @date: 2019/11/12 8:53
 * @description: 持久层接口
 */
public interface AccountMapper {

    /**
     * 查询所有
     *
     * @return
     */
    List<Account> findAll();


    /**保存用户数据
     * @param account
     */
    void SaveCount(Account account);
}
