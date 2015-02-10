

public class SpiralPrint
{
 public static void main(String[] args)
 {
  int[][] arr =
  {
  { 13, 14, 15, 16, 12, 15 },
  { 22, 24, 26, 22, 25, 27 },
  { 32, 35, 37, 38, 39, 33 },
  { 42, 44, 47, 43, 45, 48 },
  { 56, 54, 57, 53, 55, 57 } };


  //go from left to right
  //top to bottom
  //right to left
  //left to top

  spiralPrint(arr, 0);
 }



 private static void spiralPrint(int[][] arr, int depth)
 {
  if (arr == null && arr.length == 0)
   return;

  int rows = arr.length;
  int cols = arr[0].length;
  //check for depth here
  if (2 * depth > Math.min(rows, cols))
   return;


  for (int i = depth; i < cols - depth - 1; ++i)
  {
   info(arr[depth][i] + ",");
  }
  for (int i = depth; i < rows - depth - 1; ++i)
  {
   info(arr[i][cols - depth - 1] + ",");
  }
  for (int i = rows - depth; i > depth; --i)
  {
   info(arr[rows - depth - 1][i] + ",");
  }
  for (int i = rows - depth - 1; i > depth; --i)
  {
   info(arr[i][depth] + ",");
  }
  //recursion
  spiralPrint(arr, ++depth);
 }



private static void info(String string) {
	// TODO Auto-generated method stub
	System.out.print(string);
}
}