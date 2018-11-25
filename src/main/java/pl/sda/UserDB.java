package pl.sda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDB {

    List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public int getUsersCount() {
        return users.size();
    }

    public Map<Position, Integer> countPositions() {
        Map<Position, Integer> result = new HashMap<>();

//        for (int i = 0; i < users.size(); i++) {
//            User user = users.get(i);
//        }
        for (User user : users) {
            Position position = user.getPosition();

            result.putIfAbsent(position, 0);
//            równoważne wyrażenie:
//            if (result.get(position) == null) {
//                result.put(position, 0);
//            }
            Integer count = result.get(position);
            result.put(position, ++count);
        }
        return result;
    }
}
