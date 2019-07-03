package com.fanhehe.common.service;

import com.fanhehe.common.model.User;

public interface UserService {
	User getUserInfoBy(long id);
	User createUser(long id, String name);
}