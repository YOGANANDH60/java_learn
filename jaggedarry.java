public class jaggedarry {
    public static void main(String[] args) {
        int num[][]=new int[3][];  //jagged array
        num[0]=new int[3];
        num[1]=new int[4];
        num[2]=new int[2];

        
        for (int i=0;i<num.length;i++)
        {
            for (int j=0;j<num[i].length;j++)
            {

                num[i][j]=(int)(Math.random()*10);
    
            }
        }

        for (int n[]:num)
        {
            for (int m:n)
            {

               System.out.print(m +" ");
                }
             
           System.out.println();
        }

        System.out.println("------------------------");
        // mutili dimenaionl array

        int nums[][][]=new int[3][4][2]; 
        
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {
                for (int k=0;k<2;k++)
                {

                    nums[i][j][k]=(int)(Math.random()*10);
        
                }
            }
        }

        for (int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {
                for (int k=0;k<2;k++){

                    System.out.print(nums[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
