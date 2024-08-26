//class Solution {
//    public int solution(String sr) {
//
//    
//        
//        int n = sr.length();
//        char a[] = sr.toCharArray();
//        int flag=0;
//        for(int i=0;i<n/2;i++)
//        {
//            if(a[i]!='.' && a[n-1-i]!='.' && a[i]!=a[n-1-i])
//            {
//                flag=1;
//                break;
//            }
//        }
//        if(flag==1)
//        {
//            System.out.println("Not possible");
//        }
//        else
//        {
//            for(int i=0;i<n;i++)
//            {
//                if(a[i]=='.')
//                {
//                    if(a[n-1-i]=='.')
//                    {
//                        a[i]='a';
//                        a[n-1-i]='a';
//                    }
//                    else
//                    {
//                        a[i]=a[n-1-i];
//                    }
//                }
//            }
//            for(int i=0;i<n;i++)
//            {
//                System.out.print(a[i]);
//            }
//            System.out.println();
//        }
//    } 
//}
