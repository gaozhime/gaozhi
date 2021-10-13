package Study.Exceptions;

import org.apache.poi.poifs.filesystem.POIFSWriterEvent;

import java.util.Random;

public class RadiuCalc {
    public RadiuCalc(double r) {
        if (r <= 0)
            throw new MyselfException("圆的半径必须为正数;");
        else
            System.out.println("半径为:" + r + "圆的面积为:" + Math.PI * Math.pow(r, 2));
    }

    public static void main(String[] args) {
        try {
            new RadiuCalc(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("圆的半径有误");
            Random rd = new Random(1);
            double rn = (rd.nextDouble() + 1) * 10;

            new RadiuCalc(rn);
        }
    }
}
