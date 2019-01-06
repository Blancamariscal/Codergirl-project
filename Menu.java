package sample;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    Scanner keyboard = new Scanner(System.in);
    ArrayList<User> users = new ArrayList<User>();
    ArrayList<Post> posts = new ArrayList<Post>();
    char quit = 'E';

    public void createNewUser() {
        String name = "";
        System.out.println("What's your first and last name?");
        keyboard.skip("\n");
        name.add(keyboard.nextLine());

        String username = "";
        System.out.println("What's your username?");
        username.add(keyboard.nextLine());

        String email = "";
        System.out.println("What's your email address?");
        email.add(keyboard.nextLine());

        String avatarUrl = "";
        System.out.print("Type in a valid URL to your avatar picture:");
        avatarUrl.add(keyboard.nextLine());

        String newCreation;
        System.out.println("Would you like to create another user? (Y/N)");
        newCreation = keyboard.nextLine();
        newCreation = newCreation.toUpperCase();
        quit = newCreation.charAt(0);

        User newUser = new User("blanca.mariscal.com", "blanca.mariscal", "Blanca Mariscal", "blanca.bm@gmail.com");
        User exampleUser = new User("lastName.firstName.com", "firstName.lastName", "firstName lastName", "name.gmail.com");
        users.add(newUser);
        users.add(exampleUser);

    }

    public void becomeExistingUser() {
        System.out.println("Which of the returning users are you?");
        System.out.print(arrayList<User>users.get[i] + "\n");
        //printing out the arrayList of users that were made.
        for (String a : ArrayList<User> users)
        {
            System.out.println(a);
        }
        String existingUser = keyboard.nextLine();

    }

        public void createNewPost() {
        String content = "";
        System.out.println("What would you like to post?");
        content.add(keyboard.nextLine());

        String url = "";
        System.out.println("What's your url to the post?");
        url.add(keyboard.nextLine());

            String continuePosting;
            System.out.println("Would you like write another post? (Y/N)");
            continuePosting = keyboard.nextLine();
            continuePosting = continuePosting.toUpperCase();
            quit = continuePosting.charAt(0);

        Post newPost = new Post(newUser, "Hi, nice to meet you!", "facebook/post.com");
        posts.add(newPost);
        Post examplePost = new Post(exampleUser, "Type whatever you want to say.", "facebook/post.com");
        posts.add(examplePost);
            }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menuOptions();
    }
    public void menuOptions() {

        String[] arrayName = new String[5];
        arrayName[0] = "Create a new user";
        arrayName[1] = "Become an existing user";
        arrayName[2] = "Write a post as current user";
        arrayName[3] = "Print all posts";
        arrayName[4] = "Print all users";

        do {
            for (int i = 0; i < arrayName.length; i++) {
                System.out.println(arrayName[i]);
                System.out.println((i + 1) + "." + arrayName[i]);
            }

                System.out.println("Type in a number to what you want to do");
                int mainMenu = keyboard.nextInt();

                if (mainMenu == 1) {
                    createNewUser();
                } else if (mainMenu == 2) {
                    becomeExistingUser();
                } else if (mainMenu == 3) {
                    createNewPost();
                } else if (mainMenu == 4) {
                    System.out.print(posts);
                } else if (mainMenu == 5) {
                    System.out.print(users);
                } else {
                    System.out.println("Invalid choice");
                }
        }while (true);
    }
}
