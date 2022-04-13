package day23inheritince;

public class Practice01 {
   public Practice01(){
       System.out.println("A");
   }
   public Practice01(int a){
       System.out.println("B");
   }
}

   class Practice02{
    public Practice02(){
        System.out.println("C");
    }
   }
  class Practice03{
    public Practice03(String s){
        System.out.println("D");
    }
  }
  class Runner{
      public static void main(String[] args) {
          Practice03 obj1 = new Practice03("Woow!");
      }
  }