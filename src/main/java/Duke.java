public class Duke {
    public static void main(String[] args) {
        String divider = "____________________________________________________________";
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println(divider);
        System.out.println(logo);
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?");
        System.out.println(divider);
        bye(divider);
    }

    public static void bye(String divider) {
        System.out.println("Bye. Hope to see you again soon!");
        System.out.println(divider);
    }
}
