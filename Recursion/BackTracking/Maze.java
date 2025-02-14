import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {

        // count possible paths
        // System.out.println(pathCount(3, 3));

        // print paths
        // pathPrint("", 3, 3);

        // return ArrayList
        // System.out.println(pathRet("", 3, 3));

        // including digonals
        System.out.println(pathRetD("", 3, 3));

    }

    // with digonals
    static ArrayList<String> pathRetD(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ls = new ArrayList<>();
        if (c > 1 && r > 1) {
            ls.addAll(pathRetD(p + 'D', r - 1, c - 1));
        }
        if (r > 1) {
            ls.addAll(pathRetD(p + 'V', r - 1, c));
        }
        if (c > 1) {
            ls.addAll(pathRetD(p + 'H', r, c - 1));
        }
        return ls;
    }

    // paths return in ArrrayList
    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathRet(p + 'D', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(p + 'R', r, c - 1));
        }

        return list;
    }

    // Print paths
    static void pathPrint(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            pathPrint(p + 'D', r - 1, c);
        }
        if (c > 1) {
            pathPrint(p + 'R', r, c - 1);
        }
    }

    static int pathCount(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = pathCount(r - 1, c);
        int right = pathCount(r, c - 1);
        return left + right;
    }

}