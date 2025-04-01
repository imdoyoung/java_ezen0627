package com.mycompany.test;

import java.util.Scanner;

public class Solution1
{
  public int solution(int bytesize)
  {
    String text1 = "이노룰스Innorules";
    char[] char1 = text1.toCharArray();
    
    int bytesize2 = 0;
    StringBuilder sb = new StringBuilder();
    
    for (char c : char1)
    {
      int charsize = (c > 127) ? 2 : 1;
      
      if(bytesize2 + charsize > bytesize)
      {
        System.out.println(sb);
        sb.setLength(0);
        bytesize2 = 0;
      }
      
      sb.append(c);
      bytesize2 += charsize;
    }
    
    if(sb.length() > 0)
    {
      System.out.println(sb);
    }


    return 0;
  }

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("출력할 바이트 크기를 입력하세요: ");
    int bytesize = scanner.nextInt();
    scanner.close();
    
    Solution1 sol = new Solution1();
    // 인자 값은 지원자가 적절하게 수정하여 제출
    sol.solution(bytesize);
  }
}