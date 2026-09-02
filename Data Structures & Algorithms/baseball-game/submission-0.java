class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> ans = new Stack<>();
        int res = 0;
        for(String op: operations){
            if( op.equals("+")){
                int top = ans.pop();
                int newTop = top + ans.peek();
                ans.push(top);
                ans.push(newTop);
                res += newTop;
            }else if (op.equals("C")){
                res -= ans.pop();
            }else if (op.equals("D")){
                ans.push(2 * ans.peek());
                res += ans.peek();
            }else{
                ans.push(Integer.parseInt(op));
                res += ans.peek();
            }
        }
        return res;
        
        
    }
}