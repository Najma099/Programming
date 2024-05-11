public class constructor {
    public static void main(String[] args) {
        bank sbi = new bank("Deepali Kumari",88983,60000);
        System.out.println(sbi.name);
        sbi.setacno(909876);
        System.out.println(sbi.getacno());
    }
}
