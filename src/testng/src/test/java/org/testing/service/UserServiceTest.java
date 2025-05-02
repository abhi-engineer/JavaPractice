//package org.testing.service;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.ArgumentCaptor;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.testing.Service.UserService;
//import org.testing.entity.User;
//import org.testing.repo.UserRepository;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//class UserServiceTest {
//
//    @Mock
//    private UserRepository userRepository;
//
//    @InjectMocks
//    private UserService userService;
//
//    @BeforeEach
//    void setup() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void testFindUser_ReturnsUser() {
//        User mockUser = new User(1, "Nothing");
//        when(userRepository.findById(1)).thenReturn(mockUser);
//
//        User result = userService.findUser(1);
//
//        assertEquals("Nothing", result.getName());
//        verify(userRepository).findById(1);
//    }
//
//    @Test
//    void testSaveUser_CallsRepositorySave() {
//        userService.saveUser("John");
//
//        ArgumentCaptor<User> captor = ArgumentCaptor.forClass(User.class);
//        verify(userRepository).save(captor.capture());
//
//        assertEquals("John", captor.getValue().getName());
//    }
//}
//
