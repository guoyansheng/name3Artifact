/**
 * 
 */
package com.guo.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.util.StringUtils;

import com.guo.dao.UserMapper;
import com.guo.model.modelDo.User;
import com.guo.model.modelVo.UserVO;
import com.guo.service.RegisterService;
import com.guo.util.DateUtil;

/**
 * 娉ㄥ唽銆佽ˉ鍏ㄣ�佹縺娲�
 * 
 * @author Administrator
 *
 */
@Service("registerService")
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private TransactionTemplate transactionTemplate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.guo.service.RegisterService#register(com.guo.model.modelVo.UserVO)
	 */
	@Override
	public UserVO register(final UserVO userVO) {
		final UserVO userVO2 = new UserVO();
		transactionTemplate.execute(new TransactionCallback<UserVO>() {
			@Override
			public UserVO doInTransaction(TransactionStatus status) {
				// 1.瀵硅薄杞崲
				User user = new User();
				BeanUtils.copyProperties(userVO, user);
				String birthdateStr = userVO.getBirthdateStr();
				if(!StringUtils.isEmpty(userVO.getBirthdateStr())){
					Date birthdate = DateUtil.stringToDate(userVO.getBirthdateStr(), DateUtil.patternA);
					user.setBirthdate(birthdate);
				}
				
				// 2.鎻掑叆鏁版嵁
				//杩斿洖鐨勪富閿湪User.id涓�
				userMapper.insert(user);
				// 3.鏌ヨ鏁版嵁
				user = userMapper.selectByPrimaryKey(user.getId());
				BeanUtils.copyProperties(user, userVO2);
				userVO.setBirthdateStr(birthdateStr);
				// TODO Auto-generated method stub
				return null;
			}
		});

		return userVO2;
	}

}
