/**
 * TODO: ทำให้คลาสนี้เป็น Generic <K, V> ที่สามารถเก็บอ็อบเจกต์ได้ 2 ชนิด
 */
public class Pair<K,V> {
    // TODO: สร้างฟิลด์ private final สำหรับ key และ value
    private final K key;
    
    // TODO: สร้าง Constructor ที่รับ key และ value
    public Pair(K key){
        this.key = key;
    }

    // TODO: สร้าง Getters สำหรับ key และ value
    public K getKey(){
        return this.key;
    }
}