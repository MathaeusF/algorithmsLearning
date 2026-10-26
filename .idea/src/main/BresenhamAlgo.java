package main;

import java.util.ArrayList;
import java.util.List;

public class BresenhamAlgo {
    public int xStart;
    public int yStart;
    public int xEnd;
    public int yEnd;
    public int deltaX;
    public int deltaY;

    public BresenhamAlgo(int xStart, int yStart, int xEnd, int yEnd) {
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
        this.deltaX = deltaX(this.xStart, this.xEnd);
        this.deltaY = deltaY(this.yStart, this.yEnd);
        startAlgo();
    }

    public List<int[]> startAlgo() {
        List<int[]> coordinats = new ArrayList<>();
        int x = this.xStart;
        int y = this.yStart;
        coordinats.add(new int[]{x, y});
        //schritte berechnen die größere deltazahl gleich anzahl an schritten
        int steps = (this.deltaX > this.deltaY) ? this.deltaX : this.deltaY;
        //Schrittrichtung schauen
        int stepX = (xStart < xEnd) ? 1 : -1;
        int stepY = (yStart < yEnd) ? 1 : -1;
        //ist Dx>Dy p0 = 2dy - dx sonst 2dx-dy
        if (this.deltaX > this.deltaY) {
            int p = 2 * this.deltaY - this.deltaX;
            for (int i = 0; i < this.deltaX; i++) {
                x += stepX;
                if (p >= 0) {
                    y += stepY;
                    p += 2 * (this.deltaY - this.deltaX);
                } else {
                    p += 2 * this.deltaY;
                }
                coordinats.add(new int[]{x, y});
            }
        } else {
            int p = 2 * this.deltaX - this.deltaY;
            for (int i = 0; i < this.deltaY; i++) {
                y += stepY;
                if (p >= 0) {
                    x += stepX;
                    p += 2 * (this.deltaX - this.deltaY);
                } else {
                    p += 2 * this.deltaX;
                }
                coordinats.add(new int[]{x, y});
            }
        }
        for (int i = 0; i < coordinats.size(); i++) {
            System.out.println("Punkt" + (i + 1) + ":" + coordinats.get(i)[0] + "|" + coordinats.get(i)[1]);
        }
        return coordinats;
    }

    public int deltaX(int x1, int x2) {
        if (x1 > x2)
            return x1 - x2;
        return x2 - x1;
    }

    public int deltaY(int y1, int y2) {
        if (y1 > y2)
            return y1 - y2;
        return y2 - y1;
    }

}
