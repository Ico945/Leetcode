/*
package TaskScheduler;

public class TaskScheduler {
    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};
        int n = 2;
        System.out.println(new TaskScheduler().leastInterval(tasks,n));
    }
    public int leastInterval(char[] tasks, int n) {
        char[] res = new char[20000];
        int i;
        for(i = 0;i<n;i++)
            res[i] = '#';
        for(int j = 0;j<tasks.length;j++)
        {
            if(jugde(res,i,tasks[j],n))
                res[i] = tasks[j];
            else{
                int xb = j;
                while (tasks[xb] == tasks[xb-1]&&xb != tasks.length-1)
                    xb++;
                if(xb == tasks.length-1)
                    res[i] = '#';
                else res[i] = tasks[xb];
            }
            i++;
        }
        return i-n;
    }
    boolean jugde(char[] res,int i,char c,int n)
    {
        for(int temp = 1;temp<=n;temp++)
        {
            if(res[i-temp] == c)
                return false;
        }
        return true;
    }
}
*/
