package ru.job4j.ex;

/**
 * Task.
 */
public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User value : users) {
            if (value.getUsername().equals(login)) {
                rsl = value;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("User not found");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean result = false;
        if (user.getUsername().length() > 2 && user.isValid()) {
            result = true;
        }
        if (!result) {
            throw new UserInvalidException("User is invalid or user name consists of less than three characters");
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ie) {
            ie.printStackTrace();
        } catch (UserNotFoundException nf) {
            nf.printStackTrace();
        }
    }
}