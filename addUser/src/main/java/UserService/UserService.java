package UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainservice.UserServiceimp;
import com.userRepository.UserRepository;

import addUserModel.AddUser;
@Service
public class UserService implements UserServiceimp {
	

	@Autowired
	private UserRepository userRepository;
	
	public AddUser saveAddUser(AddUser addUser) {
		AddUser addUser1= ((AddUser) userRepository).saveaddUser(addUser);
		return addUser1;

}
}
