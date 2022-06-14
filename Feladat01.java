public class Feladat01 {
    public int feladat01(String[] színek) {
        int n = színek.length;
        int nfakt = 1;
        int total = 0;

        for (int i = 1; i <= n; i++) {
            nfakt = nfakt * i;
        }

        for (int k = 2; k <= n; k++) {
            int n_k = n - k;

            int kfakt = 1;

            int n_kfakt = 1;

            for (int i = 1; i <= k; i++) {
                kfakt = kfakt * i;
            }

            for (int i = 1; i <= n_k; i++) {
                n_kfakt = n_kfakt * i;
            }

            total += nfakt / (kfakt * n_kfakt);
        }

        return total;
    }
}
