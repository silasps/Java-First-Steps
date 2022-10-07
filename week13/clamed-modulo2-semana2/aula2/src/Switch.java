public class Switch {
    public static void main(String[] args) {
        String console = "Ambernic";
        switch (console) {
            case "Super Nintendo":
            case "Nintendinho":
            case "Gameboy":
                System.out.println("Console da Nintendo");
                break;
            case "PS1":
            case "PS2":
            case "PS3":
            case "PS4":
            case "PS5":
                System.out.println("Console da Sony");
                break;
            default:
                System.out.println("Acho que é Microsoft");
                break;

        }
    }
}
