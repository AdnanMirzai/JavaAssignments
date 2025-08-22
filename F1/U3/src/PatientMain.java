void main() {
    Patient p1 = new Patient("Peter", "19900431-3398");
    p1.addToJournal("Peter has these symptoms: \nHeadache\nStomach pain");
    System.out.println(p1.toString());
    p1.addToJournal("Peter is now well");
    System.out.println(p1.getJournal());
}
