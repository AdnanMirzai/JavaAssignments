public class Time {
    private int h,m,s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
        adjust();
    }

    public Time(int h, int m) {
        this.h = h;
        this.m = m;
        this.s = 0;
        adjust();
    }

    public int getS() {return s;}
    public int getH() {return h;}
    public int getM() {return m;}

    public void setTime(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
        adjust();
    }

    public void tic(int s) {
        this.s += s;
        adjust();
    }

    public void tic() {
        tic(1);
    }

    private void adjust() {
        m += s/60;
        h += m/60;
        s = s%60;
        m = m%60;
        h = h%24;
    }

   @Override
   public String toString() {
        return String.format("%02d", h) + ":" +
                String.format("%02d", m) + ":" +
                String.format("%02d", s);
   }
}
