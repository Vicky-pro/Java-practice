public enum weekdays {
    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
    private final int number;
    weekdays(int number){
        this.number=number;
    }
    public int get(){
        return number;
    }
}
