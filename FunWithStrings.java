class FunWithStrings {
  public static void main(String[] args) {
    String s1="I am mental";
s1=s1.replaceAll("I","You");
    s1=s1.replace("a","e");
    System.out.print(s1);
    System.out.println();
    s1=s1.replaceFirst("e","u");
    System.out.print(s1);
  }
}