public class trappedWater {
    public static int waterTrapped(int height[]) {
        // leftMax
        int leftMax [] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++) {
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }

        //Rightmax
        int RightMax[] = new int[height.length];
        RightMax[height.length-1] = height[height.length-1];
        for(int i =height.length-2; i>=0; i-- ) {
            RightMax[i] = Math.max(height[i] ,RightMax[i+1]);
        }
        int trapWater = 0;

        //loop
        for(int i=0; i<height.length; i++) {
            //Waterlevel
            int waterLevel = Math.min(leftMax[i] , RightMax[i]);
            //trappedwater
            trapWater+= waterLevel - height[i];
        }

        return trapWater;

        

        
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        waterTrapped(height);
        System.out.println(waterTrapped(height));
        
    }
    
}
