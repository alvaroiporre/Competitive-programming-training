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

// public class User {

//     private static int MAX_RANK = 8, MAX_PROGRESS = 100;
//     private static Set<Integer> RANKS = new HashSet<Integer>( Arrays.asList(-8,-7,-6,-5,-4,-3,-2,-1, 1, 2, 3, 4, 5, 6, 7, 8) );
    
//     int rank, progress;
    
//     public User() {
//         rank = -8;
//         progress = 0;
//     }
    
//     public void incProgress(int kataRank) {
//         if (!RANKS.contains(kataRank)) throw new RuntimeException("Invalid rank");
//         int dRank = kataRank - rank + (rank > 0 ? 1:-1) * (kataRank*rank < 0 ? 1:0);
//         updateProgress(dRank > 0  ? 10 * dRank * dRank:
//                        dRank == 0 ? 3:
//                        dRank > -2 ? 1:0);
//     }
    
//     private void updateProgress(int p) {
//         int nLevel = (progress+p) / MAX_PROGRESS;
//         rank += nLevel + (RANKS.contains(rank+nLevel) ? 0:1);
//         progress = rank >= MAX_RANK ? 0 : (progress+p) % MAX_PROGRESS;
//     }
// }
