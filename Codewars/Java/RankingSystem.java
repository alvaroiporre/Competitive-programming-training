//https://www.codewars.com/kata/51fda2d95d6efda45e00004e

public class User {
  public int rank;
  public int pRank;
  public int progress;
  public User (){
      this.rank = -8;
      this.progress = 0;
      this.pRank = -8;
    
  }
  public void incProgress(int level) {
      if(level < -8 || level > 8 || level == 0) throw new IllegalArgumentException("Rank must be between -8 and 8, and it must be different to 0");
      int newProgress = 0;
      if( level > 0) level--;
      if(level == this.pRank ) newProgress = 3;
      else if(level < this.pRank && this.pRank - level == 1) newProgress = 1;
      else if(level > this.pRank) newProgress = (int)Math.pow(Math.abs(level - this.pRank), 2) * 10;
      
      this.progress += newProgress;
      if(this.progress >= 100) {
        if(this.pRank < 7){
          this.pRank += this.progress / 100;
          this.progress %= 100;
        }
      }
      if(this.pRank == 7) this.progress = 0; 
      if(this.pRank >= 0) this.rank = this.pRank + 1;
      else this.rank = this.pRank;
  }
}