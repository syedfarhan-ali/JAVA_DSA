//Given a route containing 4 directions (E,W,N,S),
//Find the shortest path to reach destination.
// eg: - "WNEENESENNN" -> 5
//hint - use distance formula 
public class ShortestPath {
    public static float getShortestPath(String route){
        //find coords
        int x = 0,y = 0;
        for(int i=0;i<route.length();i++){
            if(route.charAt(i) == 'N'){
                y++;
            }
            else if(route.charAt(i) == 'S'){
                y--;
            }
            else if(route.charAt(i) == 'E'){
                x++;
            }
            else if(route.charAt(i) == 'W'){
                x--;
            }
            else{
                System.out.println("Invalid input!");
                return -1;
            }
        }
        //Using distance formula on x and y
        float result = (float)(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
        return result;
    }
    public static void main(String[] args) {
        String route = "WNEENESENNN";
        System.out.println(getShortestPath(route));
    }
}
