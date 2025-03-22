package Tugas_Tugas;

public class TugasPertemuan7_PBO_StopWatchTest {
    public static void main(String[] args) {
        int n = 100000;
        int[] array = new int[n];

        // Mengisi array dengan angka acak
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100000);
        }

        TugasPertemuan7_PBO_StopWatch stopwatch = new TugasPertemuan7_PBO_StopWatch(); // Memulai stopwatch
        stopwatch.start();

        selectionSort(array);

        stopwatch.stop(); // Menghentikan stopwatch

        System.out.println("Waktu eksekusi selection sort: " + stopwatch.getElapsedTime() + " ms");
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
