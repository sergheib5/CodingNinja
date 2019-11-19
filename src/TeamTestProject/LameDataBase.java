package TeamTestProject;

public class LameDataBase {
    public static void main(String[] args) {

        System.out.println(lameDb("1test#2bla#3foo", "edit", "2", "bbb"));
    }

    static String lameDb(String db, String op, String id, String data) {
        switch (op) {
            case "add":
                return db + "#" + id + data;

            case "edit":
                for (int i = 0; i < db.length(); i++) {
                    if ((db.charAt(i) + "").equals(id)) {
                        int stop = db.indexOf("#", i);
                        if (stop < 0) {
                            stop = db.length();
                        }
                        db = db.replace(db.substring(i + 1, stop), data);
                        return db;
                    }

                }
                break;

            case "delete":
                for (int i = 0; i < db.length(); i++) {
                    if ((db.charAt(i) + "").equals(id)) {
                        int stop = db.indexOf("#", i);
                        if (stop < 0) {
                            i--;
                            stop = db.length() - 1;

                        }
                        db = db.replace(db.substring(i, stop + 1), "");
                        return db;
                    }

                }
        }

        return db;
    }


}
