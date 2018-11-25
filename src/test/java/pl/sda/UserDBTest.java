package pl.sda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;


public class UserDBTest {

    private UserDB userDB;

    @Before
    public void setUp() {
        userDB = new UserDB();
        User user1 = new User("Jan", "Kowalski", 50, "Poznan", Position.CFO);
        User user2 = new User("Janusz", "Nosacz", 60, "Poznan", Position.CEO);
        User user3 = new User("Jan", "Nowak", 40, "Poznan", Position.MISERABLE_SLAVE_OF_SYSTEM);
        userDB.addUser(user1);
        userDB.addUser(user2);
        userDB.addUser(user3);
    }

    @Test
    public void shouldCount3Employees() {
        //given
        final int expectedUsersCount = 3;

        //when
        int employeeCount = userDB.getUsersCount();

        //then
        Assert.assertEquals(expectedUsersCount, employeeCount);
    }

    @Test
    public void shouldReturn1CFOAnd1CEOAnd1MSOS() {
        //given
        final Integer cfoCount = 1;
        final Integer ceoCount = 1;
        final Integer msosCount = 1;

        //when
        Map<Position, Integer> result = userDB.countPositions();

        //then
        Assert.assertEquals(cfoCount, result.get(Position.CFO));
        Assert.assertEquals(ceoCount, result.get(Position.CEO));
        Assert.assertEquals(msosCount, result.get(Position.MISERABLE_SLAVE_OF_SYSTEM));
    }

}
