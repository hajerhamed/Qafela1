package trade.hajer.qafela.firstphase.home.cells;

public class stores_data {
    public String store_title, ten_words, location_store;
    public int store_image;

    public stores_data() {

    }

    public stores_data(String store_title, String ten_words, String location_store) {
        this.store_title= store_title;
        this.ten_words = ten_words;
        this.location_store = location_store ;
    }

    public String getStore_title() {
        return store_title;
    }

    public void setStore_title(String store_title) {
        this.store_title = store_title;
    }

    public String getTen_words() {
        return ten_words;
    }

    public void setTen_words(String ten_words) {
        this.ten_words = ten_words;
    }

    public String getLocation_store() {
        return location_store;
    }

    public void setLocation_store(String location_store) {
        this.location_store = location_store;
    }

    public int getStore_image() {
        return store_image;
    }

    public void setStore_image(int store_image) {
        this.store_image = store_image;
    }


}

