package collection_FrameWork;

public class StudentMarks implements Comparable<StudentMarks>
{
    private int maths;
    private int physics;
    public String toString(){
        return "StudentMarks [maths="+maths+" , physics="+physics+ "]";
    }
        public int getMaths(){
            return maths;
        }
        public int getPhysics(){
            return physics;
        }
        public StudentMarks(int maths,int physics){
            this.maths=maths;
            this.physics=physics;
        }
        public int compareTo(StudentMarks sm) {
           //returns a negative integer if the argument
           // is greater than the object's value
           // returns 0 if the argument is equal to the object's value
           // returns a positive integer if the argument is less tha nthe object's value
            // if (this.maths < sm.getMaths()) return -1;
            // else if (this.maths == sm.getMaths()) {
            //     if (this.physics > sm.getPhysics()) return 1;
            //     else return 0;
            // }
            // else return 1;
            return sm.maths-this.maths;
        
    }
}

