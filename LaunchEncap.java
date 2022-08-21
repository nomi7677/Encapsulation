package com.firstpackage;



class Books{
   private int pageNo;

   public void setPageNo(int pageNo) {
       if (pageNo > 0) {
           this.pageNo = pageNo;
       } else {
           System.out.println("Please enter positive numbers");
       }
   }
   public int getPageNo(){
       return pageNo;
   }

}
public class LaunchEncap {
    public static void main(String[] args) {

        Books b = new Books();

        b.setPageNo(2000);
        System.out.println(b.getPageNo());

    }
}