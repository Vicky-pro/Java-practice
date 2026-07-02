void main(){

    Scanner sc=new Scanner(System.in);
    String response=sc.nextLine().toUpperCase();


    try {
        weekdays wd=weekdays.valueOf(response);
        switch (wd){
            case SUNDAY,SATURDAY -> System.out.println("weekend");
            case MONDAY, TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> System.out.println("weekday");
        }
    }
    catch (IllegalArgumentException exception){
        System.out.println("enter a valid day");
    }

}