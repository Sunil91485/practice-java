public class RemoveSpace {
    public void getSpacedRemovedString(String string) {
       String name= string.replace(" ", "");
        System.out.println(name);
    }

    public static void main(String[] args) {
        RemoveSpace removeSpace = new RemoveSpace();
        removeSpace.getSpacedRemovedString("sunil kumar kumar m g");
    }
}
