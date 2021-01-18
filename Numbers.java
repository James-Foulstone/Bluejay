public class Numbers{
    private int[] numbers;
    
    public Numbers() {
        numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    }
    
    public void Count(){
        int even = 0;
        int odd = 0;
        for(int i = 0; i < numbers.length; i++){
            if(i % 2 == 0){
                even++;
            }
            else if(i % 2 != 0){
                odd++;
            }
            System.out.println(numbers[i]);
        }
        System.out.println(even);
        System.out.println(odd);
    }
}