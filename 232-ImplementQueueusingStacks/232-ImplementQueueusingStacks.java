 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 * [1,2,3,4]
 *   q = [4,3,2,1]
 *   q = [1], tmp = []
 *   q = [2], tmp = [1]
 *   q = [2,1], tmp = []
 *   q = [3], tmp = [1,2] 
 *   q = [3,2,1]
 *   q = [4], tmp[1,2,3]
 *  tmp = []
 */
[
